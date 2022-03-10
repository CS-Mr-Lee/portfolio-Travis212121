/**
* Names:  Larry Li
          Shairahavan Selvachandran
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

  /** the name of their mascot */
  private String mascot;

  /** the amount of money the workers get paid, per hour*/
  private double workerWages;

  /** the number of employees that work at the restaurant*/
  private int numOfWorkers;
  
  /** the amount of cash the restaurant has availble*/
  private double cashOnHand;

  /** whether or not they have a drive thru */
  private boolean driveThru;

  /** whether or not their specialty item is in stock*/
  private int specialtyItem;

  //menu items
  //menu prices
  
  /*
    Constructors
  */

  /**
   * HeartAttackCenters
   * Creates a fast food chain
   * @param x: 
   * @param x: 
   */
  public HeartAttackCenters(boolean dineIn, int capacity, boolean bathroomOccupancy, double charityDonations, String mascot, double workerWages, int numOfWorkers, double cashOnHand, boolean driveThru){
    this.dineIn = dineIn;
    this.capacity = capacity;
    this.bathroomOccupancy = bathroomOccupancy;
    this.charityDonations = charityDonations;
    this.mascot = mascot;
    this.workerWages = workerWages;
    this.numOfWorkers = numOfWorkers;
    this.cashOnHand = cashOnHand;
    this.driveThru = driveThru;
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
   * Gets name of mascot
   * @return the name of the mascot
   */
    public String getMascot(){
    return mascot;
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

  /* public int getSpecialtyItem(){
    return specialtyItem;
  }
*/
  //add a specialty item method to replace both happymeal and hashbrown methods in the subclasses (via polymorphism)
  
  /*
    Mutators
  */

  /**
   * setters
   */

  public void setCharityDonations(double newCharityDonations){
    this.charityDonations = newCharityDonations;
  }
    public void setMascot(String newMascot){
    this.mascot = newMascot;
  }
    public void setWorkerWages(double newWorkerWages){
    this.workerWages = newWorkerWages;
  }


  /*
    Methods
  */

  /**
   * Method Name: invest (double cash)
   * Return Type: N/A
   * Parameters: double cash - amount of money to be added to cash register
   * Description: Money is added to cash register
   */
  public void invest (double cash) {
    cashOnHand += cash;
  }

  /**
   * Method Name: drawCash (double cash)
   * Return Type: N/A
   * Parameters: double cash - amount of money to be withdrawn cash register
   * Description: Money is withdrawn from cash register
   */
  public void drawCash (double cash) {
    cashOnHand -= cash;
  }

  /**
   * Method Name: payWorkers()
   * Return Type: N/A
   * Parameters: N/A
   * Description: Calculates total workers wage and pays it.
   */
  public void payWorkers(int hoursWorked) {
    cashOnHand -= (workerWages * numOfWorkers * hoursWorked);
  }

  /**
   * Method Name: buyIngredients()
   * Return Type: N/A
   * Parameters: double cost - cost of ingredients
   * Description: Withdraws money from cash register to pay for ingredients.
   */
  public void buyIngredients(double cost) {
    cashOnHand -= cost;
  }

  /**
   * Method Name: sellItem(double price)
   * Return Type: N/A
   * Parameters: double price - price of item
   * Description: Adds money to cash register after making a sale.
   */
  public void sellItem(double price) {
    cashOnHand += price;
  }

  /**
   * Method Name: hireEmployee()
   * Return Type: N/A
   * Parameters: N/A
   * Description: An employee is hired.
   */
  public void hireEmployee() {
    numOfWorkers++;
  }

  /**
   * Method Name: fireEmployee()
   * Return Type: N/A
   * Parameters: N/A
   * Description: An employee is fired.
   */
  public void fireEmployee() {
    numOfWorkers--;
  }

  /**
   * Method Name: enterBathroom()
   * Return Type: N/A
   * Parameters: N/A
   * Description: Determines if someone can enter a bathroom and admits them if they can.
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
   * Return Type: N/A
   * Parameters: N/A
   * Description: Individual leaves bathroom
   */
  public void leaveBathroom() {
      this.bathroomOccupancy = false;
  }


  
}