package client;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import booking.Flight;
import booking.Plane;
import booking.Plane.Seats.Entry;
import booking.Seat;
import booking.SeatType;

public class SeatListPanel extends JPanel implements ActionListener {
	
	private List<JButton> buttons;
	private Flight flight;
	private ClientWindow parent;
	private String date;
	private List<Seat> seats;
	
	public SeatListPanel(Flight flight, String date, ClientWindow parent) {
		
		
		this.flight = flight;
		this.date = date;
		this.parent = parent;
		this.setPreferredSize(new Dimension(4300, 500));
		
		this.buttons = new ArrayList<JButton>();
		
			
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		int xPosition = 6;
		int yPosition = 5;
		int width = 80;
		int height = 60;
		int rowWidth = 4000;
		int rowHeight = 50;
		List<Entry> rows = new ArrayList<Plane.Seats.Entry>(flight.getPlane().getSeats().getEntry());
		Collections.reverse(rows);
		for (Entry e : rows) {
			String rowName = e.getKey();
			JPanel row = new JPanel();
			row.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			this.seats = e.getValue().getItem();
			for (Seat seat : seats) {
			
				boolean enabled = false;
				String title;
				if (seat == null || seat.getSeatType() == SeatType.NONE) {
					title = "X";
				} else if (seat.getBooking() != null) {
					title = "booked";
				} else {
					title = "<html>" + rowName + seats.indexOf(seat) + "<br />" + getSeatClassString(seat.getSeatType()) + "<br /> (" + (flight.getDestination().getBasePriceInCents() + getSeatPrice(flight, seat)) / 100 + "€)</html>";
					enabled = true;
				}
				JButton button = new JButton(title);
				button.setFont(new Font("Arial", Font.PLAIN, 10));
				button.setEnabled(enabled);
				button.setBounds(xPosition, 5, width, height);
				button.setPreferredSize(new Dimension(width, height));
				row.add(button);
				if (enabled) {

					button.addActionListener(this);
					button.setActionCommand(rowName + seats.indexOf(seat));
				}
				buttons.add(button);
				
				xPosition += (width + 10);
			}
			row.setBounds(20, yPosition, rowWidth, rowHeight);
			add(row);
			yPosition += rowHeight;
		}
		
	}

	private String getSeatClassString(SeatType seatType) {
		switch (seatType) {
		case FIRST_CLASS:
			return "FC";
		case ECONOMY_CLASS:
			return "EC";
		case ECONOMY_PLUS_CLASS:
			return "EC+";
		default:
			return "";
		}
	}

	private int getSeatPrice(Flight f, Seat seat) {
		switch (seat.getSeatType()) {
		case FIRST_CLASS:
			return f.getDestination().getBasePriceInCents() + f.getPlane().getFirstClassBasePriceInCents();
		case ECONOMY_CLASS:
			return f.getDestination().getBasePriceInCents() + f.getPlane().getEconomyClassBasePriceInCents();
		case ECONOMY_PLUS_CLASS:
			return f.getDestination().getBasePriceInCents() + f.getPlane().getEconomyPlusClassBasePriceInCents();
		default:
			return 0;
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String row = e.getActionCommand().substring(0, 1);
		int seat = Integer.valueOf(e.getActionCommand().substring(1));
		parent.onSeatSelected(this.flight.getName(), date, row, seat, (this.flight.getDestination().getBasePriceInCents() + getSeatPrice(this.flight, seats.get(seat))), this.flight.getDestination());
	}

	
}
