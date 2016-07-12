package icarusair;
import java.util.ArrayList;

import enumerators.Title;

/**
 * Klass för att hantera passagerare
 * 
 * @author		Joel Delgado
 * @version		1.0
 * @since		2016-07-12
 * 
 * @Uppd		
 */
public class ManagePassenger {
	static String outputText = "";		// text som beskriver typ av inmatning som önskas
	

	/**
	 * Metod för att lägga till passagerare 
	 * Användaren matar via konsoln in titel, förnamn, efternamn, pass, nationalitet, och kreditkortsnummer.
	 */
	public static void addPassenger(){
		Title title = null;
		int regTitle;
		System.out.println("REGISTRERA PASSAGERARE...");
		boolean exitLoop = false;
		do {
			outputText = "Ange titel (1=Mr, 2=Mrs, 3=Ms, 4=Dr) : ";
			regTitle = UserInput.userInputInt(outputText);
			if (regTitle >= 1 && regTitle <= 4)
				exitLoop = true;
			else
				System.out.println(">>> Fel inmatning! Endast titel nr 1-4 är godkänt. Försök igen.... <<< \n");
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
		long regCreditCardNumber = UserInput.userInputLong(outputText);
		
		Passenger passenger = new Passenger(regTitle, regFirstName, regLastName, regPassNumber, regNationality, regCreditCardNumber);
		
		
		System.out.println(">>> Registrerat passagerare: " + passenger.getFullname() + " <<<");
	}
	
	

}
