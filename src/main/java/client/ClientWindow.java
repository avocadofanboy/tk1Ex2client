package client;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import booking.BookingService;
import booking.Destination;
import booking.Flight;
import booking.FlightModel;
import booking.MealType;

public class ClientWindow extends JFrame implements ActionListener {
	private JTextField textField;
	private BookingService port;
	private String clientId;
	private List<BookingRequest> shoppingCart;
	public ClientWindow(BookingService port) {

		this.shoppingCart = new ArrayList<BookingRequest>();
		this.port = port;
		
		getContentPane().setLayout(null);
		
		JLabel lblWelcomePleaseEnter = new JLabel("Welcome! Please enter your customer name.");
		lblWelcomePleaseEnter.setBounds(42, 23, 327, 16);
		getContentPane().add(lblWelcomePleaseEnter);
		
		textField = new JTextField();
		textField.setBounds(42, 74, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnOkayy = new JButton("Okayy");
		btnOkayy.setBounds(196, 74, 117, 29);
		getContentPane().add(btnOkayy);
		btnOkayy.addActionListener(this);

		this.setMinimumSize(new Dimension(800, 400));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		String name = textField.getText();
		if (name != null && !name.isEmpty()) {
			this.clientId = port.login(name);
			this.setTitle(clientId);
			this.switchToFlightSelection();
		}
	}
	private void switchToFlightSelection() {
		FlightModel flights = port.getFlights();
		this.setContentPane(new FlightSelectionContentPane(flights, this));
		this.revalidate();
		this.pack();
	}
	public void onFlightSelected(Flight selectedFlight, String date) {
		this.setContentPane(new SeatSelectionContentPane(selectedFlight, date, this));
		this.revalidate();
		this.pack();
	}
	
	public void onSeatSelected(String flightName, String date, String row, int seat, int price, Destination destination) {
		this.setContentPane(new MealSelectionContentPane(flightName, date, row, seat, price, destination, this));
		this.revalidate();
		this.pack();
	}
	
	public void onBookingSelected(String flightName, String date, String row, int seat, MealType meal, int price, Destination destination) {
		
		this.shoppingCart.add(new BookingRequest(this.clientId, date, flightName, row, seat, meal, price, destination));
		this.setContentPane(new BookingSelectedContentPane(this));
		this.revalidate();
		this.pack();
	}
	
	public void onBookingRequested(String flightName, String date, String row, int seat, MealType meal, int price) {
		
		boolean success = this.port.bookSeat(this.clientId, date, flightName, row, seat, meal);
		if (success) {
			this.setContentPane(new BookingSuccessfulContentPane(date, flightName, row, seat, price, this));
		} else {
			this.setContentPane(new BookingUnsuccessfulContentPane(date, flightName, row, seat, this));
		}
		this.revalidate();
		this.pack();
	}
	public void onRestart() {

		this.switchToFlightSelection();
	}
	public int getSelectedBookingsCount() {
		return shoppingCart.size();
	}
	public void onShowShoppingCart() {
		this.setContentPane(new ShoppingCartContentPane(shoppingCart, this));
		this.revalidate();
		this.pack();
	}
}
