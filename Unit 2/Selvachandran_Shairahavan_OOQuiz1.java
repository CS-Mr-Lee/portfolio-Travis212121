/**
* Name: Shairahavan
* Class: ICS4U1-5A
* Date: Feb 28th, 2022
* Description: Creates humans with traits such as nationality, 
* name, gender, weight, and changing energy levels.
*/

public class Selvachandran_Shairahavan_OOQuiz1 {
  public static void main(String[] args) {
    Human person1 = new Human("yao", "male", 72, "chinese", 10);
    Human person2 = new Human("stick", "male", 50, "chinese", 5);

    System.out.println(person1.getName() + "weighs " + person1.getWeight());
    System.out.println(person2.getName() + " is the " + person2.getGender() + " gender");

    String oldStat1 = person1.toString();
    String oldStat2 = person2.toString();

    String oldName1 = person1.getName();

    person1.nameChange("kevin");

    System.out.println(oldName1 + " changed his name to " + person1.getName());

    String oldGender2 = person2.getGender();
    person2.genderChange("female");

    System.out.println(person2.getName() + " changed his gender to " + person2.getGender());

    double oldEnergy1 = person1.getEnergy();

    person1.sleep(69);

    System.out.println(person1.getName() + "recovered his energy level from" + oldEnergy1 + " to " + person1.getEnergy() + " by sleeping 69 hours");

    double oldEnergy2 = person2.getEnergy();
    double oldWeight2 = person2.getWeight();

    person2.run(10000);

    System.out.println(person2.getName() + " changed his energy level and weight from" + oldEnergy2 + " and " + oldWeight2 + " to " + person2.getEnergy() + " and " + person2.getWeight() + " by running 10000km");

    System.out.println("human before changes:");
    System.out.println(oldStat1);
    System.out.println(oldStat2);

    System.out.println("human after changes:");
    System.out.println(person1.toString());
    System.out.println(person2.toString());

    
    
    
    
    
    
    
  }
}