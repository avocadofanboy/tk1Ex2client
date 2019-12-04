package client;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import booking.DaySchedule;
import booking.Flight;
import booking.FlightModel;

public class FlightListPanel extends JPanel implements ActionListener {
	
	private List<JButton> buttons;
	private FlightModel flights;
	private ClientWindow parent;
	
	public FlightListPanel(FlightModel flights, ClientWindow parent) {
		
		this.parent = parent;
		this.flights = flights;
		this.setPreferredSize(new Dimension(750, 2200));
		
		this.buttons = new ArrayList<JButton>();
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		int yPosition = 5;
		int width = 700;
		int height = 29;
		for (int i = 0; i < 63; i++) {

			Flight f = getFlight(getDay(flights, i), i);
			JButton button = new JButton("Flight " + f.getName() + " to " + f.getDestination().getName() + " (" + f.getPlane().getName() + ", prices from " + ((f.getPlane().getEconomyClassBasePriceInCents() + f.getDestination().getBasePriceInCents()) / 100) + " €)");
			button.setBounds(6, yPosition, width, height);
			button.setPreferredSize(new Dimension(width, height));
			add(button);
			button.addActionListener(this);
			button.setActionCommand("" + i);
			buttons.add(button);
			
			yPosition += height;
		}
	}

	private Flight getFlight(DaySchedule day, int i) {
		
		switch (i % 9) {
		case 0:
			return day.getFlight1();
		case 1:
			return day.getFlight2();
		case 2:
			return day.getFlight3();
		case 3:
			return day.getFlight4();
		case 4:
			return day.getFlight5();
		case 5:
			return day.getFlight6();
		case 6:
			return day.getFlight7();
		case 7:
			return day.getFlight8();
		case 8:
			return day.getFlight9();
		default:
			return null;
		}
	}

	private DaySchedule getDay(FlightModel flights, int i) {

		switch ((int) Math.floor(i / 9)) {
		case 0:
			return flights.getDay1();
		case 1:
			return flights.getDay2();
		case 2:
			return flights.getDay3();
		case 3:
			return flights.getDay4();
		case 4:
			return flights.getDay5();
		case 5:
			return flights.getDay6();
		case 6:
			return flights.getDay7();
		default:
			return null;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i = Integer.parseInt(e.getActionCommand());
		Flight selectedFlight = getFlight(getDay(flights, i), i);
		parent.onFlightSelected(selectedFlight, getDay(flights, i).getDate());
	}

	
}
