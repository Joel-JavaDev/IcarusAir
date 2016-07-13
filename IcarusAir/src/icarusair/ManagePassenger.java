package icarusair;

import java.util.ArrayList;


/**
 * Klass för att hantera passagerare
 * 
 * @author		Joel Delgado
 * @version		1.1
 * @since		2016-07-12
 * 
 * @Uppd	v1.1	Skappat addPassenger-metod + möjlighet att lägga till passagerare i en lista
 */
public class ManagePassenger {
	static String outputText = "";		// text som beskriver typ av inmatning som önskas
	public static PassengerCatalog passCat = new PassengerCatalog();
	//passCat = new Passenger

	
	/**
	 * Metod för att lägga till passagerare 
	 * Användaren matar via konsoln in titel, förnamn, efternamn, pass, nationalitet, och kreditkortsnummer.
	 */
	public static void addPassenger(){
		int regTitle;
		final int MIN_NAME_LETTERS = 2;
		final int MIN_NATIONALITY_LETTERS = 3;
		
		System.out.println("REGISTRERA PASSAGERARE...");
		boolean exitLoop = false;
		do {
			outputText = "Ange titel (1=Mr, 2=Mrs, 3=Ms, 4=Dr, 5=Jr) : ";
			regTitle = UserInput.userInputInt(outputText);
			if (regTitle >= 1 && regTitle <= 5)
				exitLoop = true;
			else
				System.out.println(">>> Fel inmatning! Endast titel nr 1-5 är godkänt. Försök igen.... <<< \n");
		} while (!exitLoop);
		outputText = "Ange förnamn: ";
		String regFirstName = UserInput.userInputString(outputText);
		outputText = "Ange efternamn: ";
		String regLastName = UserInput.userInputString(outputText);
		outputText = "Ange passnummer: ";
		String regPassNumber = UserInput.userInputString(outputText);
		outputText = "Ange nationalitet: ";
		String regNationality = UserInput.userInputString(outputText);
		outputText = "Ange kreditkortsnummer: ";
		// TODO ändra till String + skapa metod som checkar att det är 16 siffror som anges
		long regCreditCardNumber = UserInput.userInputLong(outputText);
		if(passCat.searchPassengerPassport(regPassNumber)){
			System.out.println(">>> OBS: Det finns redan en passagerare med samma passnummer! Passagerare EJ tillagd. Försök igen.... <<< \n");
		} else {
			Passenger passenger = new Passenger(regTitle, regFirstName, regLastName, regPassNumber, regNationality, regCreditCardNumber);
			passCat.addPassenger(passenger);
//			passCat.addPassenger(new Passenger(regTitle, regFirstName, regLastName, regPassNumber, regNationality, regCreditCardNumber));
			//TODO hämta ut namn från arraylista och ej objekt
			System.out.println(">>> Registrerat passagerare: " + passenger.getFullname() + " <<<");
		}
		
		
	}
	
	

}
