package menu;


	/**
	 * Meny för personalhantering, med switschsats. Externa metoder anropas per användarens inmatning
	 * 
	 * @author		Joel Delgado, Mats Samuelson
	 * @version		1.0
	 * @since		2016-07-11
	 * 
	 * @Uppd
	 */
	public class MenuBookingFlight {
		
		public final static int NUMBER_OF_MENUCHOICES = 5;	// antal menyval exkl 0
		private static int userChoice;						// användarens menyval
		static boolean exitApp = false;						// möjliggör avslut av proram
		
		
		/**
		 * Anropar metod för att visa personalhanteringsmeny, anropar därpå extern metod för att 
		 * ta emot inmatning från användaren. Endast om användaren matar in värdet 0 som loopen 
		 * avslutas genom att sätta exitApp = true. Programmet återvänder till startmeny.
		 */
		public static void manageBookingMenu() {
			showBookingMenu();
			exitApp = false;        
	        do {
	            userChoice =  InputMenuChoice.getUserChoise(NUMBER_OF_MENUCHOICES);
				System.out.println();
				switch (userChoice){
				
				case 0:
					exitApp = true;
					break;
				
				case 1: //Registrera Passagerare 
					//ManageEmployee.addEmployee();
					System.out.println("Du tryckte på 1 - Registrera Passagerare ");
					showBookingMenu();
					break;
								
				case 2: // Registrera Bokning
					System.out.println("Du tryckte på 2 - Registrera Bokning");
					break;
					
				case 3: // Uppdatera Bokning
					System.out.println("Du tryckte på 3 - Uppdatera Bokning ");
					break;
					
				case 4: // Radera Bokning 
					System.out.println("Du tryckte på 4 - Radera Bokning ");
					break;
					
				case 5: // Ta bort passagerare
					System.out.println("Du tryckte på 5 - Ta bort passagerare");
					break;
					
				
				default:
					System.out.println(">>> Fel inmatning! Endast siffrorna 0-" + (NUMBER_OF_MENUCHOICES) + " är giltiga. \nFörsök igen....");
					System.out.println("\n");
					break;
				}
			} while (!exitApp);
		}

			/**
			 * Ritar ut Bokningshanteringsmenyn
			 */
	        public static void showBookingMenu() {
		        System.out.println("************************************************************");
		        System.out.println("*                    Bokningshantering                     *");
		        System.out.println("*                                                          *");
		        System.out.println("*   1. Registrera Passagerare                              *");
		        System.out.println("*   2. Registrera Bokning                                  *");
		        System.out.println("*   3. Uppdatera Bokning                                   *");
		        System.out.println("*   4. Radera Bokning                                      *");
		        System.out.println("*   5. Ta bort passagerare                                 *");
		        System.out.println("*                                                          *");
		        System.out.println("*   0. Åter till huvudmenyn                                *");
		        System.out.println("************************************************************");        
		        System.out.println();
	        }

}
		

