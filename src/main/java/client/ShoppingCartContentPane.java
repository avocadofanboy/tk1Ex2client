package client;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import booking.Booking;
import booking.Flight;

public class ShoppingCartContentPane extends JPanel implements ActionListener {
	
	private List<BookingRequest> shoppingCart;
	private ClientWindow parent;

	public ShoppingCartContentPane(List<BookingRequest> shoppingCart, ClientWindow parent) {

		this.shoppingCart = shoppingCart;
		this.parent = parent;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shopping cart");
		lblNewLabel.setBounds(170, 6, 119, 16);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back to start");
		btnNewButton.setBounds(327, 1, 117, 29);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("back");
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		JPanel listPanel = new JPanel();
		listPanel.setPreferredSize(new Dimension(750, 2200));
		scrollPane.setViewportView(listPanel);
		listPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		int yPosition = 5;
		int width = 700;
		int height = 29;
		for (int i = 0; i < shoppingCart.size(); i++) {
			
			BookingRequest br = shoppingCart.get(i);
			JButton button = new JButton("Flight " + br.getFlightName() + " to " + br.getDestination().getName() +  ", date: " + br.getDate() + " (total price: " + (br.getPrice()/100) + " €)");
			button.setBounds(6, yPosition, width, height);
			button.setPreferredSize(new Dimension(width, height));
			listPanel.add(button);
			button.addActionListener(this);
			button.setActionCommand("" + i);
			
			yPosition += height;
		}

		scrollPane.setBounds(6, 40, 800, 254);
		add(scrollPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "back":
			parent.onRestart();
			break;
		default:
			int index = Integer.valueOf(e.getActionCommand());
			BookingRequest booking = shoppingCart.get(index);
			shoppingCart.remove(index);
			parent.onBookingRequested(booking.getFlightName(), booking.getDate(), booking.getRow(), booking.getSeat(), booking.getMeal(), booking.getPrice());
			break;
		}
	}

}
