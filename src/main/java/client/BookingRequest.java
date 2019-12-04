package client;

import booking.Destination;
import booking.MealType;

public class BookingRequest {

	private String clientId;
	private String date;
	private String flightName;
	private String row;
	private int seat;
	private MealType meal;
	private int price;
	private Destination destination;

	public BookingRequest(String clientId, String date, String flightName, String row, int seat, MealType meal, int price, Destination destination) {

		this.clientId = clientId;
		this.date = date;
		this.flightName = flightName;
		this.row = row;
		this.seat = seat;
		this.meal = meal;
		this.price = price;
		this.destination = destination;
	}

	public String getClientId() {
		return clientId;
	}

	public String getDate() {
		return date;
	}

	public String getFlightName() {
		return flightName;
	}

	public String getRow() {
		return row;
	}

	public int getSeat() {
		return seat;
	}

	public MealType getMeal() {
		return meal;
	}

	public int getPrice() {
		return this.price;
	}

	public Destination getDestination() {

		return this.destination;
	}

}
