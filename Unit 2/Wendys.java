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

  /** whether or not they have bakedPotatoes */
   private int bakedPotatoes;

    /** is the ice cream machine broken */
   private boolean foundedByJohnWendy;
   
   /*
      Constructors
   */

  /**
   * Wendys
   * Creates a Wendys franchise
   * @param sure:  
   */
  public Wendys(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, String mascot, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, int bakedPotatoes, boolean foundedByJohnWendy){
    super(dineIn, capacity, bathroomOccupancy, charityDonations, mascot, workerWages, numOfWorkers, cashOnHand, driveThru);

    this.bakedPotatoes = bakedPotatoes;
    this.foundedByJohnWendy = foundedByJohnWendy;
   }

  /*
    Accessors
  */

  public boolean getFoundedByJohnWendy(){
    return foundedByJohnWendy;
  }

  public int getBakedPoatoes(){
    return bakedPotatoes;
  }

  /*
    Mutators
  */

  /**
   * Method Name: larrySays()
   * Return Type: N/A
   * Parameters: N/A
   * Description: The founder of Wendy's was John Wendy.
   */
  public void larrySays() {
    foundedByJohnWendy = true;
   }

  /**
   * Method Name: bakePotatoes(int potatoes)
   * Return Type: N/A
   * Parameters: int potatoes - number of potatoes to be baked.
   * Description: Makes baked potatoes.
   */
  private void bakePotatoes(int potatoes) {
    this.bakedPotatoes += potatoes;
  }
}