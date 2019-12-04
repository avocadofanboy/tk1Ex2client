package client;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BookingSelectedContentPane extends JPanel implements ActionListener {

	private ClientWindow parent;
	public BookingSelectedContentPane(ClientWindow parent) {
		
		this.parent = parent;
		setLayout(null);
		
		JLabel lblThanksYourBooking = new JLabel("Thanks! Your booking was added to your shopping cart.");
		lblThanksYourBooking.setBounds(48, 37, 353, 16);
		add(lblThanksYourBooking);
		
		JButton btnBackToStart = new JButton("Back to start");
		btnBackToStart.setBounds(166, 122, 117, 29);
		btnBackToStart.addActionListener(this);
		add(btnBackToStart);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		parent.onRestart();
	}
	
}
