package menu;


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
	static boolean exitApp = false;						// möjliggör avslut av proram

	
	/**
	 * Anropar metod för att visa statistikmeny, anropar därpå extern metod för att 
	 * ta emot inmatning från användaren. Endast om användaren matar in värdet 0 som loopen 
	 * avslutas genom att sätta exitApp = true. Programmet återvänder till startmeny.
	 */
	public static void showStatisticMenu() {
		exitApp = false;
		
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
		
		do {
			userChoice =  InputMenuChoice.getUserChoise(NUMBER_OF_MENUCHOICES); 
			//TODO Stefan. Snygga till utskrifter
			System.out.println();
			switch (userChoice){

			case 0:
				exitApp = true;
				break;
			
			case 1: //Average Wage
				System.out.println("Du tryckte på 1");
			    break;
							
			case 2: // Highest wage
				System.out.println("Du tryckte på 2");
				break;
				
			case 3: //Lowest wage
				System.out.println("Du tryckte på 3");
				break;
				
			case 4: // Total bonus
				System.out.println("Du tryckte på 4");
				break;
				
			case 5: // % women
				System.out.println("Du tryckte på 5");
				break;

				
			default:
				System.out.println(">>> Fel inmatning! Endast siffrorna 0-" + (NUMBER_OF_MENUCHOICES) + " är giltiga. \nFörsök igen....");
				System.out.println("\n");
				break;
			}
		} while (!exitApp);
    
	}
}
