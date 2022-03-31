/**
* Names:  Larry Li
          Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: March 10th, 2022
* Description: Subclass used to create a Wendys
*/

public class OldWendys {

  /*
      Attributes
   */

   /** whether or not the restaurant is open 24/7 */
   private boolean open24Hours = true; 

  /** whether or not there is seating in the restaurant */
  private boolean dineIn;

  /** the number of people the restaurant can seat */
  private int capacity;

  /** whether or not someone is in the bathroom */
  private boolean bathroomOccupancy;

  /** the amount of  money they donate to charity each year */
  private double charityDonations;

  /** the amount of money the workers get paid, per hour*/
  private double workerWages;

  /** the number of employees that work at the restaurant*/
  private int numOfWorkers;
  
  /** the amount of cash the restaurant has availble*/
  private double cashOnHand;

  /** whether or not they have a drive thru */
  private boolean driveThru;

  /** the amount of the store's specialty item*/
  private int bakedPotatoes;

  /** the cost of the inventory in the store*/
  private double inventoryCost;

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
  
  public OldWendys(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, int bakedPotatoes, boolean open24Hours){
    
    this.dineIn = dineIn;
    this.capacity = capacity;
    this.bathroomOccupancy = bathroomOccupancy;
    
    if(charityDonations < 0){
      this.charityDonations = 0;
    }else{
      this.charityDonations = charityDonations;
    }
    
    //wages cannot be lower than the minimum wage of 14 dollars an hour
    if(workerWages < 14.0){
      this.workerWages = 14.0;
    }else{
      this.workerWages = workerWages;
    }
    
    if(numOfWorkers < 0){
      this.numOfWorkers = 0;
    }else{
      this.numOfWorkers = numOfWorkers;
    }

    //cash on hand can be negative if the restaurant goes into debt
    this.cashOnHand = cashOnHand;
    this.driveThru = driveThru;
    
    if(bakedPotatoes < 0){
      this.bakedPotatoes = 0;
    }else{
      this.bakedPotatoes = bakedPotatoes;
    }  
    this.open24Hours = open24Hours;
   }

  /*
    Accessors
  */


  /**
   * Gets whether the restaurant has indoor seating
   * @return the boolean that determines whether or not the restaurant has indoor dining
   */
  public boolean getDineIn(){
    return dineIn;
  }

  /**
   * Gets capacity of restaurant
   * @return the number of customers in the restaurant
   */
  public int getCapacity(){
    return capacity;
  }

  /**
   * Gets whether the bathroom is avaiilable for use
   * @return if the bathroom is full or not
   */
  public boolean getbathroomOccupancy(){
    return bathroomOccupancy;
  }

  /**
   * Gets amount of money from charity donations
   * @return amount collected for donations
   */
  public double getCharityDonations(){
    return charityDonations;
  }

  /**
   * Gets the amount in worker wages
   * @return the total dollar amount of pages to be paid
   */
  public double getWorkerWages(){
    return workerWages;
  }

  /**
   * Gets the amount of cash in register
   * @return the total dollar amount in cash register
   */
  public double getCashOnHand(){
    return cashOnHand;
  }

  /**
   * Gets whether the restaurant has a drive thru
   * @return the boolean determine if it does or does not have a drive thru
   */
  public boolean getDriveThru(){
    return driveThru;
  }


  /**
   * Gets the cost of the restaurant's inventory
   * @return the cost of the restaurant's inventory
   */
  public double getInventoryCost(){
    return inventoryCost;
  }
  
  /**
   * Gets whether the restaurant has indoor seating
   * @return the boolean that determines whether or not the restaurant has indoor dining
   */
  public int getBakedPotatoes(){
    int num = getBakedPotatoes();
    System.out.println("Try one of our specialty baked potates!");
    return num;
  }

  /**
   * Method Name: specialtyItem()
   * Checks if baked potatoes are available
   */
  public boolean specialtyItem() {
    if (getBakedPotatoes() > 0) {
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
    inventoryCost -= cost;
    System.out.println("All sorts of expired food is thrown out - a small price to pay for avoiding the use of massive amounts of preservatives.");
  }
  
  /**
   * Method Name: orderItem()
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
    if(numSpecialty > getBakedPotatoes()){
      System.out.println("Sorry, we only have " + getBakedPotatoes() + " baked potatoes left.");
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

     cashOnHand += price;
     inventoryCost -= costOfGoodsSold;
     return true;
  }
  
}