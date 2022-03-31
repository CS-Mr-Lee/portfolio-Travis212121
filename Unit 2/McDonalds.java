/**
* Names:  Larry Li
          Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: March 10th, 2022
* Description: Subclass used to create a McDonalds
*/

public class McDonalds extends HeartAttackCenters{

   /*
      Attributes
   */

   /** whether or not the ice cream machine is broken */
   private boolean iceCreamMachineBroken;

   /*
      Constructors
   */

   /**
   * McDonalds
   * Creates a McDonalds franchise
   * @param dineIn: is there indoor seating
   * @param capacity: how many customers are in the restaurant
   * @param bathroomOccupancy: is the bathroom occupied
   * @param charityDonations: how much money in charity donations
   * @param workerWages: how much money are the workers owed
   * @param numOfWorkers: number of employees
   * @param cashOnHand: how much money is in the register
   * @param driveThru: is there a drive thru
   * @param iceCreamMachineBroken: is the ice cream machine broken
   * @param happyMeals: number of happy meals available
   */
  
   public McDonalds(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, int happyMeals, boolean iceCreamMachineBroken) {
    super(dineIn, capacity, bathroomOccupancy, charityDonations, workerWages, numOfWorkers, cashOnHand, driveThru, happyMeals);
     this.iceCreamMachineBroken = iceCreamMachineBroken;
   }

   /*
      Accessors
   */

  /**
   * Gets whether the ice cream machine is broken
   * @return the boolean that determines whether or not the ice cream machine is broken
   */
  public boolean getIceCreamMachineBroken(){
    return iceCreamMachineBroken;
  }

  /**
   * Gets the number (if there are any) of specialty items
   * @return the number of happy mealss available
   */
  public int getSpecialtyItem(){
    int num = super.getSpecialtyItem();
    if(num == 0){
      System.out.println("Sorry, we're out of Happy Meals."); 
      return 0;
    }else {
      System.out.println("Try one of our exclusive happy meals!"); 
    }
     return num;
  }

   /*
      Mutators
   */

  /**
   * Method Name: fixIceCreamMachine()
   * Fixes ice cream machine.
   */
  public void fixIceCreamMachine() {
      iceCreamMachineBroken = false;
      System.out.println("The ice cream machine is now working! :D");      
   }

  /**
   * Method Name: breakIceCreamMachine()
   * "Accidentally" breaks ice cream machine.
   */
  public void breakIceCreamMachine() {
      iceCreamMachineBroken = true;
      System.out.println("The ice cream machine is not working anymore. D:");      
   }

  /**
   * Method Name: specialtyItem()
   * Checks if happy meals are available
   */
  public boolean specialtyItem() {
    if (getSpecialtyItem() != 0) {
      System.out.println("Yes, happy meals are available. :D");     
      return true;
     } else {
      System.out.println("Sorry, happy meals are not available. D:");
      return false;
     }
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
   * @param containsIceCream: if the customer is ordering ice cream
   * @param donation: the size of the donation the customer gives to the Ronald McDonald charity
   */
    public boolean order(double price, double costOfGoodsSold, int numSpecialty, boolean containsIceCream, double donation){
      if(numSpecialty > super.getSpecialtyItem()){
        System.out.println("Sorry, we only have " + getSpecialtyItem() + " happy meals left in stock.");
          return false;
        }else if(containsIceCream){
          if(iceCreamMachineBroken){
          System.out.println("Sorry, the ice cream machine is broken.");
          return false;
        }
      }
    if(numSpecialty > 0){
      System.out.println("We hope you enjoy your happy meal!");
    }
    if(containsIceCream){
      System.out.println("Enjoy your ice cream!");
    }
    addCash(price);

    if(donation > 0){
      donateToCharity(donation);
      System.out.println("Thank you for helping support the Ronald McDonald foundation!");
    }
    addCash(price);
    useInventory(costOfGoodsSold);
    return true;
  }
  
}