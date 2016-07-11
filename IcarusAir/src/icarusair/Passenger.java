package icarusair;

import enumerators.Title;

public class Passenger {
	
	private Title title;
	private String firstName;
	private String lastName;
	private String nationality;
	private String idNumb;
	private int creditCard;
	
	public Passenger(Title title, String firstName, String lastName, String nationality, String id, int creditCard) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.idNumb = id;
		this.creditCard = creditCard;
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
	
	public String getId() {
		return idNumb;
	}
	
	public int getCreditCard() {
		return creditCard;
	}
	
	public void setTitle(Title title) {
		this.title = title;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setId(String id) {
		idNumb = id;
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

}
