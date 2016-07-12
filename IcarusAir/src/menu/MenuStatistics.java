package menu;

import icarusair.SmallAirPlane;



/**
 * Meny för boknings- och kostnadsstatistik, med switschsats. Extern metod anropas per användarens inmatning
 * 
 * @author		Joel Delgado, Mats Samuelson
 * @version		1.0
 * @since		2016-07-11
 * 

 */
public class MenuStatistics {
	public final static int NUMBER_OF_MENUCHOICES = 5;	// antal menyval exkl 0
	public static int userChoice;						// användarens menyval
	static boolean exitApp = false;						// möjliggör avslut av program

	
	/**
	 * Anropar metod för att visa statistikmeny, anropar därpå extern metod för att 
	 * ta emot inmatning från användaren. Endast om användaren matar in värdet 0 som loopen 
	 * avslutas genom att sätta exitApp = true. Programmet återvänder till startmeny.
	 */
	public static void manageStatisticMenu() {
		
		exitApp = false;
		
		do {
			showStatisticMenu();
			userChoice =  InputMenuChoice.getUserChoise(NUMBER_OF_MENUCHOICES); 
			System.out.println();
			switch (userChoice){

			case 0:
				exitApp = true;
				break;
			
			case 1: // Visa passagerarlista
				System.out.println("Du tryckte på 1 - Visa passagerarlista");
				System.out.println();
			    break;
							
			case 2: // Visa upptagna/lediga säten på flygplan
				System.out.println("Du tryckte på 2 - Visa upptagna/lediga säten på flygplan");
				System.out.println();
				break;
				
			case 3: // Visa utgifter för flygplan
				System.out.println("Kostnaden för att flyga detta plan fullbokat är: " + SmallAirPlane.totalOperatingCost());
				System.out.println();
				break;
				
			case 4: // Visa inkomster för flygplan
				System.out.println("Du tryckte på 4 - Visa inkomster för flygplan");
				System.out.println();
				break;
				
			case 5: // Visa omsättning för flygplan 
				System.out.println("Du tryckte på 5 - Visa omsättning för flygplan");
				System.out.println();
				break;

				
			default:
				System.out.println(">>> Fel inmatning! Endast siffrorna 0-" + (NUMBER_OF_MENUCHOICES) + " är giltiga. \nFörsök igen....");
				System.out.println("\n");
				break;
			}
		} while (!exitApp);
    
	}
	
	
	/**
	 * Ritar ut menyn för bokning- och kostnadsstatistik 
	 */
    public static void showStatisticMenu() {
		System.out.println("************************************************************");
		System.out.println("*             Boknings- och kostnadsstatistik              *");
		System.out.println("*                                                          *");
		System.out.println("*   1. Visa passagerarlista                                *");
		System.out.println("*   2. Visa upptagna/lediga säten på flygplan              *");
		System.out.println("*   3. Visa utgifter för flygplan                          *");
		System.out.println("*   4. Visa inkomster för flygplan                         *");
		System.out.println("*   5. Visa omsättning för flygplan                        *");
		System.out.println("*                                                          *");
		System.out.println("*   0. Åter Huvudmeny                                      *");
		System.out.println("************************************************************");
		System.out.println();
    }
	
}
