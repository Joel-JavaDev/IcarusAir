package icarusair;

import enumerators.Title;

public class Passenger {
	
	private Title title;
	private String firstName;
	private String lastName;
	private String nationality;
	private String passportNumber;
	private long creditCard;
	
	public Passenger(int titleType, String fName, String lName, String ppNumber, String nationality, long ccNumber) {
		setTitle(titleType);
		this.firstName = fName;
		this.lastName = lName;
		this.nationality = nationality;
		this.passportNumber = ppNumber;
		this.creditCard = ccNumber;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

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
