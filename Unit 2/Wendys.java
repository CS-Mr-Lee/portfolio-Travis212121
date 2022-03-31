/**
* Names:  Larry Li
          Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: March 10th, 2022
* Description: Subclass used to create a Wendys
*/

public class Wendys extends HeartAttackCenters{

  /*
      Attributes
   */

   /** whether or not the restaurant is open 24/7 */
   private boolean open24Hours = true; 

   /*
      Constructors
   */

  /**
   * Wendys
   * Creates a Wendys franchise
   * @param dineIn: is there indoor seating
   * @param capacity: how many customers are in the restaurant
   * @param bathroomOccupancy: is the bathroom occupied
   * @param charityDonations: how much money in charity donations
   * @param workerWages: how much money are the workers owed
   * @param numOfWorkers: number of employees
   * @param cashOnHand: how much money is in the register
   * @param driveThru: is there a drive thru
   * @param frostySeason: is the restaurant currently selling frostys
   * @param bakedPotatoes: number of baked potatoes available
   * @param open24Hours: whether or not the restraunt is open 24/7
   */
  
  public Wendys(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, int bakedPotatoes, boolean open24Hours){
    super(dineIn, capacity, bathroomOccupancy, charityDonations, workerWages, numOfWorkers, cashOnHand, driveThru, bakedPotatoes);
    this.open24Hours = open24Hours;
   }

  /*
    Accessors
  */

  /**
   * Gets whether the restaurant has indoor seating
   * @return the boolean that determines whether or not the restaurant has indoor dining
   */
  public int getSpecialtyItem(){
    int num = super.getSpecialtyItem();
    System.out.println("Try one of our specialty baked potates!");
    return num;
  }

  /**
   * Method Name: specialtyItem()
   * Checks if baked potatoes are available
   */
  public boolean specialtyItem() {
    if (super.getSpecialtyItem() > 0) {
      System.out.println("Yes, baked potatoes are available. :D");     
      return true;
     } else {
      System.out.println("Sorry, baked potatoes are not available. D:");
      return false;
     }
   }

  /*
    Mutators
  */

   /**
   * Method Name: changeNightShift()
   * Changes whether or not the restraunt runs a night shift
   */
  public void changeNightShift(){
    open24Hours = !open24Hours;
  }

  /**
   * Method Name: disposeInventory()
   * Disposes of inventory that is no longer usable (Patties that have gone bad because Wendy's uses fresh meat)
   */
  public void disposeInventory(double cost){
    useInventory(cost);
    System.out.println("All sorts of expired food is thrown out - a small price to pay for avoiding the use of massive amounts of preservatives.");
  }
  
  /**
   * Method Name: order()
   * Processes a customer's order:
   * returns true if the order is able to be serviced
   * returns false if the order cannot go through for any reason
   * increases cashOnHand by the amount the customer paid
   * @param price: the amount paid by the customer
   * @param costOfGoodsSold: the cost of the inventory sold to the customer
   * @param numSpecialty: the numder of specialty items the customer is ordering
   * @param afterHours: if the restraunt is closed for the night
   */
  public boolean order(double price, double costOfGoodsSold, int numSpecialty, boolean afterHours){
    if(numSpecialty > super.getSpecialtyItem()){
      System.out.println("Sorry, we only have " + getSpecialtyItem() + " baked potatoes left.");
      return false;
    }else if(afterHours){
      if(open24Hours = false){
         System.out.println("Sorry, the restaurant is closed.");
         return false;
       }
     }
      
    if(numSpecialty > 0){
       System.out.println("We hope you enjoy your baked potatoes!");
     }

     addCash(price);
     useInventory(costOfGoodsSold);
     return true;
  }
  
}