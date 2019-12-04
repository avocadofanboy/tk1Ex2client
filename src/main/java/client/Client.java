package client;

import booking.BookingService;
import booking.BookingServiceImplService;

public class Client {
	
	public static void main(String[] args) {
	   
		BookingServiceImplService bookingService = new BookingServiceImplService();
		BookingService port = bookingService.getBookingServiceImplPort();
		
		new ClientWindow(port);
		
    }

}