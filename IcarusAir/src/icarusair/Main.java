package icarusair;

import menu.MenuBookingFlight;
import menu.MenuStatistics;
import menu.StartMenu;

/**
 * Main-klass, här startar det textbaserade programmet
 * 
 * @author Joel Delgado, Mats Samuelson
 * @version		1.0
 * @since		2016-07-11
 * 
 * @Uppd		v1.0
 */
public class Main {

	public static void main(String[] args) {

		int choise;										// användarens menyval
		boolean exitApp = false;						// möjliggör avslut av proram
		final int NUMBER_OF_MENUCHOICES = 2;			// antal menyval exkl 0
		
		do {
			choise = StartMenu.mainMenu();
			System.out.println();
			switch (choise){
			
			case 0:
				exitApp = true;
				break;
			
			case 1: 
				MenuBookingFlight.manageBookingMenu();
				System.out.println();
				break;
			
			case 2: 
				MenuStatistics.manageStatisticMenu();
				System.out.println();
				break;
			
			default:
				System.out.println(">>> Fel inmatning! Endast siffrorna 0-" + (NUMBER_OF_MENUCHOICES) + " är giltiga. \nFörsök igen....");
				System.out.println("\n");
				break;
			}
		} while (!exitApp);
		
		
		System.out.println("Adjö! \n .... och tack för fisken.");
	}

}

