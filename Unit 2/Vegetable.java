/**
* Name: Eric, Shairahavan
* Class: ICS4U1-5A
* Date: Feb 25th, 2022
* Description: Creates humans with traits such as nationality, 
* name, gender, weight, and changing energy levels.
*/

public class Vegetable {

   /*
      Attributes
   */
   
   
   /** the name of the vegetable */
   private String name;
   
   /** the colour of the vegetable */
   private String colour;
   
   /** is the vegetable green */
   private boolean isGreen;
   
   /** is the vegetable edible */
   private boolean isEdible;
   
   /** the number of calories from the vegetable */
   private double calories;
   
   /** the weight of the vegetable */
   private double weight;
   
   /*
   Constructors
   */
   
   /**
   * Vegetable
   * Creates a vegetable with no attributes (default)
   */
   
   public Vegetable(){
      this.name = "";
      this.calories = -1;
      this.weight = -1;
   }
   
   
   /**
   * Vegatable
   * Creates a vegatable
   * @param name: the name of the vegetable
   * @param calories: the calories of the vegetable
   * @param weight: the weight of the vegetable
   */
   
   public Vegetable(String name, int calories, double weight){
      this.name = name;
   
      //Restrictions on number of calories (can't be below 0)
      if (calories < 0){
         this.calories = 0;
      } else {
         this.calories = calories;
      }
      
      //Restrictions on weight (can't be below 0)
      if (weight < 0){
         this.weight = 0;
      } else {
         this.weight = weight;
      }
   }
   
   /*
   Accessors
   */
   
   /**
   * Gets name of veggie
   * @return name of the veggie
   */
   public String getName(){
      return this.name;
   }
   
   /**
   * Gets number of calories in veggie
   * @return number of calories in veggie
   */
   public int getCalories(){
      return this.calories;
   }
   
   /**
   * Gets the weight of the veggie
   * @return the weight of the veggie
   */
   public double getWeight(){
      return this.weight;
   }
   
   /*
   Mutators
   */
      
   /**
   * Changes name for the veggie
   * @param newName the new name of the veggie
   */
   public void nameChange(String newName){
      this.name = newName;
   }
   
   /**
   * Changes calorie count for veggie
   * @param newCalories the new calorie count of veggie
   */
   public void calorieChange(int newCalories){
      this.calories = newCalories;
   }
   
   /**
   * Changes weight for veggie
   * @param newWeight the new weight of veggie
   */
   public void weightChange(double newWeight){
      this.weight = newWeight;
   }
   
   /*
      Methods
   */
   
   /**
   * Method Name: eaten(double weight)
   * Return Type: amount of calories eaten
   * Parameters: double weight - weight of veggie eaten by human     
   * Description:   This method calculates calories eaten by the human given certain conditions are met.
   */
   
   public int eaten(double weight) {      
   
      if (weight > this.weight) {
         return -1;
      } else if (weight == this.weight) {
         this.weight == 0;
         return 0;
      } else {
         this.weight = this.weight - weight;
         return (this.weight/weight)*this.calories;
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
      String weightStr = Double.toString(weight);
      String calorieStr = Int.toString(calories);
      
      //return all attributes in an organized fashion
      return "Name: " + name + "\nWeight: " + weightStr + "\nCalories: " + caloriesStr;
   }
}