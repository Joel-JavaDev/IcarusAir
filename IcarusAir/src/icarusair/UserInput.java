package icarusair;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	/**
	 *  Tar emot användarens menyval via Scanner, separat metod för inmatning av integer och String
	 * 
	 * @author		Joel Delgado
	 * @version		1.0
	 * @since		2017-07-11
	 * 
	 * @Uppd		
	 */
	public class UserInput {

		@SuppressWarnings("resource")
		public static String userInputString(){
			String input="";
			Scanner in = new Scanner(System.in);
			input = in.nextLine();
			return input;
		}
		
		@SuppressWarnings("resource")
		public static int userInputInt(){
			int input=0;
			Scanner in = new Scanner(System.in);
			input = in.nextInt();
			in.nextLine();
			return input;
		}
		
			@SuppressWarnings("resource")
			public static int userInputInt(String intText){
				int input=0;
				Scanner in = new Scanner(System.in);
				while (true){
					try {
						System.out.printf(intText);
						input = in.nextInt();
						in.nextLine();
						break;
					} catch (InputMismatchException e){
						System.out.println(">>> Endast heltal accepteras, försök igen <<<");
						in.nextLine();
					}
				}
				return input;
			}
}

