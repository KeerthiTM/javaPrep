import java.util.*;
public class Main {
		public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  TravelApp app = new TravelApp();
			  boolean running = true;
			  while (running) {
			      System.out.println("Select an action:");
			      System.out.println("1. Search flights");
			      System.out.println("2. Search hotels");
			      System.out.println("3. Book a flight");
			      System.out.println("4. Book a hotel");
			      System.out.println("5. Cancel a reservation");
			      System.out.println("6. Exit");

			      int choice = sc.nextInt();

			      switch (choice) {
			          case 1:
			              System.out.println("Enter source city:");
			              String sourceCity = sc.next();
			              System.out.println("Enter destination city:");
			              String destinationCity = sc.next();
			              System.out.println("Enter departure date (yyyy-MM-dd):");
			              String departureDate = sc.next();
			              System.out.println("Enter number of passengers:");
			              int passengers = sc.nextInt();
			              app.searchFlights(sourceCity, destinationCity, departureDate, passengers);
			              break;
			          case 2:
			              System.out.println("Enter city:");
			              String city = sc.next();
			              System.out.println("Enter check-in date (yyyy-MM-dd):");
			              String checkInDate = sc.next();
			              System.out.println("Enter check-out date (yyyy-MM-dd):");
			              String checkOutDate = sc.next();
			              System.out.println("Enter number of rooms:");
			              int rooms = sc.nextInt();
			              app.searchHotels(city, checkInDate, checkOutDate, rooms);
			              break;
			          case 3:
			              System.out.println("Enter Flight number:");
			              int flightNumber = sc.nextInt();
			              System.out.println("Enter passenger name:");
			              String passengerName = sc.next();
			              System.out.println("Enter source city:");
			              String flightSourceCity = sc.next();
			              System.out.println("Enter destination city:");
			              String flightDestinationCity = sc.next();
			              System.out.println("Enter departure date (yyyy-MM-dd):");
			              String flightDepartureDate = sc.next();
			              System.out.println("Enter number of passengers:");
			              int flightPassengers = sc.nextInt();
			              System.out.println("Enter ticket price:");
			              double ticketPrice = sc.nextDouble();
			              app.bookFlight(flightNumber, passengerName, flightSourceCity, flightDestinationCity,
			                      flightDepartureDate, flightPassengers, ticketPrice);
			              break;
			          case 4:
			              System.out.println("Enter reservation number:");
			              int hotelIdNumber = sc.nextInt();
			              System.out.println("Enter guest name:");
			              String guestName = sc.next();
			              System.out.println("Enter city:");
			              String hotelCity = sc.next();
			              System.out.println("Enter check-in date (yyyy-MM-dd):");
			              String hotelCheckInDate = sc.next();
			              System.out.println("Enter check-out date (yyyy-MM-dd):");
			              String hotelCheckOutDate = sc.next();
			              System.out.println("Enter number of rooms:");
			              int hotelRooms = sc.nextInt();
			              System.out.println("Enter room price:");
			              double roomPrice = sc.nextDouble();
			              app.bookHotel(hotelIdNumber, guestName, hotelCity, hotelCheckInDate,
			                      hotelCheckOutDate, hotelRooms, roomPrice);
			              break;
			          case 5:
			              System.out.println("Enter reservation number to cancel:");
			              int reservationNumber = sc.nextInt();
			              app.cancelReservation(reservationNumber);
			              break;
			          case 6:
			              running = false;
			              System.out.println("Exiting the program...");
			              break;
			          default:
			              System.out.println("Invalid choice");
			              break;
			      }
			  }

			  sc.close();

	  }

}
