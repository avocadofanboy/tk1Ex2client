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

public class FlightSelectionContentPane extends JPanel {
	public FlightSelectionContentPane(FlightModel flights, ClientWindow parent) {
		
		
		setLayout(null);
		
		JLabel lblAvailableFlights = new JLabel("Available flights");
		lblAvailableFlights.setBounds(6, 6, 112, 16);
		add(lblAvailableFlights);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		FlightListPanel flightListPanel = new FlightListPanel(flights, parent);
		scrollPane.setViewportView(flightListPanel);
		flightListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		scrollPane.setBounds(6, 40, 800, 254);
		add(scrollPane);
		
	}
}
