package client;

import javax.swing.JPanel;

import booking.Destination;
import booking.MealType;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MealSelectionContentPane extends JPanel implements ActionListener {

	private String flightName;
	private String date;
	private String row;
	private int seat;
	private ClientWindow parent;
	private int price;
	private Destination destination;

	public MealSelectionContentPane(String flightName, String date, String row, int seat, int price, Destination destination, ClientWindow parent) {
		this.flightName = flightName;
		this.date = date;
		this.row = row;
		this.seat = seat;
		this.price = price;
		this.destination = destination;
		this.parent = parent;
		setLayout(null);
		
		JLabel lblSelectYourMeal = new JLabel("Select your meal");
		lblSelectYourMeal.setBounds(183, 26, 103, 16);
		add(lblSelectYourMeal);
		
		JButton btnNewButton = new JButton("Standard");
		btnNewButton.setActionCommand("Standard");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(22, 138, 117, 29);
		add(btnNewButton);
		
		JButton btnVegetarian = new JButton("Vegetarian");
		btnVegetarian.setActionCommand("Vegetarian");
		btnVegetarian.addActionListener(this);
		btnVegetarian.setBounds(151, 138, 117, 29);
		add(btnVegetarian);
		
		JButton btnVegan = new JButton("Vegan");
		btnVegan.setActionCommand("Vegan");
		btnVegan.addActionListener(this);
		btnVegan.setBounds(280, 138, 117, 29);
		add(btnVegan);
		
		JLabel lblNewLabel = new JLabel("The reservation will be added to your shopping cart.");
		lblNewLabel.setBounds(48, 226, 346, 16);
		add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		MealType type;
		switch (e.getActionCommand()) {
		case "Standard":
			type = MealType.STANDARD;
			break;
		case "Vegetarian":
			type = MealType.VEGETARIAN;
			break;
		case "Vegan":
			type = MealType.VEGAN;
			break;

		default:
			type = MealType.STANDARD;
			break;
		}
		parent.onBookingSelected(flightName, date, row, seat, type, price, destination);
	}

	
}
