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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingSuccessfulContentPane extends JPanel {

	private ClientWindow parent;
	public BookingSuccessfulContentPane(String date, String flightName, String row, int seat, int price, ClientWindow parent) {
		setLayout(null);

		this.parent = parent;
		
		JLabel lblCongratsYourFlight = new JLabel("Congrats! " + flightName + " was booked successfully for €" + (price/100) + ".");
		lblCongratsYourFlight.setBounds(6, 6, 438, 48);
		add(lblCongratsYourFlight);
		
		JButton btnBackToStart = new JButton("Back to Start");
		btnBackToStart.setBounds(165, 194, 117, 29);
		btnBackToStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BookingSuccessfulContentPane.this.parent.onRestart();
			}
		});
		add(btnBackToStart);

	}
}
