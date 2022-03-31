/**
* Names:  Larry Li
*         Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: March 10th, 2022
* Description: Superclass to create a fast food restaurant with but not restricted to the following parameters
*/

public class HeartAttackCenters{

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
   * HeartAttackCenters
   * Creates a fast food chain
   * @param dineIn: is there indoor seating
   * @param capacity: how many customers are in the restaurant
   * @param bathroomOccupancy: is the bathroom occupied
   * @param charityDonations: how much money in charity donations
   * @param workerWages: how much money are the workers owed
   * @param numOfWorkers: number of employees
   * @param cashOnHand: how much money is in the register
   * @param driveThru: is there a drive thru
   * @param specialtyItem: number of each restaurant's speacialty item available
   */
  public HeartAttackCenters(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru, int specialtyItem){
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
  
  /*
    Mutators
  */

  /**
   * Setters
   */

  public void donateToCharity(double amount){
    if(cashOnHand > amount){
      charityDonations += amount;
      cashOnHand -= amount;
    }else{
      System.out.println("We don't have enough cash to donate $" + amount + " to charity.");
    }
  }

    public void setWorkerWages(double newWorkerWages){
    this.workerWages = newWorkerWages;
  }

  /*
    Methods
  */

  /**
   * Method Name: addCash (double cash)
   * Description: Money is added to cash register
   * @param double cash: amount of money to be added to cash register
   */
  public void addCash (double cash) {
    cashOnHand += cash;
  }

  /**
   * Method Name: drawCash (double cash)
   * Money is withdrawn from cash register
   * @param double cash: amount of money to be withdrawn from the cash register
   */
  public void drawCash (double cash) {
    cashOnHand -= cash;
  }

  /**
   * Method Name: payWorkers()
   * Calculates total workers wage and pays it.
   * @param hoursWorked: number of hours worked bt the employees
   */
  public void payWorkers(int hoursWorked) {
    cashOnHand -= (workerWages * numOfWorkers * hoursWorked);
  }

  /**
   * Method Name: purchaseInventory(double price)
   * Uses cash to purchase supplies, when are then counted as part of inventory
   * @param double price: price of the supplies bought
   */
  public void purchaseInventory(double price) {
    cashOnHand -= price;
    inventoryCost += price;
  }

  /**
   * Method Name: useInventory(double price)
   * reduces the cost of the restaurant's inventory
   * @param double cost: cost of the inventory used
   */
  public void useInventory(double cost){
    inventoryCost -= cost;
  }
  
  /**
   * Method Name: hireEmployee()
   * An employee is hired.
   */
  public void hireEmployee() {
    numOfWorkers++;
  }

  /**
   * Method Name: fireEmployee()
   * An employee is fired.
   */
  public void fireEmployee() {
    numOfWorkers--;
  }

  /**
   * Method Name: enterBathroom()
   * Determines if someone can enter a bathroom and admits them if they can.
   */
  public void enterBathroom() {
    if (this.bathroomOccupancy) {
      System.out.println("Sorry, the bathroom is occupied.");
    }
    else {
      this.bathroomOccupancy = true;
    }
  }

  /**
   * Method Name: leaveBathroom()
   * Individual leaves bathroom
   */
  public void leaveBathroom() {
      this.bathroomOccupancy = false;
  }

  /**
   * Method Name: specialtyItem()
   * Individual leaves bathroom
   * @return specialtyItem: is the specialty item available (boolean)
   */
  public boolean specialtyItem() {
    if(this.specialtyItem != 0) {
      System.out.println("Yes, our specialty item is available. :D");
      return true;
    }else{
      System.out.println("Sorry, our specialty item is not available. D:");
      return false;
     }
   }

  /**
   * Method Name: makeSpecialty()
   * increases the number of the specialty item
   * @param int num: number of specialty items to be made
   */
  public void makeSpecialty(int num){
    specialtyItem += num;
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
   */
  
  public boolean orderItem(double price, double costOfGoodsSold, int numSpecialty){
    if(numSpecialty > specialtyItem){
      System.out.println("Sorry, we only have " + specialtyItem + " of our specialty item.");
        return false;
      }else{
        System.out.println("We hope you enjoy our specialty item!");
      }
    
      cashOnHand += price;
      inventoryCost -= costOfGoodsSold;
      return true;
    }
}