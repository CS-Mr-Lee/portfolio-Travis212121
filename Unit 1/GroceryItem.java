import java.util.*;

/*
   GroceryItem.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date: February 15th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This program creates a grocery list of two items and their prices.
*/


public class GroceryItem
{
   public static void main(String[] args) 
   {
      // create item and price input variables associated with the proper data type
      String item1, item2;
      double price1, price2;
      
      Scanner sc = new Scanner (System.in);  // import scanner
      
      // prompt user for string input (name of first item)
      System.out.print("What is your first grocery item? ");
      item1 = sc.nextLine();
      
      // prompt user for double input (price of the first item)
      System.out.print("What is the price of this item? ");
      price1 = sc.nextDouble();
      
      sc.nextLine(); // input to avoid a malfunction when user presses enter
      
      // prompt user for string input (name of second item)
      System.out.print("What is your second grocery item? ");
      item2 = sc.nextLine();
      
      // prompt user for double input (price of the second item)
      System.out.print("What is the price of this item? ");
      price2 = sc.nextDouble();
      
      sc.close(); //scanner is closed and cannot take any more input
      
      System.out.println(); // separate user input annd prompts from intended output
      
      
      // create a top barrier by repeatedly hyphons
      for (int i = 1; i <= 27; i++) {
         System.out.print("-");
      }
      
      
      /*
      prints the receipt using printf function
      name of item is presented followed by spaces up to 20 characters long
      price of item (assuming up to $99.99 max) is printed to two decimal places
      */
      
      // if the price is thess than 10 (4 total digits including space), an extra space is added
      if (price1 < 10.0) {
         System.out.printf("%n%-21s $%4.2f%n", item1, price1);
      }
      // if it is greater than 10 (5 total digits), printed as usual
      else {
         System.out.printf("%n%-20s $%5.2f%n", item1, price1);
      }
      
      // if the price is thess than 10 (4 total digits including space), an extra space is added
      if (price2 < 10.0) {
         System.out.printf("%-21s $%4.2f%n", item2, price2);
      }
      // if it is greater than 10 (5 total digits), printed as usual
      else {
         System.out.printf("%-20s $%5.2f%n", item2, price2);
      }
      
      
      // create a top barrier by repeatedly hyphons
      for (int i = 1; i <= 27; i++) {
         System.out.print("-");
      }
   }
}