/**
* Names:  Larry Li
          Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: March 10th, 2022
* Description: Main to exhibit use of superclasses/subclasses
*/

public class Main {
  public static void main (String[] args){

    HeartAttackCenters[] torontoLocations = new HeartAttackCenters[2];
    
    torontoLocations[0] = new McDonalds (true, 20, false, 0, 15, 5, 300, true, 23, false);
    torontoLocations[1] = new Wendys (true, 15, false, 200, 17, 4, 2000, false, 1, true);


    for(int i = 0; i< torontoLocations.length; i++){
      System.out.println(torontoLocations[i].getCashOnHand());
      System.out.println(torontoLocations[i].getInventoryCost());

      System.out.println(torontoLocations[i].specialtyItem());

      torontoLocations[i].donateToCharity((torontoLocations[i].getCashOnHand()) / 20);

      //use both casting and instanceof
      //showcase polymorphism by showing how the order method performs differently depending on the class of the object
      if(torontoLocations[i] instanceof McDonalds){
        ((McDonalds)torontoLocations[i]).breakIceCreamMachine();
        ((McDonalds)torontoLocations[i]).order(20, 13, 2, true, 0);
        ((McDonalds)torontoLocations[i]).order(16, 12, 3, false, 2);

      }else if(torontoLocations[i] instanceof Wendys){
        ((Wendys)torontoLocations[i]).disposeInventory((torontoLocations[i].getInventoryCost()) / 10);
        ((Wendys)torontoLocations[i]).order(24, 13, 1, false);
        ((Wendys)torontoLocations[i]).order(5, 2, 0, true);
        ((Wendys)torontoLocations[i]).changeNightShift();
        ((Wendys)torontoLocations[i]).order(3, 1, 0, true);
        
      }
      
      torontoLocations[i].payWorkers(40);

    }

    for(int i = 0; i< torontoLocations.length; i++){
      System.out.println(torontoLocations[i].getCashOnHand());
    }
    
  }
  
}