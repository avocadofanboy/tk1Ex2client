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

public class FlightSelectionContentPane extends JPanel implements ActionListener {
	
	private ClientWindow parent;
	
	public FlightSelectionContentPane(FlightModel flights, ClientWindow parent) {
		
		this.parent = parent;
		setLayout(null);
		
		JLabel lblAvailableFlights = new JLabel("Available flights");
		lblAvailableFlights.setBounds(6, 6, 112, 16);
		add(lblAvailableFlights);
		
		int selectedBookings = parent.getSelectedBookingsCount();
		JButton btnShoppingCart = new JButton("Shopping cart (" + selectedBookings + ")");
		btnShoppingCart.setEnabled(selectedBookings != 0);
		btnShoppingCart.setBounds(500, 6, 112, 16);
		btnShoppingCart.addActionListener(this);
		add(btnShoppingCart);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		FlightListPanel flightListPanel = new FlightListPanel(flights, parent);
		scrollPane.setViewportView(flightListPanel);
		flightListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		scrollPane.setBounds(6, 40, 800, 254);
		add(scrollPane);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		parent.onShowShoppingCart();
	}
}
