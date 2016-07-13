package icarusair;

import java.net.UnknownServiceException;
import java.util.InputMismatchException;
import java.util.Scanner;

	/**
	 *  Tar emot användarens menyval via Scanner. 
	 *  Separat metod för inmatning av integer och String. Överlagrade metoder beroende på om det finns
	 *  förklarande text som inparameter.
	 * 
	 * @author		Joel Delgado
	 * @version		1.2
	 * @since		2017-07-13
	 * 
	 * @Uppd	v1.2	Ändrat så den kollar att rätt inmatning av String är gjord (antal bokstäver) [JD]
	 * @Uppd	v1.1	Lagt till javadoc-kommentarer [JD]
	 */
	public class UserInput {

		
		/**
		 * Tar emot användarens inmatning av heltal via Scannermetod, och skriver ut innan vad för typ av
		 * inmatning som önskas
		 * 
		 * @param	outputText	vad för typ av inmatning som önskas
		 * @return	inputText	den av användaren inmatade texten
		 */
		@SuppressWarnings("resource")
		public static int userInputInt(String outputText){
			int userInput=0;
			Scanner in = new Scanner(System.in);
			while (true){
				try {
					System.out.print(outputText);
					userInput = in.nextInt();
					in.nextLine();
					break;
				} catch (InputMismatchException e){
					System.out.println(">>> Endast heltal accepteras, försök igen <<<");
					in.nextLine();
				}
			}
			return userInput;
		}


		/**
		 * Tar emot användarens inmatning av teckensträng via Scannermetod, och skriver ut innan vad för typ av
		 * inmatning som önskas. Kollar så inmatning ej är en tom sträng och minst två bokstäver långt.
		 *  
		 * @param	outputText	vad för typ av inmatning som önskas 
		 * @return	inputText	den av användaren inmatade texten
		 */
		@SuppressWarnings("resource")
		public static String userInputString(String outputText){
			String userInput="";
			Scanner in = new Scanner(System.in);
			// TODO kolla så det ej är tom sträng (null) och innehåller minst 2 bokstäver
			// TODO skapa exception?
			while (true){
				try {
					System.out.print(outputText);
					userInput = in.nextLine();
					
					break;
				} catch (InputMismatchException e){
					System.out.println(">>> Endast bokstäver accepteras, försök igen <<<");
					in.nextLine();
				}
			}
			userInput = userInput.replaceAll("\\s+", "");
			// omvandlar begynnelsebokstav till majuskel resterande till minuskler
			userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();
			return userInput;
		}
		
		
		/**
		 * Tar emot användarens inmatning av teckensträng via Scannermetod, och skriver ut innan vad för typ av
		 * inmatning som önskas. Kollar så inmatning ej är en tom sträng och minst två bokstäver långt.
		 *  
		 * @param	outputText	vad för typ av inmatning som önskas 
		 * @return	inputText	den av användaren inmatade texten
		 */
		@SuppressWarnings("resource")
		public static String userInputString(String outputText, int minCharacters){ 			// TODO skapa exception?
			String userInput="";
			Scanner in = new Scanner(System.in);
			while (true){
				try {
					System.out.print(outputText);
				    while (!in.hasNext("[A-Öa-ö]+")) {
				        System.out.println(">>> Endast bokstäver accepteras, försök igen <<<");
				        in.next();
				    }
				    userInput = in.next();
					in.nextLine();
				} catch (InputMismatchException e){
					System.out.println(">>> Endast bokstäver accepteras, försök igen <<<");
					in.nextLine();
				}
				userInput = userInput.replaceAll("\\s+", "");
				// omvandlar begynnelsebokstav till majuskel resterande till minuskler
				if (userInput.length() < minCharacters){
					System.out.println(">>> Fel inmatning! Du måste ange minst " + minCharacters +" bokstäver. Försök igen.... <<<");
				} else {
					break;
				}
			}
			userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();
			return userInput;
		}
		
		/**
		 * Tar emot användarens inmatning av long-tal via Scannermetod, och skriver ut innan vad för typ av
		 * inmatning som önskas. Kollar så inmatning består av 16st siffror
		 *  
		 * @param	outputText	vad för typ av inmatning som önskas 
		 * @return	inputText	den av användaren inmatade texten
		 */
		@SuppressWarnings("resource")
		public static long userInputLong(String outputText){
			long userInput=0;
			int ccNumbLength = 16;
			Scanner in = new Scanner(System.in);
			// TODO kolla så det ej är tom sträng (null) och innehåller minst 2 bokstäver
			// TODO skapa exception?
			while (true){
				try {
					System.out.print(outputText);
					userInput = in.nextLong(ccNumbLength);
					
					break;
				} catch (InputMismatchException e){
					System.out.println(">>> Endast 16st heltal accepteras, försök igen <<<");
					in.nextLine();
				}
			}
			return userInput;
		}
		
		

		
		
		/**
		 * Tar emot användarens inmatning av teckensträng via Scannermetod.
		 * 
		 * @return	userInput	den av användaren inmatade texten
		 */
		@SuppressWarnings("resource")
		public static String userInputString(){
			String userInput="";
			Scanner in = new Scanner(System.in);
			userInput = in.nextLine();
			return userInput;
		}
		
		
		/**
		 * Tar emot användarens inmatning av int-tal via Scannermetod.
		 * 
		 * @return	input den av användaren inmatade talet
		 */
		@SuppressWarnings("resource")
		public static int userInputInt(){
			int userInput=0;
			Scanner in = new Scanner(System.in);
			userInput = in.nextInt();
			in.nextLine();
			return userInput;
		}
		
		
		/**
		 * Tar emot användarens inmatning av long-tal via Scannermetod.
		 * 
		 * @return	input den av användaren inmatade talet
		 */
		@SuppressWarnings("resource")
		public static long userInputLong(){
			long input=0;
			Scanner in = new Scanner(System.in);
			input = in.nextLong();
			in.nextLine();
			return input;
		}
}
