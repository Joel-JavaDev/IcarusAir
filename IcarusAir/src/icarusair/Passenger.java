package icarusair;

import enumerators.Title;

/**
 * Klass för passagerare med konstruktor samt getter och setter metoder.
 * 
 * @author	Joel D
 * @version	1.1
 * @since	2016-07-12
 * 
 * @Uppd	v1.1	Lagt till variabler för att hålla reda på om flygbokning är gjord [JD] 
 */
public class Passenger {
	
	private Title title;
	private String firstName;
	private String lastName;
	private String nationality;
	private String passportNumber;
	private long creditCard;
	private boolean hasFlightBookings;
	private int flightBookingNumber;	// TODO array?
	
	public Passenger(int titleType, String fName, String lName, String ppNumber, String nationality, long ccNumber) {
		setTitle(titleType);
		this.firstName = fName;
		this.lastName = lName;
		this.nationality = nationality;
		this.passportNumber = ppNumber;
		this.creditCard = ccNumber;
		this.hasFlightBookings = false;
		this.flightBookingNumber = 0;
	}


	public Title getTitle() {
		return title;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPassport() {
		return passportNumber;
	}
	
	public long getCreditCard() {
		return creditCard;
	}
	
	public String getNationality() {
		return nationality;
	}

	public boolean getHasFlightBooking() {
		return hasFlightBookings;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPassport(String id) {
		this.passportNumber = id;
	}
	
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setHasFlightBooking(boolean hasFlightBooking) {
		this.hasFlightBookings = hasFlightBooking;
	}


	@SuppressWarnings("static-access")
	public void setTitle(int titleType) {
		switch (titleType) {
			case 1:
				title = title.Mr;
				break;	
			case 2:
				title = title.Mrs;
				break;
			case 3:
				title = title.Ms;
				break;
			case 4:
				title = title.Dr;
				break;
		}
	}
	
	
	public String getFullname(){
		return (getTitle() + ". " + getLastName() + ", " + getFirstName());
	}
}
