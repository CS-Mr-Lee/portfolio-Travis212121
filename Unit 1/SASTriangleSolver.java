import java.util.*;

/*
   SASTriangleSolver.java
   ---------------------------------------
   Programmer:  Shairahavan Selvachandran
   Date: February 15th, 2022
   Course:  ICS4U1
   ---------------------------------------
   This program calculates the smallest angle of a triangle using Side-Angle-Side values from user.
*/

public class SASTriangleSolver
{
   public static void main(String[] args) 
   {
      double sideA, sideB, angleCInRadians, smallestAngle;
      
      Scanner sc = new Scanner (System.in);  // import scanner
      
      // prompt user for double input (length of the first side of the triangle)
      System.out.print("What is the length of Side A? ");
      sideA = sc.nextDouble();
      
      sc.nextLine(); // to avoid a malfunction when taking in input
      
      // prompt user for double input (length of the second side of the triangle)
      System.out.print("What is the length of Side B? ");
      sideB = sc.nextDouble();
      
      sc.nextLine(); // to avoid a malfunction when taking in input
      
      // prompt user for double input (measure of the angle in between Side A and B (in radians))
      System.out.print("What is angle C in radians? ");
      angleCInRadians = sc.nextDouble();
      
      sc.close(); // close scanner (no further input)
      
      System.out.println(); //line to separate input from intended output
      
      
      // using the side lengths and angle given, a method will determine all angles and return the smallest value in degrees
      smallestAngle = smallestAngleSAS(angleCInRadians, sideA, sideB);
      
      
      //print statement for user indicating smallest angle of triangle in degrees
      System.out.printf("The smallest angle of the triangle is %.3f degrees.", smallestAngle);
   }
   
   /*
   ---------------------------------------
   Method Name: smallestAngleSAS(angleCInDegrees, sideA, sideB)
   Return Type: returns double - smallest angle of the triangle
   Parameters: double angle1 - the angle of given by the user in radians
               double side1 - the length of the first side given by the user
               double side2 - the length of the second side given by the user
               
   Description:   This method takes the angle given in radians and the two side lengths given by
                  the user, calculates all the angles using the cosine law, sine law, and returns
                  the smallest angle of the triangle. 
   ---------------------------------------
   */
   
   public static double smallestAngleSAS (double angleC, double side1, double side2)
   {
      double smallestAngle = 0;   // create return variable
      
      double angleA, angleB, side3;  // create doubles for all angles and a needed side length (for sine law calculation)
      
      
      // calculate value of side 3 using cosine law (a,b, and C are already given)
      side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - (2*side1*side2*Math.cos(angleC)));
      
      // knowing length of side3, sine law is used to determine size of angle A
      angleA = Math.asin(side1*Math.sin(angleC)/side3);
      
      // angle b is calculated by subtracting values of angle A and C from the total angles in a triangle (PI radians)
      angleB = Math.PI - angleA - angleC;
      
      
      // determine smallest angle
      
      // initialize smallestAngle variable with the value of Angle A
      smallestAngle = angleA;
      
      // if angle B is smaller than the current smallest angle (Angle A), the smallest angle now becomes Angle B
      if (angleB < smallestAngle)
      {
         smallestAngle = angleB;
      }
      
      // if angle B is smaller than the current smallest angle, the smallest angle now becomes Angle C
      if (angleC < smallestAngle)
      {
         smallestAngle = angleC;
      }
      
      // convert the determined smallest angle from radians to degrees
      smallestAngle = Math.toDegrees(smallestAngle);  
      
      return smallestAngle;   // return the smallest angle as the value
   }
}