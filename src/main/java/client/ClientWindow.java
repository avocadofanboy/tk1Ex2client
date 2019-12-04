package client;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import booking.BookingService;
import booking.Flight;
import booking.FlightModel;
import booking.Seat;

public class ClientWindow extends JFrame implements ActionListener {
	private JTextField textField;
	private BookingService port;
	private String clientId;
	public ClientWindow(BookingService port) {

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
	
	public void onSeatSelected(String flightName, String date, String row, int seat) {
		boolean success = this.port.bookSeat(this.clientId, date, flightName, row, seat);
		if (success) {
			this.setContentPane(new BookingSuccessfulContentPane(date, flightName, row, seat, this));
		} else {
			this.setContentPane(new BookingUnsuccessfulContentPane(date, flightName, row, seat, this));
		}
		this.revalidate();
		this.pack();
	}
	public void onRestart() {

		this.switchToFlightSelection();
	}
}
