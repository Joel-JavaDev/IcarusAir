package icarusair;
/**
 * Klass för litet flygplan. 
 * 
 * @author		Joel Delgado
 * @version		1.0
 * @since		2016-07-11
 */
public class SmallAirPlane extends Airplane {
	
	final int numbFirstClassSeats = 4;
	final int numbEconomyClassSeats = 6;
	static double operatingCost = 200000;
	double fuelUsage = 15000;
	final String Flightnumber = "IA-S101";
	
	
	public int getNumbFirstClassSeats() {
		return numbFirstClassSeats;
	}
	public int getNumbEconomyClassSeats() {
		return numbEconomyClassSeats;
	}
	
	public static double getOperatingCost() {
		return operatingCost;
	}
	
	public static double getFuelUsage() {
		return fuelCost;
	}
	
	public String getFlightnumber() {
		return Flightnumber;
	}
	
/**
 * Beräknar antalet säten i planet genom att addera antal första klass och ekonomiklass 
 * 
 * @return	numberOfSeats	totala antalet säten
 */
	public int getNumberOfSeats() {
		int numberOfSeats = (getNumbFirstClassSeats() + getNumbEconomyClassSeats());
		return numberOfSeats;
	}
	
	
	/**
	 * Beräknar totalbränslekostnad = flygplanets egna bränsleförbrukning + kostnad för varje enskild passagerare + kostnad för varje kilo bagage
	 * 
	 * @return	totalFuelCost	den totala bränslekostnaden
	 */
	public static double calculateTotalFuelCost(){
		int numbPassengers = 10;
		int luggageWeight = 20;
		double totalFuelCost = ((getFuelUsage() *10) + (100*numbPassengers + 25*luggageWeight*numbPassengers));
		return totalFuelCost;
	}
	
	
	
	/**
	 * Beräknar totalkostnad = flygplanets operationskostnad + totalbränslekostnad
	 * 
	 * @return	totalOperatingCost	
	 */
	public static double totalOperatingCost(){
		double totalOperatingCost = getOperatingCost() + calculateTotalFuelCost(); 
		return totalOperatingCost;
	}

}
