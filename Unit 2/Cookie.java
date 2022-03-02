/**
* Name: Shairahavan
* Class: ICS4U1-5A
* Date: Mar 1st, 2022
* Description: Creates cookies with attirbutes such as name, weight, calories,
* and if it's packaged.
*/

public class Cookie {

   /*
      Attributes
   */
   
   /** the name of the cookie */
   private String name;
   
   /** the weight of the cookie */
   private double weight;
   
   /** the number of calories from the cookie */
   private int calories;
   
   /** is the cookie packaged */
   private boolean isPackaged;
   
   /*
      Constructors
   */
   
   /**
   * Human
   * Creates a cookie with no attributes (default constructor)
   */
   
   public Cookie(){
      this.name = "";
      this.weight = -1;
      this.calories = -1;
      this.isPackaged = false;
   }
   
   /**
   * Cookie
   * Creates a cookie
   * @param name: the name of the cookie
   * @param calories: the calorie count of the cookie
   * @param weight: the weight of the cookie
   */
   
   public Cookie(String name, double weight, int calories){
      this.name = name;
      this.isPackaged = false;
      
      //Restriction below 0
      if (calories < 0){
         this.calories = 0;
      } else if (calories == 0) {  // If it's 0, nothing happens
         this.calories = 0;
      } else {   // else, variable is initilized
         this.calories = calories;
      }
      
      //Restriction below 0
      if (weight < 0){
         this.weight = 0;
      } else if (weight == 0){  // If it's 0, nothing happens
         this.weight = 0;
      } else {   // else, variable is initilized
         this.weight = weight;
      }
   }

   
   /**
   * Cookie
   * Creates a cookie
   * @param name: the name of the cookie
   * @param calories: the calorie count of the cookie
   * @param weight: the weight of the cookie
   * @param isPackaged: is the cookie packaged or not
   */
   
   public Cookie(String name, double weight, int calories, boolean isPackaged){
      this.name = name;
      this.isPackaged = isPackaged;
      
      //Restriction below 0
      if (calories < 0){
         this.calories = 0;
      } else if (calories == 0) {  // If it's 0, nothing happens
         this.calories = 0;
      } else {   // else, variable is initilized
         this.calories = calories;
      }
      
      //Restriction below 0
      if (weight < 0){
         this.weight = 0;
      } else if (weight == 0){  // If it's 0, nothing happens
         this.weight = 0;
      } else {   // else, variable is initilized
         this.weight = weight;
      }
   }
   
   /*
      Accessors
   */
   
   /**
   * Gets name of cookie
   * @return name of the cookie
   */
   public String getName(){
      return this.name;
   }
   
   /**
   * Gets the weight of the cookie
   * @return the weight of the cookie
   */
   public double getWeight(){
      return this.weight;
   }
   
   /**
   * Gets whole number of calories in cookie
   * @return whole number of calories in cookie
   */
   public int getCalories(){
      return this.calories;
   }
   
   /**
   * Gets boolean on whether the cookie is packaged or not
   * @return is the cookie packaged
   */
   public Boolean getIsPackaged(){
      return this.isPackaged;
   }
   
   /*
      Mutators
   */
   
   /**
   * Changes name for the cookie
   * @param newName the new name of the cookie
   */
   public void nameChange(String newName){
      this.name = newName;
   }
   
   /**
   * Changes weight for cookie
   * @param newCalories the new weight of cookie
   */
   public void weightChange(double newWeight){
      this.weight = newWeight;
   }
   
   /**
   * Changes calorie count for cookie
   * @param newCalories the new caloric countt of cookie
   */
   public void calorieChange(int newCalories){
      this.calories = newCalories;
   }
   
   /**
   * Changes if the cookie is packaged or not
   * @param newIsGreen whether the cookie is currently packaged
   */
   public void isPackagedChange(boolean newIsPackaged){
      this.isPackaged = newIsPackaged;
   }
   
   /*
      Methods
   */
   
   /**
   * Method Name: open()
   * Return Type: N/A
   * Parameters: N/A           
   * Description:   This method removes the packaging if there is packaging
   */
   public void open() {
      if (this.isPackaged) {
         this.isPackaged = false;
      }
   }
   
   /**
   * Method Name: eaten(double weight)
   * Return Type: caloriesEaten - amount of calories eaten
   * Parameters: double weight - weight of cookie eaten by human     
   * Description:   This method calculates calories eaten by the human given certain conditions are met.
   */
   
   public int eaten(double weight) {      
      int caloriesEaten;
      
      if (this.isPackaged) {  // if the cookie is packaged, return -2
         return -2;
      }
      else{
         if (weight > this.weight) {   // if weight is larger than cookie, return -1
            return -1;
         } else { // else, calculate new weight, calories, and calories eaten
            caloriesEaten = (int)((weight/this.weight)*this.calories);
            this.calories = this.calories - caloriesEaten;
            this.weight = this.weight - weight;
            return caloriesEaten;
         }
      }
   }

   
   /**
   * Method Name: toString()
   * Return Type: returns organized string of the given data
   * Parameters: N/A           
   * Description:   This method returns all the attributes of the cookie in a String
   */
   
   public String toString() {
      
      // convert doubles/ints to strings
      String weightStr = Double.toString(this.weight);
      String caloriesStr = Integer.toString(this.calories);
      
      //return all attributes in an organized fashion
      return "Name: " + this.name + "\nWeight: " + weightStr + "\nCalories: " + caloriesStr + "\nPackaged: " + this.isPackaged;
   }
}