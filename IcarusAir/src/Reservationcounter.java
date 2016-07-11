/**
 *  Räknare som håller reda på antalet passagerare och bagagevikt. 
 * 
 * @author		Joel Delgado
 * @version		1.0
 * @since		2016-07-11
 */
public class Reservationcounter {
	private static int numberOfPassengers = 0;
	private static int weightOfLuggage = 0;
	
	public Reservationcounter( int passengers, int luggage) {
		addPassenger(passengers);
		addLuggage(luggage);
	}

	public void addLuggage(int luggage) {
		weightOfLuggage += luggage;
	}

	public void addPassenger(int passengers) {
		numberOfPassengers += passengers; 
	}
	
	public int luggageWeight(){
		return weightOfLuggage;
	}

	public int passengerNumber(){
		return numberOfPassengers;
	}
	
	
}
