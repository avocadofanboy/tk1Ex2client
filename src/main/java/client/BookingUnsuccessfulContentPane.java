package client;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import booking.FlightModel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingUnsuccessfulContentPane extends JPanel {

	private ClientWindow parent;
	
	public BookingUnsuccessfulContentPane(String date, String flightName, String row, int seat, ClientWindow parent) {
		setLayout(null);
		
		this.parent = parent;
		JLabel lblCongratsYourFlight = new JLabel("Sorry, the booking could not be completed! Yor seat " + row + seat + " on flight " + flightName + " might have already been booked by another passenger.");

		lblCongratsYourFlight.setFont(new Font("Arial", Font.PLAIN, 9));
		lblCongratsYourFlight.setBounds(6, 6, 599, 48);
		add(lblCongratsYourFlight);
		
		JButton btnBackToStart = new JButton("Back to Start");
		btnBackToStart.setBounds(165, 194, 117, 29);
		btnBackToStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BookingUnsuccessfulContentPane.this.parent.onRestart();
			}
		});
		add(btnBackToStart);

	}
}
