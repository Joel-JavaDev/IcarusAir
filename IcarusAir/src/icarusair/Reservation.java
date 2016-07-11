package icarusair;
import java.util.Date;

public class Reservation {
	
	private double price;
	private Date date;
	public enum Destination {
	    Stockholm, Gothemburg, Kiruna, Sundsvall,
	    Malm�; 
	}
	public enum Class {
	    FirstClass, EconomyClass;
		
	}
	public String registerPassenger() {
		return Passenger;
	}
	
	public String isAvailable() {
		return isAvailable;
	}
	public String assignSeat() {
		return Seat;
	}
	public String addLuggage() {
		return Luggage;
	}
	public String addMeal() {
		return Meal;
	}
	public String createTicket() {
		return Ticket;
	}
	public String printTicket() {
		return Ticket;
	}
	public String updateCounter() {
		return Counter;
	}
}
