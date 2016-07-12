package icarusair;
import java.util.ArrayList;



public class PassengerCatalog {
	ArrayList<Passenger> passangerList;
	
	public PassengerCatalog(){
		this.passangerList = new ArrayList<Passenger>(); 
	}
	
   public void addPassenger(Passenger p) {
	   this.passangerList.add(p);
    }
   
   
//   public ArrayList<Passenger> searchPassengerPassport1(String ppNumber) {
//       ArrayList<Passenger> incompanyEmployees = new ArrayList<>();
//       for (Passenger p : this.passangerList){
//           if (ppNumber.equals(p.getPassport()))
//             incompanyEmployees.add(p);
//       }   
//       return incompanyEmployees;
//   }
   
   public boolean searchPassengerPassport(String ppNumber) {
	   if (this.passangerList.size() != 0){ 
	       for (Passenger p : this.passangerList){
	           if (p.getPassport().toLowerCase().equals(ppNumber.toLowerCase()))
	              return true;
	       }
	   }
       return false;
   }  
}
