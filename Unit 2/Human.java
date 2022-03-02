/**
* Name: Eric, Shairahavan
* Class: ICS4U1-5A
* Date: Feb 28th, 2022
* Description: Creates humans with traits such as name, weight, and changing energy levels.
*/

public class Human {

   private final int MAX_ENERGY_LEVEL = 100;
  
   /*
   Attributes
   */

   /** the name of the human */
   private String name;

   /** the weight of the human */
   private double weight;

   /** the energy level of the human */
   private int energyLevel;

   /*
   Constructor
   */

   /**
   * Human
   * Creates a human with no attributes (default constructor)
   */
   
   public Human(){
      this.name = "";
      this.weight = -1;
      this.energyLevel = -1;
   }

   /**
   * Human
   * Creates a human (person)
   * @param name: the name of the human
   * @param weight: the weight of the human (in kgs)
   * @param energyLevel: the current energy level of the human 
   */
  
   public Human(String name, double weight, int energyLevel) {
    
      this.name = name; //we are initializing the attribute with the parameter
    
      //setting restrictions for weight attribute (cannot be negative)
      if (weight < 0) {
         this.weight = 0;
      }
      else {
         this.weight = weight;
      }
   
      if (energyLevel < 0) {  // setting lower bound restrictions for energy level
         this.energyLevel = 0;
      }
      else if (energyLevel >= MAX_ENERGY_LEVEL) {  // setting upper bound restrictions for energy level
         this.energyLevel = MAX_ENERGY_LEVEL;
      }
      else {
         this.energyLevel = energyLevel;
      }
   }

   /*
   Methods
   */
   
   //Accessors
   
   /**
   * Gets the name of human
   * @return the human's name
   */
  
   public String getName() {
      return this.name;
   }

   /**
   * Gets the weight of human
   * @return the human's weight
   */
   public double getWeight() {
      return this.weight;
   }

   /**
   * Gets the energy level of human
   * @return the human's energy level
   */
   public int getEnergy() {
      return this.energyLevel;
   } 

   /*
   Mutators
   */

   /**
   * changes name of individual
   * @param newName - registered new name
   */
   public void nameChange(String newName) {
      this.name = newName;
   }

   /**
   * changes energyLevel; cannot be less than 0 or more than 100
   * @param newEnergyLevel - newEnergyLevel (has to be between 0 and 100)
   */
   public void energyChange(int newEnergyLevel) {
      if (newEnergyLevel < 0) {
         this.energyLevel = this.energyLevel; //if negative, nothing happens
      } else if (newEnergyLevel == 0)  { //if zero, weight remains the same
         this.energyLevel = this.energyLevel;
      } else if (newEnergyLevel >= MAX_ENERGY_LEVEL)  { //if greater than 100, just becomes 100
         this.energyLevel = MAX_ENERGY_LEVEL;
      } else { //all other cases, energy level is changed to new energy levels
         this.energyLevel = newEnergyLevel;
      }
   }
   
   /**
   * changes weight; cannot be less than 0
   * @param newWeight - newWeight (has to be positive)
   */
   public void weightChange(double newWeight) {
      if (newWeight < 0) {
         this.weight = this.weight; //add by max intake (rest is vomitted out)
      } else if (newWeight == 0)  { //if zero, nothing happens to the weight
         this.weight = this.weight;
      } else  { //if zero, nothing happens to the weight
         this.weight = newWeight;
      }
   }

   /*
   Methods
   */
  
   /**
   * Method Name: sleep(int hours)
   * Return Type: N/A
   * Parameters: int hours - number of hours of sleep that the human had            
   * Description:   This method raises energyLevel by hours * 10%
   */

   public void sleep(int hours) {
      if (hours < 0){  // restriction for negative numbers
         this.energyLevel = this.energyLevel;
      } else if (hours == 0) {  // if no sleep, energy level is the same
         this.energyLevel = this.energyLevel;
      } else {  // for every positive number of hrs of sleep
         this.energyLevel = energyLevel + 10*hours;  // formula
         if (energyLevel > MAX_ENERGY_LEVEL){  // if greater than 100, reduce down to max energy level
            this.energyLevel = MAX_ENERGY_LEVEL;
         }
      }
   }

   /**
   * Method Name: run(double km)
   * Return Type: N/A
   * Parameters: double km - number of kilometres travelled by the human     
   * Description:   This method causes the human to lose energy and decrease weight by 0.001 per km
   */
   
   public void run (double km) {
      if (km < 0){  // restriction for negative numbers
         this.energyLevel = this.energyLevel;
         this.weight = this.weight;
      } else if (km == 0) {  // if zero, energy level and weight is the same
         this.energyLevel = this.energyLevel;
         this.weight = this.weight;
      } else {  // for every positive number of kilometres
         this.energyLevel = energyLevel - (int)(3*km);  // energy level decreases by 0.5% for every kilometre
         if (this.energyLevel < 0) {   // if energyLevel goes below zero, reset to 0
            this.energyLevel = 0;
         }
         this.weight = weight - 0.001*km; // weight decreases by 0.001kg for every kilometre
      }
   }
   
   /**
   * Method Name: eat(Vegetable veg, double grams)
   * Return Type: N/A
   * Parameters: double grams - number of grams of the veggie that the human has consumed   
   * Description:   This method lets the human eat a veggie and gain calories
   */
   
   public void eat(Vegetable veg, double grams) {
      
      double caloriesEaten = veg.eaten(grams);
      
      if (caloriesEaten == -1) { // if person enters weight greater than veggie
         System.out.println("I don’t have that much food");
         this.energyLevel = this.energyLevel;
      }
      else if (caloriesEaten == 0) {   //if amount eaten is 0
         this.energyLevel = this.energyLevel;
      }
      else {   // all other cases, calculate calories eaten
         this.energyLevel = this.energyLevel + (int)((double)caloriesEaten/15.0);
         if (this.energyLevel > MAX_ENERGY_LEVEL) {
            this.energyLevel = MAX_ENERGY_LEVEL;
         }   
      }
   }
   
   
   /**
   * Method Name: eat(Cookie food, double grams)
   * Return Type: N/A
   * Parameters: double grams - number of grams of the cookie that the human has consumed   
   * Description:   This method lets the human eat a cookie and gain calories
   */
   
   public void eat(Cookie food, double grams) {
      
      double caloriesEaten = food.eaten(grams);
      
      if (caloriesEaten == -1) { //if the user inputs a weight greater than the cookie
         System.out.println("I don’t have that much food");
         this.energyLevel = this.energyLevel;
      }
      else if (caloriesEaten == -2) {  // if the human tries to eat a packaged cookie
         System.out.println("I can’t eat the bag");
         this.energyLevel = this.energyLevel;
      }
      else if (caloriesEaten == 0) {   // if amount eaten is 0
         this.energyLevel = this.energyLevel;
      }
      else {   // all other cases, calculate calories eaten
         this.energyLevel = this.energyLevel + (int)((double)caloriesEaten/15.0);   
         if (this.energyLevel > MAX_ENERGY_LEVEL) {
            this.energyLevel = MAX_ENERGY_LEVEL;
         }   
      }
   }


   /**
   * Method Name: toString()
   * Return Type: returns organized string of the given data
   * Parameters: N/A           
   * Description:   This method returns all the attributes of the human in a String
   */
   
   public String toString() {
      
      // convert doubles to strings
      String weightStr = Double.toString(weight);
      String energyLevelStr = Integer.toString(energyLevel);
      
      //return all attributes in an organized fashion
      return "Name: " + name + "\nWeight: " + weightStr + "\nEnergy Level: " + energyLevelStr;
   }
}