import java.util.*;
import java.io.*;
import java.lang.*;

/**
* Name: Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: June 7th, 2022
* Description: A simulation of the 2022-23 season to predict future stats for all nba players.
*/

public class SummativeMain {
   
   public static void main(String[] args) {
      
      String name = "";
      String team = "";
      int age = 0;
      double minutes = 0;
      double points = 0;
      double rebounds = 0;
      double assists = 0;
      double blocks = 0;
      double steals = 0;
      double OBPM = 0;
      double DBPM = 0;
      double BPM = 0;
      double ORTG = 0;
      double DRTG = 0;
      double VORP = 0;
      double PER = 0;
      double FGM = 0;
      double FGA = 0;
      double threePTM = 0;
      double FTM = 0;
      double FTA = 0;
      double ORB = 0;
      double DRB = 0;
      double fouls = 0;
      double FTMiss = 0;
      double FGMiss = 0;
      double turnovers = 0;
      double WS = 0;
      String lineIn1 = "";
      String lineIn2 = "";
      String lineIn3 = "";
      
      Scanner sc = new Scanner(System.in);
      
      // League will store all the players in an array list
      List<Player> league = new ArrayList<Player> ();
      
      // Databases containing the stats
      String fileName1 = "database.csv";
      String fileName2 = "database2.csv";
      String fileName3 = "database3.csv";
      
      try
      {  
         // open bufferer readers
         BufferedReader one = new BufferedReader(new FileReader(fileName1));
         BufferedReader two = new BufferedReader(new FileReader(fileName2));
         BufferedReader three = new BufferedReader(new FileReader(fileName3));
         
         lineIn1 = one.readLine(); // read first line in file (headers)
         lineIn2 = two.readLine();
         lineIn3 = three.readLine();
         lineIn1 = one.readLine(); // read second line in file (first line of info)
         lineIn2 = two.readLine();
         lineIn3 = three.readLine();
         
         while (lineIn1 != null && lineIn2 != null && lineIn3 != null)  // if there is something in the line (not nothing)
         {  
            String[] parts1 = lineIn1.split(",");  // split where there are commas
            String[] parts2 = lineIn2.split(",");
            String[] parts3 = lineIn3.split(",");
            
            String[] parts11 = parts1[1].split("-"); //separate name from code 
            
            // give necessary values for player attributes to the variables
            name = parts11[0];
            age = Integer.parseInt(parts1[3]);
            team = parts1[4];
            minutes = Double.parseDouble(parts1[7]);
            FGM = Double.parseDouble(parts1[8]);
            FGA = Double.parseDouble(parts1[9]);
            FGMiss = FGA-FGM;
            FTM = Double.parseDouble(parts1[18]);
            FTA = Double.parseDouble(parts1[19]);
            threePTM = Double.parseDouble(parts1[11]);
            FTMiss = FTA-FTM;
            ORB = Double.parseDouble(parts1[21]);
            DRB = Double.parseDouble(parts1[22]);
            rebounds = Double.parseDouble(parts1[23]);
            assists = Double.parseDouble(parts1[24]);
            steals = Double.parseDouble(parts1[25]);
            blocks = Double.parseDouble(parts1[26]);
            turnovers = Double.parseDouble(parts1[27]);
            fouls = Double.parseDouble(parts1[28]);
            points = Double.parseDouble(parts1[29]);
            PER = Double.parseDouble(parts2[7]);
            WS = Double.parseDouble(parts2[22]);
            OBPM = Double.parseDouble(parts2[25]);
            DBPM = Double.parseDouble(parts2[26]);
            BPM = Double.parseDouble(parts2[27]);
            VORP = Double.parseDouble(parts2[28]);
            ORTG = Double.parseDouble(parts3[30]);
            DRTG = Double.parseDouble(parts3[31]);
            
            // contingency since weird things were happening
            // player must play at least 8.6 minutes a game
            if (minutes > 8.6) {
               // create a player with the given attributes from the database
               Player createdPlayer = new Player(name, team, age, minutes, points, rebounds, assists, blocks, steals, OBPM, DBPM, BPM, ORTG, DRTG, VORP, PER, FGM, threePTM, FTM, ORB, DRB, fouls, FTMiss, FGMiss, turnovers, WS);            
               
               // add the player to the league
               league.add(createdPlayer);
            }
            lineIn1 = one.readLine();    // read in next line
            lineIn2 = two.readLine();
            lineIn3 = three.readLine();
         }
         one.close();   // close readers
         two.close();
         three.close();
         
      }
      catch (Exception e)   // if there is an issue reading the file
      {
         System.out.println(e + " Problem  reading ");
      }
      
      lineIn1 = sc.nextLine();   // using these to separate flow as I go through presentation
      
      // showcasing toString method
      System.out.println(league.get(104).toString());
      
      lineIn1 = sc.nextLine();
      
      // loops method allowing the user to search for projections of players
      for (int i = 0; i < 8; i++) {
         System.out.println("Choose a player: ");
      
         name = sc.nextLine();
      
         System.out.println(Player.findPlayer(league, name) + "\n");
      }
      
      lineIn1 = sc.nextLine();
      
      // loops method allowing the user to search for the top 5 leaders in specific stats
      for (int i = 0; i < 8; i++) {
         System.out.print("Top 5 Leaders for: ");
         name = sc.nextLine();
         System.out.println(Player.topFive(league, name));
      }
      
      lineIn1 = sc.nextLine();
      
      //loops method allowing the user to search for award finalists
      for (int i = 0; i < 2; i++) {
         System.out.println("Predict Award Winners for: ");
         name = sc.nextLine();
         System.out.println(Player.awardPredictor(league, name));
      }
      
      lineIn1 = sc.nextLine();
      
      // prints method that displays all the awards and their finalists
      System.out.println(Player.awardsPredictor(league));
   }
}