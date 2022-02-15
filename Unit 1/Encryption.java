import java.util.*;

/*
   Encryption.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date: February 15th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This program encrypts a line of code, switches the first and last letter of each word, and every other non-space
   character is shifted two characters left in the ASCII table.
   
*/


public class Encryption
{
   public static void main(String[] args) 
   {
      String lineOfCode;
      char character;
      
      Scanner sc = new Scanner(System.in);
      
      // prompt user for input (taken in as a String)
      System.out.print("Enter a line to be encrypted: ");
      lineOfCode = sc.nextLine();
      
      sc.close();
      
      //split the sentence into arrays containing each word (strings separated by spaces)
      String [] words = lineOfCode.split(" ");
      
      //start output line
      System.out.print("The encryption is: ");
      
      // loop until i is less then the size of the array
      for (int i = 0; i < words.length; i++) 
      {
         //loop for all the letters in the index
         for (int j = 0; j < words[i].length(); j++) 
         {
            int sum = 0;   // for casting array (resets)
            
            // if it is the first letter of the word, character takes on the value of the last letter and is printed
            if (j == 0)
            {
               character = words[i].charAt(words[i].length()-1);
               System.out.print(character);
            }
            // if it is the last letter of the word, character takes on the value of the first letter and is printed
            else if (j == words[i].length()-1)
            {
               character = words[i].charAt(0);
               System.out.print(character);
            }
            // for every other letter, the ASCII value is increased by two, the character takes on the char of this new ASCII
            // value, and is printed
            else
            {
               character = words[i].charAt(j);
               sum = 2 + (int)character;
               character = (char)sum;
               System.out.print(character);
            }
         }
         System.out.print(" ");  // space between each word encrypted
      }
   }
}