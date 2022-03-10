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

  /** whether or not happy meals are available*/
   private int happyMeals;

    /** whether or not the ice cream machine is broken */
   private boolean iceCreamMachineBroken;
   
   /*
      Constructors
   */

   /**
   * McDonalds
   * Creates a McDonalds franchise
   * @param sure:  
   */
   
   public McDonalds(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, String mascot, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, boolean iceCreamMachineBroken, int happyMeals) {
    super(dineIn, capacity,bathroomOccupancy, charityDonations, mascot, workerWages, numOfWorkers, cashOnHand,driveThru);
     this.iceCreamMachineBroken = iceCreamMachineBroken;
     this.happyMeals = happyMeals;
   }
   
   /*
      Accessors
   */

  public boolean getIceCreamMachineBroken(){
    return iceCreamMachineBroken;
  }

  public int getHappyMealsAvailable(){
    return happyMeals;
  }

   /*
      Mutators
   */

  /**
   * Method Name: fixIceCreamMachine()
   * Return Type: N/A
   * Parameters: N/A
   * Description: Fixes ice cream machine.
   */
  public void fixIceCreamMachine() {
      this.iceCreamMachineBroken = false;
   }

  /**
   * Method Name: breakIceCreamMachine()
   * Return Type: N/A
   * Parameters: N/A
   * Description: Breaks ice cream machine.
   */
  public void breakIceCreamMachine() {
      this.iceCreamMachineBroken = true;
   }

  /**
   * Method Name: happyMeals()
   * Return Type: N/A
   * Parameters: N/A
   * Description: Checks if happy meals are available
   */
  public void happyMeals() {
    if (this.happyMeals != 0) {
      System.out.println("Yes, happy meals are available. :D");
     } else {
      System.out.println("No, happy meals are not available. D:");
     }
   }
}



