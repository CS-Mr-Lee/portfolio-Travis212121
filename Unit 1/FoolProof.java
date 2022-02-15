import java.io.*;

import java.util.*;

/*
   FoolProof.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date: February 15th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This program asks the user for a numerator and divisor and calculates the quotient. The program rebukes
   any bad data (anything non-numeral) and asks for the data again. The user can quit by inputting anything that starts
   with a 'q' or 'Q' in the numerator.
*/

public class FoolProof
{
   public static void main(String[] args) 
   {      
      // doubles for numerator and denominator; String input will be cast into these variables
      double numerator = 0;
      double denominator = 0;
      
      // input for numerator and denominator; must be string to evaluate if valid input or if user wants to quit
      String numeratorStr = "";
      String denominatorStr = "";
      
      double quotient;
      boolean valid = false;  // one boolean variable to evaluate if different input or calculations yield a valid response
      
      Scanner sc = new Scanner (System.in);
      
      // instructions for user
      System.out.println("Type a word that starts with 'Q' or 'q' in the numerator to end the program.\n");
      
      do // do while outer loop (until user signals to quit)
      {
         do // do while invalid data is entered and is not the quit function
         {
            try   // prompt user for input and catch if there is an error
            {  
               // prompt for numerator; get String input
               System.out.print("Enter the numerator: "); 
               numeratorStr = sc.nextLine();
               
               // if the String doesn't start with Q or q
               if (!numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")) 
               { 
                  valid = true;  // valid is true and the String is parsed into a double
                  numerator = Double.parseDouble(numeratorStr); 
               }         
            }
            
            catch (NumberFormatException e) // if there is a problem parsing, two possible options  
            {
               // if it starts with Q or q, valid stays true
               if (numeratorStr.substring(0,1).equals("q") && numeratorStr.substring(0,1).equals("Q"))
               {
                  valid = true;  
               }
               // if it doesn't signal for a quite, an error message is printed and valid get the value of false
               else  
               {
                  System.out.println("You entered bad data.");
                  System.out.println("Please try again.\n");
                  valid = false;
               }
            }
            
         // loop while valid is false and no signal for a quit
         } while (valid == false && !numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")); 
         
         
         // as long as the exit condition is not met, this part is ran; if it is met, skip the rest
         if (!numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")) 
         {
            do
            {
               try // prompt user for input and catch if there is an error
               {  
                  // prompt for denominator; get String input
                  System.out.print("Enter the denominator: "); 
                  denominatorStr = sc.nextLine();  
                  valid = true;  // if there is no error caught, it is valid input
                  denominator = Double.parseDouble(denominatorStr); // parse String into double        
               }
               // if there is problem parsing, error message is printed and valid gets a value of false
               catch (NumberFormatException e) 
               {
                  System.out.println("You entered bad data.");
                  System.out.println("Please try again.\n");
                  valid = false; // invalid data input
               }
            } while (valid == false);  // continue loop is valid is false (invalid input)
         
            try // calculate quotient and catch math error
            {  
               valid = true;  // make valid true again
               
               quotient = (double)(numerator)/denominator;  //calculate numerator and denominator
               
               if (denominator != 0)   // if the denominator is not zero (real quotient), print answer
               {
                  System.out.println(numerator + " / " + denominator + " = " + quotient + "."); 
               }     
               else  // if the denominator is zero (undefined value), notify the user that the value does not exist
               {
                  System.out.println("You can't divide " + numerator + " by " + denominator + ".");
               }   
            }
            
            // catch a division error (from dividing by zero)
            catch (ArithmeticException e)  
            {
               // if the denominator is zero (undefined value), it is not a valid quotient
               valid = false;
            }
            System.out.println();   // extra space
         }
         
      // continure looping as long as exit condition is not met (numerator starting with 'Q' or 'q'
      } while (!numeratorStr.substring(0,1).equals("q") && !numeratorStr.substring(0,1).equals("Q")); 
   
   }
}