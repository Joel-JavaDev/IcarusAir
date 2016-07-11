import java.util.ArrayList;


public class PassengerManager {


	/**
	 * Klass för att hantera passagerare
	 * 
	 * @author		Joel Delgado
	 * @version		1.0
	 * @since		2016-07-11
	 * 
	 * @Uppd		
	 */
	public class ManageEmployee {

		public static EmployeeCatalog empCat = PopulateEmployeeList.populateEmployeeList();
		static String intText = "";
		
		
	    public static void outPutMessage(String inputString){
	        inputString = inputString.trim();
	        inputString = inputString.replace('[',' ');
	        inputString = inputString.replace(']',' ');
	        inputString = inputString.replace(',',' ');
	        inputString = inputString.replace('\t',' ');
	        inputString = inputString.trim();
	        if (inputString.isEmpty())
	            System.out.println(" Finns ingen data att visa!");
	        else 
	            System.out.println(inputString);        
	} 
		
	    
		/**
		 * Metod för att lägga till anställda i EmployeeCatalog.
		 * Användaren matar via konsoln in förnamn, efternamn, personnummer, lön, avdelning. beroende på 
		 * vald avdelning skapas objektet anställd.
		 */
		public void addPassenger(){
			System.out.println("REGISTRERA PASSAGERARE...");
			intText = "Ange titel (1=Mr, 2=Mrs, 3=Ms, 4=Dr, 5=Professor, 6=Webbdesigner, 7=Chef: ";
			int regTitle = UserInput.userInputInt(intText);
			System.out.println("REGISTRERA passagerare...\nAnge förnamn: ");
			String regFirstName = UserInput.userInputString();
			System.out.println("Ange efternamn: ");
			String regLastName = UserInput.userInputString();
			System.out.println("Ange personnummer: ");
			String regPersNumber = UserInput.userInputString();
			intText = "Ange lön: ";
			int regSalary = UserInput.userInputInt(intText);
			intText = "Ange avdelning (1=DBAdmin, 2=Developer, 3=Tekniker, 4=Säljare, 5=Sekreterare, 6=Webbdesigner, 7=Chef: ";
			int regDep = UserInput.userInputInt(intText);
			
			switch (regDep) {
				case 1:
					empCat.addEmployee(new Databaseadministrator(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				case 2:
					empCat.addEmployee(new Developer(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				case 3:
					empCat.addEmployee(new IT_Technician(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				case 4:
					empCat.addEmployee(new Salesman(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				case 5:
					empCat.addEmployee(new Secretary(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				case 6:
					empCat.addEmployee(new Webdesigner(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				case 7:
					empCat.addEmployee(new Manager(regFirstName, regLastName, regPersNumber, regSalary));
					break;
					
				default:
					System.out.println(">>> Något gick fel! Ingen användare tillagd");
					break;
			}
			System.out.println(">>> Lagt till anställd");
		}
		
		/**
		 * Metod för att radera en anställd från EmployeeCatalog.
		 * Användaren matar via konsoln in anställningsnummer på person som ska raderas. Systemet visar vem som blir raderad
		 */
		public static void removeEmployee(){
			intText = "RADERA PERSONAL...\nAnge anställningsnummer på personal du vill radera: ";
			int eraseEmpNr  = UserInput.userInputInt(intText);
			System.out.println(">>> Raderar en anställd: " + empCat.searchEmployeeNr(eraseEmpNr).getFullName());
			empCat.removeEmployee(eraseEmpNr);
			System.out.println();
		}
		
		
		public static void updateEmployeeDepartment(){
			intText = "ÄNDRA AVDELNING...\nAnge anställningsnummer på personal du vill byta avdelning på: ";
			int changeEmpNr  = UserInput.userInputInt(intText);
			System.out.println("Anställd " + changeEmpNr + " " + empCat.searchEmployeeNr(changeEmpNr).getFullName() + " tillhör avdelning=" +
					empCat.searchEmployeeNr(changeEmpNr).getDepartment());
			intText = "Ange ny avdelning (1=DBAdmin, 2=Developer, 3=Tekniker, 4=Säljare, 5=Sekreterare, 6=Webbdesigner, 7=Chef: ";
			int newDep = UserInput.userInputInt(intText);
			System.out.println(">>> Ändrar avdelning....");
			switch (newDep) {
			case 1:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.Databaseadmin);
				break;
				
			case 2:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.Developer);
				break;
				
			case 3:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.IT_Technician);
				break;
				
			case 4:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.Salesman);
				break;
				
			case 5:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.Secretary);
				break;
				
			case 6:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.Webdesigner);
				break;
				
			case 7:
				empCat.searchEmployeeNr(changeEmpNr).setDepartment(DepartmentType.Manager);
				break;
				
			default:
				System.out.println(">>> Något gick fel! Ingen avdelning ändrad");
				break;
		}
			System.out.println("Anställd " + changeEmpNr + " " + empCat.searchEmployeeNr(changeEmpNr).getFullName() + "tillhör nu avdelning=" +
					empCat.searchEmployeeNr(changeEmpNr).getDepartment());
			System.out.println();
		}
		
		
		/**
		 * Uppadterar namn på anställd.
		 * Användaren anger anställningsnummer på den vars namn ska ändras. Inmatning görs av både nytt förnamn 
		 * och nytt efternamn. Därefter anropas metoderna setFirstName och setLastName genom att söka efter rätt person
		 * via anställningsnummer i EmployeeCatalog. Slutligen visas genomförd ändring i konsoln. 
		 */
		public static void updateEmployeeName(){
			intText = "ÄNDRA NAMN...\nAnge anställningsnummer på personal du vill byta namn på: ";
			int changeEmpNr  = UserInput.userInputInt(intText);
			System.out.println("Anställd " + changeEmpNr + " heter " + empCat.searchEmployeeNr(changeEmpNr).getFullName());
			System.out.println("Ange nytt förnamn: ");
			String newFirstName = UserInput.userInputString();
			System.out.println("Ange nytt efternamn: ");
			String newLastName = UserInput.userInputString();
			System.out.println(">>> Ändrar namn....");
			empCat.searchEmployeeNr(changeEmpNr).setFirstName(newFirstName);
			empCat.searchEmployeeNr(changeEmpNr).setLastName(newLastName);
			System.out.println("Anställd " + changeEmpNr + " har bytt namn till " + empCat.searchEmployeeNr(changeEmpNr).getFullName());
			System.out.println();
		}
		
		
		/**
		 * Uppadterar lön på anställd.
		 * Användaren anger anställningsnummer på den vars namn lön ändras. Inmatning görs av nytt lönebelopp. Därefter anropas 
		 * metoderna setSalary genom att söka efter rätt person via anställningsnummer i EmployeeCatalog. Slutligen
		 * visas genomförd ändring i konsoln. 
		 */
		public static void updateEmployeeSalary(){
			intText = "ÄNDRA LÖN...\nAnge anställningsnummer på personal du vill ändra lön på: ";
			int changeEmpNr  = UserInput.userInputInt(intText);
			System.out.println("Anställd " + changeEmpNr + " har en lön på " + empCat.searchEmployeeNr(changeEmpNr).getSalary());
			intText ="Ange ny lön: ";
			int newSalary = UserInput.userInputInt(intText);
			System.out.println(">>> Ändrar lön....");
			empCat.searchEmployeeNr(changeEmpNr).setSalary(newSalary);
			System.out.println("Anställd " + changeEmpNr + " har nu en lön på" + empCat.searchEmployeeNr(changeEmpNr).getSalary());
			System.out.println();
		}
		
		
		/**
		 * Uppadterar personnummer på anställd.
		 * Användaren anger anställningsnummer på den den vars personnummer ska ändras. Inmatning görs av nytt personnummer. Därefter
		 * anropas metoderna setPersonalNumber genom att söka efter rätt person via anställningsnummer i EmployeeCatalog. Eftersom
		 * personnummer bestämmer könet ändras även personens kön. Slutligen visas genomförd ändring i konsoln. 
		 */
		public static void updateEmployeePersonalNumber(){
			System.out.println("ÄNDRA PERSONNUMMER...\nAnge anställningsnummer på personal du vill byta personnummer på: ");
			int changeEmpNr  = UserInput.userInputInt();
			System.out.println("Anställd " + changeEmpNr + ", " + empCat.searchEmployeeNr(changeEmpNr).getFullName() + ", " 
					+ empCat.searchEmployeeNr(changeEmpNr).getGender() + " har personnummer " + empCat.searchEmployeeNr(changeEmpNr).getPersonalNumber());
			System.out.println("Ange nytt personnummer: ");
			String newPersNumb = UserInput.userInputString();
			System.out.println(">>> Ändrar personnummer....");
			empCat.searchEmployeeNr(changeEmpNr).setPersonalNumber(newPersNumb);
			empCat.searchEmployeeNr(changeEmpNr).setGender(newPersNumb);
			System.out.println("Anställd " + changeEmpNr + ", " + empCat.searchEmployeeNr(changeEmpNr).getFullName() + ", " 
					+ empCat.searchEmployeeNr(changeEmpNr).getGender() + " har nu personnummer " + empCat.searchEmployeeNr(changeEmpNr).getPersonalNumber());
			System.out.println();
		}

		
		public static void updateEmployeeBonus(){
			System.out.println("Funktionen är inte klar ännu...");
		}
		
		
		/**
		 * Sök anställd på namn.
		 * Användaren anger namn på den anställd som ska sökas. Begynnelsebokstav i inmatningen omvandlas alltid toUppercase
		 * innan sökning för att minimera felsvar. Alla anställda som matchar sökterm listas i konsoln. 
		 */
		public static void searchEmployeeByName(){
			System.out.println("SÖK PÅ NAMN...\nAnge namn på personal du vill söka på: ");
			String searchEmpName  = UserInput.userInputString();
			// ta ut första bokstav i sökord och förvandla toUppercase
			String firstLetter = searchEmpName.substring(0, 1);
			firstLetter = firstLetter.toUpperCase();
			// skapa Stringbuilder-objekt för att kunna manipulera sökord
			StringBuilder sb = new StringBuilder(searchEmpName);
			sb.replace(0, 1, firstLetter);
			searchEmpName = sb.toString();
			System.out.println("Anställda vars förnamn eller efternamn börjar på: " + searchEmpName + " är: "); 
			outPutMessage((empCat.searchEmployeeNamePrefix(searchEmpName)).toString());
			System.out.println();
		}
		
		
		/**
		 * Sök anställd på  personnummer.
		 * Användaren anger personnummer på den anställd som ska sökas. Alla anställda som matchar sökterm listas i konsoln. 
		 */
		public static void searchEmployeeByPersonalNumber(){
			System.out.println("SÖK VIA PERSONNUMMER...\nAnge personnummer på personal du vill söka: ");
			String searchPersNumb  = UserInput.userInputString();
			outPutMessage((empCat.searchEmployeePnr(searchPersNumb)).toString());
			System.out.println();
		}

		
		/**
		 * Sök anställd på anställningsnummer.
		 * Användaren anger anställningsnummer på den anställd som ska sökas. Alla anställda som matchar sökterm listas i konsoln. 
		 */
		public static void searchEmployeeByEmployeeNumber(){
			intText = "SÖK VIA ANSTÄLLNINGSNUMMER...\nAnge anställningsnummer på personal du vill söka: ";
			int searchEmpNumb  = UserInput.userInputInt(intText);
			outPutMessage((empCat.searchEmployeeNr(searchEmpNumb)).toString());
			System.out.println();
		}

		
		/**
		 * Sök anställd på avdelning.
		 * Användaren anger avdelning på den anställd som ska sökas. Alla anställda som matchar sökterm listas i konsoln. 
		 */
		public static void searchEmployeeNameByDepartment(){
			intText = "Ange avdelning du vill söka på (1=DBAdmin, 2=Developer, 3=Tekniker, 4=Säljare, 5=Sekreterare, 6=Webbdesigner, 7=Chef: ";
			int searchDep = UserInput.userInputInt(intText);
			switch (searchDep) {
			case 1:
				outPutMessage((empCat.getEmployeesOfDepartmentType(DepartmentType.Databaseadmin).toString()));
				break;
				
			case 2:
				outPutMessage(empCat.getEmployeesOfDepartmentType(DepartmentType.Developer).toString());
				break;
				
			case 3:
				outPutMessage(empCat.getEmployeesOfDepartmentType(DepartmentType.IT_Technician).toString());
				break;
				
			case 4:
				outPutMessage(empCat.getEmployeesOfDepartmentType(DepartmentType.Salesman).toString());
				break;
				
			case 5:
				outPutMessage(empCat.getEmployeesOfDepartmentType(DepartmentType.Secretary).toString());
				break;
				
			case 6:
				outPutMessage(empCat.getEmployeesOfDepartmentType(DepartmentType.Webdesigner).toString());
				break;
				
			case 7:
				outPutMessage(empCat.getEmployeesOfDepartmentType(DepartmentType.Manager).toString());
				break;
				
			default:
				System.out.println(">>> Något gick fel! Ingen sådan avdelning");
				break;
			}
			System.out.println();
		}
		
		
		/**
		 * Listar alla anställda.
		 * Alla anställda som finns i EmployeeCatalog skrivs ut i konsolen. 
		 */
		public static void listAllEmployees(){
			System.out.println("Listar alla anställda: ");
			System.out.printf("%8s   %-25s %-7s  %-14s %-15s %10s %10s \n", "Anst.nr", "Namn", "Kön", "Pers.nummer", "Avdelning", "Lön", "Bonus");
			System.out.println("===================================================================================================");
			ArrayList<Employee> empTemp = empCat.getEmployees();
			for(int i = 0; i <empTemp.size(); i++)
				System.out.println(empTemp.get(i).toString());
			System.out.println();
		}
	}
}
