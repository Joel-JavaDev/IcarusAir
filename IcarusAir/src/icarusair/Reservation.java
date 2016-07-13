package icarusair;
import java.util.Date;
import enumerators.*;

/**
 * 
 * @author	Mats Samuelson, Joel Delgado
 * @version	1.1
 * @since	2016-07-13
 * 
 * @Uppd	v1.1	deklarerat metodvariabler
 *
 */
public class Reservation {
	
	// TODO Mats: Lägg till SAMTLIGA variabler som behövs för att få klassen att fungera
	
	private double price;
	private Date date;

	
	public boolean isAvailable() {
		boolean isAvailable = false;
		// TODO Mats: Utveckla metoden
		return isAvailable;
	}
	
	public String assignSeat() {
		String seat = null;
		// TODO Mats: Utveckla metoden
		return seat;
	}
	
	public String addLuggage() {
		String luggage = null;
		// TODO Mats: Utveckla metoden
		return luggage;
	}
	
	public String addMeal() {
		String meal = null;
		// TODO Mats: Utveckla metoden
		return meal;
	}
	
	public String createTicket() {
		String ticketCreated = null;
		// TODO Mats: Utveckla metoden
		return ticketCreated;
	}
	
	public String printTicket() {
		String ticketPrinted = null;
		// TODO Mats: Utveckla metoden
		return ticketPrinted;
	}
	
	public void updateCounter() {
		// TODO Mats: Utveckla metoden och gör koppling till klassen ReservationCounter
	}
}
