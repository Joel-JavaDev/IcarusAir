package menu;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Tar emot användarens menyval via Scanner. 
 * 
 * @author		Joel Delgado
 * @version		1.0
 * @since		2016-07-11
 */
public class InputMenuChoice {
		
	static Scanner in = new Scanner(System.in);
	private static int userChoise;
	
	public static int getUserChoise(int numbChoices){
		while (true){
			try {
				System.out.printf("Välj ett av alternativen 0-%d: ", numbChoices);
				userChoise = in.nextInt();
				in.nextLine();
				break;
			} catch (InputMismatchException e){
				System.out.println(">>> Endast heltal accepteras, försök igen <<<");
				in.nextLine();
			}
		}
		return userChoise;
	}

}
