package menu;

/**
 * Meny för Bokningsssystem
 * 
 * @author		Joel Delgado
 * @version		1.0
 * @since		2016-07-11
 * 
 */


public class StartMenu {

	public final static int NUMBER_OF_MENUCHOICES = 2;	// antal menyval exkl 0
	private static int userChoice;						// användarens menyval
		
	
		/**
		 * Ritar ut startmeny och anropar extern metod för att ta emot inmatning från användaren 
		 * @return	userChoice	användarens val av menyalternativ
		 */
	    public static int mainMenu() {
	    	System.out.println("************************************************************");
	        System.out.println("*                 Välkommen till IcarusAir                 *");
	        System.out.println("*                     Bokningsssystem                      *");
	        System.out.println("*                                                          *");
	        System.out.println("*   1. Boka Biljett                                        *");
	        System.out.println("*   2. Kostnadsstatistik                                   *");
	        System.out.println("*                                                          *");
	        System.out.println("*   0. Avsluta Program                                     *");
	        System.out.println("************************************************************");
	        System.out.println();
	        return userChoice =  InputMenuChoice.getUserChoise(NUMBER_OF_MENUCHOICES);
	    }

}


