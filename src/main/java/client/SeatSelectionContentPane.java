package client;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import booking.Flight;

public class SeatSelectionContentPane extends JPanel {
	public SeatSelectionContentPane(Flight flight, String date, ClientWindow parent) {
		
		
		setLayout(null);
		
		JLabel lblAvailableSeats = new JLabel("Available seats");
		lblAvailableSeats.setBounds(6, 6, 112, 16);
		add(lblAvailableSeats);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		SeatListPanel seatListPanel = new SeatListPanel(flight, date, parent);
		scrollPane.setViewportView(seatListPanel);
		seatListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		scrollPane.setBounds(6, 40, 800, 330);
		add(scrollPane);
		
	}
}
