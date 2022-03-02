/**
* Name: Shairahavan
* Class: ICS4U1-5A
* Date: Feb 28th, 2022
* Description: Creates humans, veggies, and cookies.
*/

public class Selvachandran_Shairahavan_OOQuiz1 {
   public static void main(String[] args) {
      
      // human is created
      Human person1 = new Human("Henery Ren", 69, 69);
      
      // vegetable is created
      Vegetable veggie1 = new Vegetable("Avocado", 160, 100);
      
      // three cookies are created using different constructors
      Cookie cookie1 = new Cookie();
      Cookie cookie2 = new Cookie("Subway Triple Chocolate", 250, 80);
      Cookie cookie3 = new Cookie("Oreos", 100, 40, true);
      
      // human tries to eat packaged cookie
      person1.eat(cookie3, 20);
      
      // human tries to eat too much of the vegatable
      person1.eat(veggie1, 101);
      
      // info before cookie 2 is eaten
      System.out.println("\n" + cookie2.toString());
      
      System.out.println();
      
      // human tries to eats a cookie and gains energy
      person1.eat(cookie2, 60);
      
      // info after cookie2 is eaten
      System.out.println("\n" + cookie2.toString());
   }
}