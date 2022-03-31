
/**
* Names:  Larry Li
          Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: March 10th, 2022
* Description: Subclass used to create a McDonalds
*/

public class OldMcDonalds {

   /*
      Attributes
   */

   /** whether or not the ice cream machine is broken */
   private boolean iceCreamMachineBroken;

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
  private int specialtyItem;

  /** the cost of the inventory in the store*/
  private double inventoryCost;

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
  
   public OldMcDonalds(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, int specialtyItem, boolean iceCreamMachineBroken) {

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
    
    if(specialtyItem < 0){
      this.specialtyItem = 0;
    }else{
      this.specialtyItem = specialtyItem;
    }  
     this.iceCreamMachineBroken = iceCreamMachineBroken;
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
   * Gets the restaurant's stock of their special item
   * @return the integer number of the restaurant's special item
   */
  public int getSpecialtyItem(){
    return specialtyItem;
  }

  /**
   * Gets the cost of the restaurant's inventory
   * @return the cost of the restaurant's inventory
   */
  public double getInventoryCost(){
    return inventoryCost;
  }
  
  /**
   * Gets whether the ice cream machine is broken
   * @return the boolean that determines whether or not the ice cream machine is broken
   */
  public boolean getIceCreamMachineBroken(){
    return iceCreamMachineBroken;
  }

  /**
   * Gets the number (if there are any) of specialty items
   * @return the number of happy meals available
   */
  public int getHappyMeals(){
    int num = getSpecialtyItem();
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
   * Method Name: orderItem()
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
      if(numSpecialty > getSpecialtyItem()){
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
     cashOnHand += price;

    if(donation > 0){
      charityDonations += donation;
      System.out.println("Thank you for helping support the Ronald McDonald foundation!");
    }
     cashOnHand += price;
     inventoryCost -= costOfGoodsSold;
    return true;
  }
  
}