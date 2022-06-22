import java.lang.*;
import java.util.*;

public class Player {

   /*
      Attributes
   */
   
   /** name of player */
   public String name;
   
   /** name of player */
   public String team;
   
   /** the age of the player */
   public int age;
   
   /** minutes for the player in the previous season */
   public double oldMinutes;
   
   /** points for the player in the previous season */
   public double oldPoints;
   
   /** assists for the player in the previous season */
   public double oldAssists;
   
   /** rebounds for the player in the previous season */
   public double oldRebounds;
   
   /** blocks for the player in the previous season */
   public double oldBlocks;
   
   /** steals for the player in the previous season */
   public double oldSteals;
   
   /** Offensive Box Plus/Minus for the player in the previous season */
   public double oldOBPM;
   
   /** Defensive Box Plus/Minus for the player in the previous season */
   public double oldDBPM;
   
   /** Box Plus/Minus for the player in the previous season */
   public double oldBPM;
   
   /** Offensive Rating for the player in the previous season */
   public double oldORTG;
   
   /** Defensive Rating for the player in the previous season */
   public double oldDRTG;
   
   /** Value Over Replacement Player for the player in the previous season */
   public double oldVORP;
   
   /** Player Efficiency Rating for the player in the previous season */
   public double oldPER;
   
   /** Field Goals Made for the player in the previous season */
   public double oldFGM;
   
   /** 3-Pointers Made for the player in the previous season */
   public double oldThreePTM;
   
   /** Free Throws Made for the player in the previous season */
   public double oldFTM;
   
   /** Offensive Rebounds for the player in the previous season */
   public double oldORB;
   
   /** Defensive Rebounds for the player in the previous season */
   public double oldDRB;
   
   /** Fouls for the player in the previous season */
   public double oldFouls;
   
   /** Free Throws Missed for the player in the previous season */
   public double oldFTMiss;
   
   /** Field Goals Missed for the player in the previous season */
   public double oldFGMiss;
   
   /** Turnovers for the player in the previous season */
   public double oldTurnovers;
   
   /** Win Shares for the player in the previous season */
   public double oldWS;
   
   /** Fantasy Score for the player in the previosseason */
   public double oldFantasyScore;
   
   /** Salary for the player in the next season */
   public double salary;
   
   /** projected minutes for the player next season */
   public double newMinutes;
   
   /** points projection for the player next season */
   public double newPoints;
   
   /** assists projection for the player next season */
   public double newAssists;
   
   /** rebounds projection for the player next season */
   public double newRebounds;
   
   /** blocks projection for the player next season */
   public double newBlocks;
   
   /** steals projection for the player next season */
   public double newSteals;
   
   /** Offensive Box Plus/Minus projection for the player next season */
   public double newOBPM;
   
   /** Defensive Box Plus/Minus projection for the player next season */
   public double newDBPM;
   
   /** Box Plus/Minus projection for the player next season */
   public double newBPM;
   
   /** Offensive Rating projection for the player next season */
   public double newORTG;
   
   /** Defensive Rating projection for the player next season */
   public double newDRTG;
   
   /** Value Over Replacement Player projection for the player next season */
   public double newVORP;
   
   /** Player Efficiency Rating projection for the player next season */
   public double newPER;
   
   /** Field Goals Made projection for the player next season */
   public double newFGM;
   
   /** 3-Pointers Made projection for the player next season */
   public double newThreePTM;
   
   /** Free Throws Made projection for the player next season */
   public double newFTM;
   
   /** Offensive Rebounds projection for the player next season */
   public double newORB;
   
   /** Defensive Rebounds projection for the player next season */
   public double newDRB;
   
   /** Fouls projection for the player next season */
   public double newFouls;
   
   /** Free Throws Missed projection for the player next season */
   public double newFTMiss;
   
   /** Field Goals Missed projection for the player next season */
   public double newFGMiss;
   
   /** Turnovers projection for the player next season */
   public double newTurnovers;
   
   /** Win Shares projection for the player next season */
   public double newWS;

   /** Fantasy Score projection for the player next season */
   public double newFantasyScore;
   
   /** Salary worth (what they should get paid) for the player in the next season */
   public double salaryWorth;

   /*
      Constructor
   */
   
   /**
   * Player
   * Creates a player with old stats and projected stats.
   * @param name: name of the player
   * @param team: team of player
   * @param age: age of the player
   * @param oldMinutes: minutes per game by the player in the 2021-22 season
   * @param oldPoints: points per game by the player in the 2021-22 season
   * @param oldRebounds: rebounds per game by the player in the 2021-22 season
   * @param oldAssists: assists per game by the player in the 2021-22 season
   * @param oldBlocks: blocks per game by the player in the 2021-22 season
   * @param oldSteals: steals per game by the player in the 2021-22 season
   * @param oldOBPM: OBPM by the player in the 2021-22 season
   * @param oldDBPM: DBPM by the player in the 2021-22 season
   * @param oldBPM: BPM by the player in the 2021-22 season
   * @param oldORTG: ORTG by the player in the 2021-22 season
   * @param oldDRTG: DRTG by the player in the 2021-22 season
   * @param oldVORP: VORP by the player in the 2021-22 season
   * @param oldPER: PER by the player in the 2021-22 season
   * @param oldFGM: FGM by the player in the 2021-22 season
   * @param oldThreePTM: 3PTM by the player in the 2021-22 season
   * @param oldFTM: FTM by the player in the 2021-22 season
   * @param oldORB: ORM by the player in the 2021-22 season
   * @param oldDRB: DRB by the player in the 2021-22 season
   * @param oldFouls: Fouls by the player in the 2021-22 season
   * @param oldFTMiss: FT missed by the player in the 2021-22 season
   * @param oldFGMiss: FG missed by the player in the 2021-22 season
   * @param oldTurnovers: Turnovers by the player in the 2021-22 season
   * @param oldWS: WS by the player in the 2021-22 season
   */
   public Player (String name, String team, int age, double oldMinutes, double oldPoints, double oldRebounds, double oldAssists, double oldBlocks, double oldSteals, double oldOBPM, double oldDBPM, double oldBPM, double oldORTG, double oldDRTG, double oldVORP, double oldPER, double oldFGM, double oldThreePTM, double oldFTM, double oldORB, double oldDRB, double oldFouls, double oldFTMiss, double oldFGMiss, double oldTurnovers, double oldWS) {
      this.name = name;
      this.team = team;
      this.age = age;
      this.oldMinutes = oldMinutes;
      this.oldPoints = oldPoints;
      this.oldRebounds = oldRebounds;
      this.oldAssists = oldAssists;
      this.oldBlocks = oldBlocks;
      this.oldSteals = oldSteals;
      this.oldOBPM = oldOBPM;
      this.oldDBPM = oldDBPM;
      this.oldBPM = oldBPM;
      this.oldORTG = oldORTG;
      this.oldDRTG = oldDRTG;
      this.oldVORP = oldVORP;
      this.oldPER = oldPER;
      this.oldFGM = oldFGM;
      this.oldThreePTM = oldThreePTM;
      this.oldFTM = oldFTM;
      this.oldORB = oldORB;
      this.oldDRB = oldDRB;
      this.oldFouls = oldFouls;
      this.oldFTMiss = oldFTMiss;
      this.oldFGMiss = oldFGMiss;
      this.oldTurnovers = oldTurnovers;
      this.oldWS = oldWS;
      this.oldFantasyScore = calculateFantasyScore(this.oldPoints, this.oldRebounds, this.oldAssists, this.oldSteals, this.oldBlocks, this.oldTurnovers);
      // rest of parameters are intiialized throught he progression method
      this.projection();
      this.roundAll();
   }
   
   /*
      Accessors
   */
   
   /**
   * Gets the name of the player
   * @return the name of the player
   */
   public String getName() {
      return this.name;
   }
   
   /**
   * Gets the team of the player
   * @return the team of the player
   */
   public String getTeam() {
      return this.team;
   }
   
   /**
   * Gets the age of the player
   * @return the age of the player
   */
   public int getAge() {
      return this.age;
   }
   
   /**
   * Gets the minutes of the player in the 2021-22 season
   * @return the past minutes of the player
   */
   public double getOldMinutes() {
      return this.oldMinutes;
   }
   
   /**
   * Gets the points of the player in the 2021-22 season
   * @return the past points of the player
   */
   public double getOldPoints() {
      return this.oldPoints;
   }
   
   /**
   * Gets the rebounds of the player in the 2021-22 season
   * @return the past rebounds of the player
   */
   public double getOldRebounds() {
      return this.oldRebounds;
   }
   
   /**
   * Gets the assists of the player in the 2021-22 season
   * @return the past assists of the player
   */
   public double getOldAssists() {
      return this.oldAssists;
   }
   
   /**
   * Gets the blocks of the player in the 2021-22 season
   * @return the past blocks of the player
   */
   public double getOldBlocks() {
      return this.oldBlocks;
   }
   
   /**
   * Gets the steals of the player in the 2021-22 season
   * @return the past steals of the player
   */
   public double getOldSteals() {
      return this.oldSteals;
   }
   
   /**
   * Gets the OBPM of the player in the 2021-22 season
   * @return the past OBPM of the player
   */
   public double getOldOBPM() {
      return this.oldOBPM;
   }
   
   /**
   * Gets the DBPM of the player in the 2021-22 season
   * @return the past DBPM of the player
   */
   public double getOldDBPM() {
      return this.oldDBPM;
   }
   
   /**
   * Gets the BPM of the player in the 2021-22 season
   * @return the past BPM of the player
   */
   public double getOldBPM() {
      return this.oldBPM;
   }
   
   /**
   * Gets the ORTG of the player in the 2021-22 season
   * @return the past ORTG of the player
   */
   public double getOldORTG() {
      return this.oldORTG;
   }
   
   /**
   * Gets the DRTG of the player in the 2021-22 season
   * @return the past DRTG of the player
   */
   public double getOldDRTG() {
      return this.oldDRTG;
   }
   
   /**
   * Gets the VORP of the player in the 2021-22 season
   * @return the past VORP of the player
   */
   public double getOldVORP() {
      return this.oldVORP;
   }
   
   /**
   * Gets the PER of the player in the 2021-22 season
   * @return the past PER of the player
   */
   public double getOldPER() {
      return this.oldPER;
   }
   
   /**
   * Gets the FGM of the player in the 2021-22 season
   * @return the past FGM of the player
   */
   public double getOldFGM() {
      return this.oldFGM;
   }
   
   /**
   * Gets the 3PTM of the player in the 2021-22 season
   * @return the past 3PTM of the player
   */
   public double getOldThreePTM() {
      return this.oldThreePTM;
   }
   
   /**
   * Gets the FTM of the player in the 2021-22 season
   * @return the past FTM of the player
   */
   public double getOldFTM() {
      return this.oldFTM;
   }
   
   /**
   * Gets the ORB of the player in the 2021-22 season
   * @return the past ORB of the player
   */
   public double getOldORB() {
      return this.oldORB;
   }
   
   /**
   * Gets the DRB of the player in the 2021-22 season
   * @return the past DRB of the player
   */
   public double getOldDRB() {
      return this.oldDRB;
   }
   
   /**
   * Gets the fouls of the player in the 2021-22 season
   * @return the past fouls of the player
   */
   public double getOldFouls() {
      return this.oldFouls;
   }
   
   /**
   * Gets the FT missed of the player in the 2021-22 season
   * @return the past FT missed of the player
   */
   public double getOldFTMiss() {
      return this.oldFTMiss;
   }
   
   /**
   * Gets the FG Missed of the player in the 2021-22 season
   * @return the past FG Missed of the player
   */
   public double getOldFGMissed() {
      return this.oldFGMiss;
   }
   
   /**
   * Gets the turnovers of the player in the 2021-22 season
   * @return the past turnovers of the player
   */
   public double getOldTurnovers() {
      return this.oldTurnovers;
   }
   
   /**
   * Gets the WS of the player in the 2021-22 season
   * @return the past WS of the player
   */
   public double getOldWS() {
      return this.oldWS;
   }
   
   /**
   * Gets the Fantasy Score of the player in the 2021-22 season
   * @return the past Fantasy Score of the player
   */
   public double getOldFantasyScore() {
      return this.oldFantasyScore;
   }
   
   /**
   * Gets the projected minutes of the player in the 2022-23 season
   * @return the future minutes of the player
   */
   public double getNewMinutes() {
      return this.newMinutes;
   }
   
   /**
   * Gets the projected points of the player in the 2022-23 season
   * @return the future points of the player
   */
   public double getNewPoints() {
      return this.newPoints;
   }
   
   /**
   * Gets the projected rebounds of the player in the 2022-23 season
   * @return the futurerebounds of the player
   */
   public double getNewRebounds() {
      return this.newRebounds;
   }
   
   /**
   * Gets the projected assists of the player in the 2022-23 season
   * @return the future assists of the player
   */
   public double getNewAssists() {
      return this.newAssists;
   }
   
   /**
   * Gets the projected blocks of the player in the 2022-23 season
   * @return the future blocks of the player
   */
   public double getNewBlocks() {
      return this.newBlocks;
   }
   
   /**
   * Gets the projected steals of the player in the 2022-23 season
   * @return the future steals of the player
   */
   public double getNewSteals() {
      return this.newSteals;
   }
   
   /**
   * Gets the projected OBPM of the player in the 2022-23 season
   * @return the future OBPM of the player
   */
   public double getNewOBPM() {
      return this.newOBPM;
   }
   
   /**
   * Gets the projected DBPM of the player in the 2022-23 season
   * @return the future DBPM of the player
   */
   public double getNewDBPM() {
      return this.newDBPM;
   }
   
   /**
   * Gets the projected BPM of the player in the 2022-23 season
   * @return the future BPM of the player
   */
   public double getNewBPM() {
      return this.newBPM;
   }
   
   /**
   * Gets the projected ORTG of the player in the 2022-23 season
   * @return the future ORTG of the player
   */
   public double getNewORTG() {
      return this.newORTG;
   }
   
   /**
   * Gets the projected DRTG of the player in the 2022-23 season
   * @return the future DRTG of the player
   */
   public double getNewDRTG() {
      return this.newDRTG;
   }
   
   /**
   * Gets the projected VORP of the player in the 2022-23 season
   * @return the future VORP of the player
   */
   public double getNewVORP() {
      return this.newVORP;
   }
   
   /**
   * Gets the projected PER of the player in the 2022-23 season
   * @return the future PER of the player
   */
   public double getNewPER() {
      return this.newPER;
   }
   
   /**
   * Gets the projected FGM of the player in the 2022-23 season
   * @return the future FGM of the player
   */
   public double getNewFGM() {
      return this.newFGM;
   }
   
   /**
   * Gets the projected 3PTM of the player in the 2022-23 season
   * @return the future 3PTM of the player
   */
   public double getNewThreePTM() {
      return this.newThreePTM;
   }
   
   /**
   * Gets the projected FTM of the player in the 2022-23 season
   * @return the future FTM of the player
   */
   public double getNewFTM() {
      return this.newFTM;
   }
   
   /**
   * Gets the projected ORB of the player in the 2022-23 season
   * @return the future ORB of the player
   */
   public double getNewORB() {
      return this.newORB;
   }
   
   /**
   * Gets the projected DRB of the player in the 2022-23 season
   * @return the future DRB of the player
   */
   public double getNewDRB() {
      return this.newDRB;
   }
   
   /**
   * Gets the projected fouls of the player in the 2022-23 season
   * @return the future fouls of the player
   */
   public double getNewFouls() {
      return this.newFouls;
   }
   
   /**
   * Gets the projected FT missed of the player in the 2022-23 season
   * @return the future FT missed of the player
   */
   public double getNewFTMiss() {
      return this.newFTMiss;
   }
   
   /**
   * Gets the projected FG Missed of the player in the 2022-23 season
   * @return the future FG Missed of the player
   */
   public double getNewFGMissed() {
      return this.newFGMiss;
   }
   
   /**
   * Gets the projected turnovers of the player in the 2022-23 season
   * @return the future turnovers of the player
   */
   public double getNewTurnovers() {
      return this.newTurnovers;
   }
   
   /**
   * Gets the projected WS of the player in the 2022-23 season
   * @return the past WS of the player
   */
   public double getNewWS() {
      return this.newWS;
   }
   
   /**
   * Gets the projected Fantasy Score of the player in the 2022-23 season
   * @return the future Fantasy Score of the player
   */
   public double getNewFantasyScore() {
      return this.newFantasyScore;
   }
   
   /**
   * Gets the projected salary of the player in the 2022-23 season
   * @return the future salary of the player
   */
   public double getSalaryWorth() {
      return this.salaryWorth;
   }
   
   /*
      Mutators
   */
   
   /**
   * changes the name of the player
   * @param newName - new name of the player
   */
   public void setName(String newName) {
      this.name = newName;
   }
   
   /**
   * changes the team of the player
   * @param newTeam - new team of the player
   */
   public void setTeam(String newTeam) {
      this.team = newTeam;
   }
   
   /**
   * changes the age of the player
   * @param newAge - new age of the player
   */
   public void setAge(int newAge) {
      this.age = newAge;
   }
   
   /**
   * changes the amount of minutes in the past season
   * @param newOldMinutes - new amount of past minutes
   */
   public void setOldMinutes(double newOldMinutes) {
      this.oldMinutes = newOldMinutes;
   }
   
   /**
   * changes the amount of points in the past season
   * @param newOldPoints - new amount of past points
   */
   public void setOldPoints(double newOldPoints) {
      this.oldPoints = newOldPoints;
   }
   
   /**
   * changes the amount of rebounds in the past season
   * @param newOldRebounds - new amount of past rebounds
   */
   public void setOldRebounds(double newOldRebounds) {
      this.oldRebounds = newOldRebounds;
   }
   
   /**
   * changes the amount of assists in the past season
   * @param newOldAssists - new amount of past assists
   */
   public void setOldAssists(double newOldAssists) {
      this.oldAssists = newOldAssists;
   }
   
   /**
   * changes the amount of blocks in the past season
   * @param newOldBlocks - new amount of past blocks
   */
   public void setOldBlocks(double newOldBlocks) {
      this.oldBlocks = newOldBlocks;
   }
   
   /**
   * changes the amount of steals in the past season
   * @param newOldSteals - new amount of past steals
   */
   public void setOldSteals(double newOldSteals) {
      this.oldSteals = newOldSteals;
   }
   
   /**
   * changes the amount of OBPM in the past season
   * @param newOldOBPM - new amount of past OBPM
   */
   public void setOldOBPM(double newOldOBPM) {
      this.oldOBPM = newOldOBPM;
   }
   
   /**
   * changes the amount of DBPM in the past season
   * @param newOldDBPM - new amount of past DBPM
   */
   public void setOldDBPM(double newOldDBPM) {
      this.oldDBPM = newOldDBPM;
   }
   
   /**
   * changes the amount of BPM in the past season
   * @param newOldBPM - new amount of past BPM
   */
   public void setOldBPM(double newOldBPM) {
      this.oldBPM = newOldBPM;
   }
   
   /**
   * changes the amount of ORTG in the past season
   * @param newOldORTG - new amount of past ORTG
   */
   public void setOldORTG(double newOldORTG) {
      this.oldORTG = newOldORTG;
   }
   
   /**
   * changes the amount of DRTG in the past season
   * @param newOldDRTG - new amount of past DRTG
   */
   public void setOldDRTG(double newOldDRTG) {
      this.oldDRTG = newOldDRTG;
   }
   
   /**
   * changes the amount of VORP in the past season
   * @param newOldVORP - new amount of past ORTG
   */
   public void setOldVORP(double newOldVORP) {
      this.oldVORP = newOldVORP;
   }
   
   /**
   * changes the amount of PER in the past season
   * @param newOldPER - new amount of past PER
   */
   public void setOldPER(double newOldPER) {
      this.oldPER = newOldPER;
   }
   
   /**
   * changes the amount of FGM in the past season
   * @param newOldFGM - new amount of past FGM
   */
   public void setOldFGM(double newOldFGM) {
      this.oldFGM = newOldFGM;
   }
   
   /**
   * changes the amount of 3PTM in the past season
   * @param newOldThreePTM - new amount of past 3PTM
   */
   public void setOldThreePTM(double newOldThreePTM) {
      this.oldThreePTM = newOldThreePTM;
   }
   
   /**
   * changes the amount of FTM in the past season
   * @param newOldFTM - new amount of past FTM
   */
   public void setOldFTM(double newOldFTM) {
      this.oldFTM = newOldFTM;
   }
   
   /**
   * changes the amount of ORB in the past season
   * @param newOldORB - new amount of past ORB
   */
   public void setOldORB(double newOldORB) {
      this.oldORB = newOldORB;
   }
   
   /**
   * changes the amount of DRB in the past season
   * @param newOldDRB - new amount of past DRB
   */
   public void setOldDRB(double newOldDRB) {
      this.oldDRB = newOldDRB;
   }
   
   /**
   * changes the amount of fouls in the past season
   * @param newOldFouls - new amount of past fouls
   */
   public void setOldFouls(double newOldFouls) {
      this.oldFouls = newOldFouls;
   }
   
   /**
   * changes the amount of FT Missed in the past season
   * @param newOldFTMiss - new amount of past FT Missed
   */
   public void setOldFTMiss(double newOldFTMiss) {
      this.oldFTMiss = newOldFTMiss;
   }
   
   /**
   * changes the amount of FG Missed in the past season
   * @param newOldFGMiss - new amount of past FG Missed
   */
   public void setOldFGMiss(double newOldFGMiss) {
      this.oldFGMiss = newOldFGMiss;
   }
   
   /**
   * changes the amount of turnovers in the past season
   * @param newOldTurnovers - new amount of past turnovers
   */
   public void setOldTurnovers(double newOldTurnovers) {
      this.oldTurnovers = newOldTurnovers;
   }
   
   /**
   * changes the amount of WS in the past season
   * @param newOldWS - new amount of past WS
   */
   public void setOldWS(double newOldWS) {
      this.oldWS = newOldWS;
   }
   
   /**
   * changes the amount of fantasy score in the future season
   * @param newFantasyScore - new amount of future fantasy score
   */
   public void setOldNewFantasyScore(double newOldFantasyScore) {
      this.oldFantasyScore = newOldFantasyScore;
   }
   
   /**
   * changes the amount of minutes in the future season
   * @param newNewMinutes - new amount of future minutes
   */
   public void setNewMinutes(double newNewMinutes) {
      this.newMinutes = newNewMinutes;
   }
   
   /**
   * changes the amount of points in the future season
   * @param newNewPoints - new amount of future points
   */
   public void setNewPoints(double newNewPoints) {
      this.newPoints = newNewPoints;
   }
   
   /**
   * changes the amount of rebounds in the future season
   * @param newNewRebounds - new amount of future rebounds
   */
   public void setNewRebounds(double newNewRebounds) {
      this.newRebounds = newNewRebounds;
   }
   
   /**
   * changes the amount of assists in the future season
   * @param newNewAssists - new amount of future assists
   */
   public void setNewAssists(double newNewAssists) {
      this.newAssists = newNewAssists;
   }
   
   /**
   * changes the amount of blocks in the future season
   * @param newNewBlocks - new amount of future blocks
   */
   public void setNewBlocks(double newNewBlocks) {
      this.newBlocks = newNewBlocks;
   }
   
   /**
   * changes the amount of steals in the future season
   * @param newNewSteals - new amount of future steals
   */
   public void setNewSteals(double newNewSteals) {
      this.newSteals = newNewSteals;
   }
   
   /**
   * changes the amount of OBPM in the future season
   * @param newNewOBPM - new amount of future OBPM
   */
   public void setNewOBPM(double newNewOBPM) {
      this.newOBPM = newNewOBPM;
   }
   
   /**
   * changes the amount of DBPM in the future season
   * @param newNewDBPM - new amount of future DBPM
   */
   public void setNewDBPM(double newNewDBPM) {
      this.newDBPM = newNewDBPM;
   }
   
   /**
   * changes the amount of BPM in the future season
   * @param newNewBPM - new amount of future BPM
   */
   public void setNewBPM(double newNewBPM) {
      this.newBPM = newNewBPM;
   }
   
   /**
   * changes the amount of ORTG in the future season
   * @param newNewORTG - new amount of future ORTG
   */
   public void setNewORTG(double newNewORTG) {
      this.newORTG = newNewORTG;
   }
   
   /**
   * changes the amount of DRTG in the future season
   * @param newNewDRTG - new amount of future DRTG
   */
   public void setNewDRTG(double newNewDRTG) {
      this.newDRTG = newNewDRTG;
   }
   
   /**
   * changes the amount of VORP in the future season
   * @param newNewVORP - new amount of future ORTG
   */
   public void setNewVORP(double newNewVORP) {
      this.newVORP = newNewVORP;
   }
   
   /**
   * changes the amount of PER in the future season
   * @param newNewPER - new amount of future PER
   */
   public void setNewPER(double newNewPER) {
      this.newPER = newNewPER;
   }
   
   /**
   * changes the amount of FGM in the future season
   * @param newNewFGM - new amount of future FGM
   */
   public void setNewFGM(double newNewFGM) {
      this.newFGM = newNewFGM;
   }
   
   /**
   * changes the amount of 3PTM in the future season
   * @param newNewThreePTM - new amount of future 3PTM
   */
   public void setNewThreePTM(double newNewThreePTM) {
      this.newThreePTM = newNewThreePTM;
   }
   
   /**
   * changes the amount of FTM in the future season
   * @param newNewFTM - new amount of future FTM
   */
   public void setNewFTM(double newNewFTM) {
      this.newFTM = newNewFTM;
   }
   
   /**
   * changes the amount of ORB in the future season
   * @param newNewORB - new amount of future ORB
   */
   public void setNewORB(double newNewORB) {
      this.newORB = newNewORB;
   }
   
   /**
   * changes the amount of DRB in the future season
   * @param newNewDRB - new amount of future DRB
   */
   public void setNewDRB(double newNewDRB) {
      this.newDRB = newNewDRB;
   }
   
   /**
   * changes the amount of fouls in the future season
   * @param newNewFouls - new amount of future fouls
   */
   public void setNewFouls(double newNewFouls) {
      this.newFouls = newNewFouls;
   }
   
   /**
   * changes the amount of FT Missed in the future season
   * @param newNewFTMiss - new amount of future FT Missed
   */
   public void setNewFTMiss(double newNewFTMiss) {
      this.newFTMiss = newNewFTMiss;
   }
   
   /**
   * changes the amount of FG Missed in the future season
   * @param newNewFGMiss - new amount of future FG Missed
   */
   public void setNewFGMiss(double newNewFGMiss) {
      this.newFGMiss = newNewFGMiss;
   }
   
   /**
   * changes the amount of turnovers in the future season
   * @param newNewTurnovers - new amount of future turnovers
   */
   public void setNewTurnovers(double newNewTurnovers) {
      this.newTurnovers = newNewTurnovers;
   }
   
   /**
   * changes the amount of WS in the future season
   * @param newNewWS - new amount of future WS
   */
   public void setNewWS(double newNewWS) {
      this.newWS = newNewWS;
   }
   
   /**
   * changes the amount of fantasy score in the future season
   * @param newFantasyScore - new amount of future fantasy score
   */
   public void setNewNewFantasyScore(double newNewFantasyScore) {
      this.newFantasyScore = newNewFantasyScore;
   }
   
   /**
   * changes the amount of salary worth in the future season
   * @param newSalaryWorth - new amount of future salary worth
   */
   public void setSalaryWorth(double newSalaryWorth) {
      this.salaryWorth = newSalaryWorth;
   }
   
   // Methods
   
   /**
   * projection()
   * Takes their current stats and projects next year results.
   */
   public void projection() {
      this.ageProgression();
      this.teamProgression();
      this.bellCurve();
   }
   
   /**
   * ageProgression()
   * Implements the age curve.
   * Each age is assigned an adjustment factor that determines their improvement and regression.
   * The adjustment factor is used in calulations of different weighting that predicts the player's future stats.
   */
   public void ageProgression() {
      double adjustmentFactor = 1;
      
      // determines adjustment factor based on age
      if (age == 19) {
         adjustmentFactor = 1.9600;
      } else if (age == 20) {
         adjustmentFactor = 1.8496;
      } else if (age == 21) {
         adjustmentFactor = 1.7424;
      } else if (age == 22) {
         adjustmentFactor = 1.6384;
      } else if (age == 23) {
         adjustmentFactor = 1.5276;
      } else if (age == 24) {
         adjustmentFactor = 1.4400;
      } else if (age == 25) {
         adjustmentFactor = 1.3456;
      } else if (age == 26) {
         adjustmentFactor = 1.2544;
      } else if (age == 27) {
         adjustmentFactor = 1.1664;
      } else if (age == 28) {
         adjustmentFactor = 1.0816;
      } else if (age == 29) {
         adjustmentFactor = 1.000;
      } else if (age == 30) {
         adjustmentFactor = 1.000;
      } else if (age == 31) {
         adjustmentFactor = 0.9865;
      } else if (age == 32) {
         adjustmentFactor = 0.9612;
      } else if (age == 33) {
         adjustmentFactor = 0.9231;
      } else if (age == 34) {
         adjustmentFactor = 0.8942;
      } else if (age == 35) {
         adjustmentFactor = 0.8512;
      } else if (age == 36) {
         adjustmentFactor = 0.7972;
      } else if (age == 37) {
         adjustmentFactor = 0.7223;
      } else if (age == 37) {
         adjustmentFactor = 0.6489;
      } else if (age == 38) {
         adjustmentFactor = 0.5323;
      } else if (age == 39) {
         adjustmentFactor = 0.4123;
      } else if (age == 40) {
         adjustmentFactor = 0.2351;
      } else if (age == 41) {
         adjustmentFactor = 0.1234;
      }
      
      // every stat except VORP, PER, and Fantasy Score are predicted based on the adjustment factor
      this.newMinutes = this.oldMinutes*(Math.pow(adjustmentFactor, 0.18));
      this.newPoints = this.oldPoints*(Math.pow(adjustmentFactor, 0.40));
      this.newORB = this.oldORB*(Math.pow(adjustmentFactor, 0.33));
      this.newDRB = this.oldDRB*(Math.pow(adjustmentFactor, 0.45));
      this.newRebounds = this.newORB+this.newDRB;
      this.newAssists = this.oldAssists*(Math.pow(adjustmentFactor, 0.40));
      this.newBlocks = this.oldBlocks*(Math.pow(adjustmentFactor, 0.30));
      this.newSteals = this.oldSteals*(Math.pow(adjustmentFactor, 0.25));
      this.newOBPM = this.oldOBPM+(Math.pow(adjustmentFactor, 0.35)*1.2);
      this.newDBPM = this.oldDBPM+(Math.pow(adjustmentFactor, 0.35)*0.9);
      this.newBPM = this.newOBPM + this.newDBPM;
      this.newORTG = this.oldORTG*(Math.pow(adjustmentFactor, 0.08));
      this.newDRTG = this.oldDRTG/(Math.pow(adjustmentFactor, 0.06));
      this.newFGM = this.oldFGM*(Math.pow(adjustmentFactor, 0.45));
      this.newThreePTM = this.oldThreePTM*(Math.pow(adjustmentFactor, 0.40));
      this.newFTM = this.oldFTM*(Math.pow(adjustmentFactor, 0.5));
      this.newFouls = this.oldFouls*(Math.pow(adjustmentFactor, 0.2));
      this.newFTMiss = this.oldFTMiss*(Math.pow(adjustmentFactor, 0.37));
      this.newFGMiss = this.oldFGMiss*(Math.pow(adjustmentFactor, 0.3));
      this.newTurnovers = this.oldTurnovers*(1.0+(Math.abs(adjustmentFactor-1)))*0.7; 
      this.newWS = ((this.oldWS+2.0)*Math.pow(adjustmentFactor,0.5)-2);
      
      // VORP, PER, Fantasy Score, and Salary Worth is projected
      this.calculateVORP();
      this.calculatePER();
      this.newFantasyScore = calculateFantasyScore(this.newPoints, this.newRebounds, this.newAssists, this.newSteals, this.newBlocks, this.newTurnovers);
      this.salaryProjection();
   }
   
   /**
   * round()
   * Rounds all the attributes to two decimal places.
   */
   public void roundAll() {
      
      this.oldMinutes = round(this.oldMinutes);
      this.oldPoints = round(this.oldPoints);
      this.oldRebounds = round(this.oldRebounds);
      this.oldAssists = round(this.oldAssists);
      this.oldBlocks = round(this.oldBlocks);
      this.oldSteals = round(this.oldSteals);
      this.oldOBPM = round(this.oldOBPM);
      this.oldDBPM = round(this.oldDBPM);
      this.oldBPM = round(this.oldBPM);
      this.oldORTG = round(this.oldORTG);
      this.oldDRTG = round(this.oldDRTG);
      this.oldVORP = round(this.oldVORP);
      this.oldPER = round(this.oldPER);
      this.oldFGM = round(this.oldFGM);
      this.oldThreePTM = round(this.oldThreePTM);
      this.oldFTM = round(this.oldFTM);
      this.oldORB = round(this.oldORB);
      this.oldDRB = round(this.oldDRB);
      this.oldFouls = round(this.oldFouls);
      this.oldFTMiss = round(this.oldFTMiss);
      this.oldFGMiss = round(this.oldFGMiss);
      this.oldTurnovers = round(this.oldTurnovers);
      this.oldWS = round(this.oldWS);
      this.oldFantasyScore = round(this.oldFantasyScore);
      
      this.newMinutes = round(this.newMinutes);
      this.newPoints = round(this.newPoints);
      this.newRebounds = round(this.newRebounds);
      this.newAssists = round(this.newAssists);
      this.newBlocks = round(this.newBlocks);
      this.newSteals = round(this.newSteals);
      this.newOBPM = round(this.newOBPM);
      this.newDBPM = round(this.newDBPM);
      this.newBPM = round(this.newBPM);
      this.newORTG = round(this.newORTG);
      this.newDRTG = round(this.newDRTG);
      this.newVORP = round(this.newVORP);
      this.newPER = round(this.newPER);
      this.newFGM = round(this.newFGM);
      this.newThreePTM = round(this.newThreePTM);
      this.newFTM = round(this.newFTM);
      this.newORB = round(this.newORB);
      this.newDRB = round(this.newDRB);
      this.newFouls = round(this.newFouls);
      this.newFTMiss = round(this.newFTMiss);
      this.newFGMiss = round(this.newFGMiss);
      this.newTurnovers = round(this.newTurnovers);
      this.newWS = round(this.newWS);
      this.newFantasyScore = round(this.newFantasyScore);
   }
   
   
   /**
   * round()
   * Rounds double to two decimal places.
   */
   public double round(double number) {     
      double rounded;
      number = Math.round(number*100);
      rounded = number/100;
      
      return rounded;
   }

   
   /**
   * teamProgression()
   * Adjust stats based on team getting better or worse.
   * Next steps
   */
   public void teamProgression() {
      
   }
   
   /**
   * bellCurve()
   * Bell curves the attributes of the players so reduce anomalies and increase accuracy.
   * Next steps
   */
   public void bellCurve() {
      
   }
   
   /**
   * calculateVORP()
   * Calculates the player's Value Over Replacement Player from projected Box Plus/Minus.
   */
   public void calculateVORP() {
      double VORP = 0;
      
      // VORP Formula
      VORP = (this.newBPM+2.0)*(this.newMinutes/48.0)*82.0/82.0;
      
      this.newVORP = VORP;
   }
   
   /**
   * calculatePER()
   * Calculates the player's Efficiency Rating from projected Box Plus/Minus.
   */
   public void calculatePER() {
      double PER = 0;
      
      // Linear Weighted PER formula (less accurate but coefficients are estimates of league factors)
      PER += (this.newFGM*85.91);
      PER += (this.newSteals*53.897);
      PER += (this.newThreePTM*51.757);
      PER += (this.newFTM*46.845);
      PER += (this.newORB*39.190);
      PER += (this.newAssists*34.677);
      PER += (this.newDRB*14.707);
      PER -= (this.newFouls*17.174);
      PER -= (this.newFTMiss*20.091);
      PER -= (this.newFGMiss*39.190);
      PER -= (this.newTurnovers*53.897);
      PER = (PER/this.newMinutes);
      
      this.newPER = PER;
   }
   
   /**
   * calculateFantasyScore(double points, double rebounds, double assists, double blocks, double steals, double turnovers)
   * Determines a fantasy score for the player (need to be able to calculate for past season too).
   * @param points: points of the player (any season)
   * @param rebounds: rebounds of the player (any season)
   * @param assists: assists of the player (any season)
   * @param blocks: blocks of the player (any season)
   * @param steals: steals of the player (any season)
   * @param turnovers: turnovers of the player (any season)
   * @return fantasyScore: the fantasy score of the player for the year
   */
   public double calculateFantasyScore(double points, double rebounds, double assists, double blocks, double steals, double turnovers) {
      double fantasyScore = 0;
      
      // Fantasy Score formula - main stats are assigned a basic coefficient
      fantasyScore += (1.0*points);
      fantasyScore += (1.2*rebounds);
      fantasyScore += (1.5*assists);
      fantasyScore += (3.0*steals);
      fantasyScore += (3.0*blocks);
      fantasyScore += (-1.0*turnovers);
      
      return fantasyScore;
   }
   
   /**
   * salaryProjection()
   * Calculates what a player should be getting paid.
   */
   public void salaryProjection() {
      double salary = 0;
      
      // each 1.0 VORP is worth approximately 11 million in salary; calculates player's worth
      salary = this.newVORP * 11111287.60;
      
      this.salaryWorth = salary;
      
      this.salaryWorth = round(this.salaryWorth*0.000001);  // rounding and converting to millions of dollars
   }
   
   /**
   * overUnder(String stat, double number)
   * Whether the projection expects the player to have over or under the inputted stat.
   * @param stat: stat from the player to be compared
   * @param steals: O/U set for the stat
   * @return overUnder: whether the user should bet on the over or under based on projections
   */
   public String overUnder(String stat, double number) {
      String overUnder = "";
      double value = 0;
      
      try {
         // very, very annoying way to get the attribute from the given string
         // Python >>>
         value = (double)(this.getClass().getField(stat).get(this));
         
         // if the player's projected stat is less than given number, computer instructs them to pick the under
         // and vice versa for the opposite (pick the over)
         if (value < number){
            overUnder = "Under";
         } else {
            overUnder = "Over";
         }
      }
      // if the given string is not an attribute or any other error
      catch (Exception e) { 
         overUnder = "Sorry, we don't offer bets on your stat.";
      }
      
      return overUnder;
   }
   
   /**
   * topFive(List<Player> league, String stat)
   * The top 5 projected players for the given stat.
   * @param league: the league and arraylist with all of the created players.
   * @param stat: the stat that the user wants to find the top 5 players for
   * @return standings: the top 5 players (ranked in order) for the given stat.
   */
   public static String topFive(List<Player> league, String stat) {
      
      String standings = ""; // return string
      
      // names and current rankings
      String rank1Name = "";
      String rank2Name = "";
      String rank3Name = "";
      String rank4Name = "";
      String rank5Name = "";
      double rank1 = 0;
      double rank2 = 0;
      double rank3 = 0;
      double rank4 = 0;
      double rank5 = 0;
      double value = 0;
      double numberHolder;
      
      //placeholder player for simplicity
      Player placeholder = new Player("placeholder", "LOL", 0, 00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      
      try {
         for (int i = 0; i < league.size(); i++) { // runs through all players in the league
            
            placeholder = league.get(i);  // copy player at i
            value = (double)(placeholder.getClass().getField(stat).get(placeholder));  // get the value of their stat
            
            if (value >= rank1) {   // if it is greater than rank 1, it takes over and everyone moves down
               rank5 = rank4;
               rank5Name = rank4Name;
               rank4 = rank3;
               rank4Name = rank3Name;
               rank3 = rank2;
               rank3Name = rank2Name;
               rank2 = rank1;
               rank2Name = rank1Name;
               rank1 = value;
               rank1Name = placeholder.getName();
            } else if (value >= rank2) {  // if it is greater than rank 2, it takes over and everyone moves down
               rank5 = rank4;
               rank5Name = rank4Name;
               rank4 = rank3;
               rank4Name = rank3Name;
               rank3 = rank2;
               rank3Name = rank2Name;
               rank2 = value;
               rank2Name = placeholder.getName();
            } else if (value >= rank3) {  // if it is greater than rank 3, it takes over and everyone moves down
               rank5 = rank4;
               rank5Name = rank4Name;
               rank4 = rank3;
               rank4Name = rank3Name;
               rank3 = value;
               rank3Name = placeholder.getName();
            } else if (value >= rank4) {  // if it is greater than rank 4, it takes over and everyone moves down
               rank5 = rank4;
               rank5Name = rank4Name;
               rank4 = value;
               rank4Name = placeholder.getName();
            } else if (value >= rank5) {  // if it is greater than rank 5, it takes over and everyone moves down
               rank5 = value;
               rank5Name = placeholder.getName();
            }
         }
         
         // creates string return formatted
         standings += "Top 5 for ";
         standings += stat;
         standings += "\n\n1: ";
         standings += rank1Name;
         standings += ": ";
         standings += rank1;
         standings += "\n2: ";
         standings += rank2Name;
         standings += ": ";
         standings += rank2;
         standings += "\n3: ";
         standings += rank3Name;
         standings += ": ";
         standings += rank3;
         standings += "\n4: ";
         standings += rank4Name;
         standings += ": ";
         standings += rank4;
         standings += "\n5: ";
         standings += rank5Name;
         standings += ": ";
         standings += rank5;
         standings += "\n";
      }
      // if the given string is not an attribute or any other error
      catch (Exception e) { 
         standings = "Sorry, not a stat.";
      }
      
      return standings;
   }
   
   /**
   * awardsPredictor(List<Player> league, String awardName)
   * Gives top 5 projected finalists for the given award.
   * @param league: the league and arraylist with all of the created players.
   * @param awardName: the award that the user wants to find the finalists for
   * @return award: the top 3 players (ranked in order) for the given award.
   */
   public static String awardPredictor(List<Player> league, String awardName) {
     
      String award = ""; // return string
      
      // names and current rankings
      double value = 0;
      double rank1 = 0;
      double rank2 = 0;
      double rank3 = 0;
      String rank1Name = "";
      String rank2Name = "";
      String rank3Name = "";
      
      // pleaceholders for simplicity
      String stat = "";
      double minutesComparable = 48;   // for everyone except 6MOY candidates to fall under the necessary threshold
      double minutes = 0;
      
      Player placeholder = new Player("placeholder", "LOL", 0, 00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   
      // connect stats to the awards to prepare for evaluation
      
      if (awardName.equals("MVP")) {
         stat = "newVORP"; 
      }
      else if (awardName.equals("DPOY")) {
         stat = "newDBPM";
      }
      else if (awardName.equals("6MOY")) {
         stat = "newVORP";
         minutesComparable = 28;
         // playing 28 minutes or less roughly qualifies you for 6MOY
      }
      else if (awardName.equals("MIP")) {
         stat = "newVORP";
      }
      else 
      {
         award = "Not sure what award you're looking for. Please type MVP, DPOY, 6MOY, MIP";
      }
      
      try {
         for (int i = 0; i < league.size(); i++) {    // runs through all players in the league
            
            //copy player for simplicity
            placeholder = league.get(i);
            value = (double)(placeholder.getClass().getField(stat).get(placeholder));  // get value of necessary stat
            
            if (awardName.equals("MIP")) {  // since the award is for improvement, I also need to use past stats and measure the change in VORP
               value -= placeholder.getOldVORP();
            }
            
            minutes = placeholder.getNewMinutes(); // get minutes
            
            if (value >= rank1 && minutes <= minutesComparable) { // if it is greater than rank 1 and is less than the minutes requirement (6MOY only), it takes over and everyone moves down
               rank3 = rank2;
               rank3Name = rank2Name;
               rank2 = rank1;
               rank2Name = rank1Name;
               rank1 = value;
               rank1Name = placeholder.getName();
            } else if (value >= rank2 && minutes <= minutesComparable) { // if it is greater than rank 2 and is less than the minutes requirement (6MOY only), it takes over and everyone moves down
               rank3 = rank2;
               rank3Name = rank2Name;
               rank2 = value;
               rank2Name = placeholder.getName();
            } else if (value >= rank3 && minutes <= minutesComparable) { // if it is greater than rank 3 and is less than the minutes requirement (6MOY only), it takes over and everyone moves down
               rank3 = value;
               rank3Name = placeholder.getName();
            } 
         }
         
         // creates string return formatted
         award += "Top 5 for ";
         award += awardName;
         award += "\n\n1: ";
         award += rank1Name;
         award += "\n2: ";
         award += rank2Name;
         award += "\n3: ";
         award += rank3Name;
         award += "\n\n";
      }
      // if the given string is not an attribute or any other error
      catch (Exception e) { 
         award = "Sorry, not a compatible award.";
      }
   
      return award;
   }
   
   /**
   * awardsPredictor(List<Player> league)
   * Gives top 3 projected finalists for each award.
   * MVP uses VORP
   * DPOY uses DBPM+blocks+steals
   * 6MOY uses a player with less than 30 minutes who has the highest VORP
   * MIP uses change in PER/VORP
   * Runs through all awards indiviudally in method above.
   * @param league: to run through method above, the ArrayList(Player> parameter is needed
   * @return standings: the standings of all the award finalists
   */
   public static String awardsPredictor(List<Player> league) {
      String standings = "";
      
      // get all the award finalists and format them all in a string
      standings += awardPredictor(league, "MVP");
      standings += "\n";
      standings += awardPredictor(league, "DPOY");
      standings += "\n";
      standings += awardPredictor(league, "6MOY");
      standings += "\n";
      standings += awardPredictor(league, "MIP");
      
      return standings;
   }
   
   /**
   * findPlayer(List<Player> league, String nameInput)
   * Finds attributes of player that the user inputs.
   * @param league: to run through method above, the ArrayList(Player> parameter is needed
   * @param nameInput: player to be found
   * @return standings: the standings of all the award finalists
   */
   public static String findPlayer(List<Player> league, String nameInput) {
      
      String message = "Sorry, doesn't exist.";
   
      Player placeholder = new Player("placeholder", "LOL", 0, 00, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      
      for (int i = 0; i < league.size(); i++) {    // runs through all players in the league
         
         placeholder = league.get(i);
         
         if (nameInput.equals(placeholder.getName())) {  // if the name matches, it gets the attributes
            message = placeholder.toString();
         }
            
      }
      
      return message;
   }
   
   /**
   * toString()
   * Returns a string with the attributes of the player.
   * @return returnString: string with the past and projected stats of player
   */
   public String toString() {
      String returnString = "";
      
      returnString += "Name: ";
      returnString += this.name;
      returnString += "\nAge: ";
      returnString += this.age;
      returnString += "\nMinutes: 2021-22: ";
      returnString += this.oldMinutes;
      returnString += " 2022-2023: ";
      returnString += this.newMinutes;
      returnString += "\nPoints: 2021-22: ";
      returnString += this.oldPoints;
      returnString += " 2022-2023: ";
      returnString += this.newPoints;
      returnString += "\nRebounds: 2021-22: ";
      returnString += this.oldRebounds;
      returnString += " 2022-2023: ";
      returnString += this.newRebounds;
      returnString += "\nAssists: 2021-22: ";
      returnString += this.oldAssists;
      returnString += " 2022-2023: ";
      returnString += this.newAssists;
      returnString += "\nBlocks: 2021-22: ";
      returnString += this.oldBlocks;
      returnString += " Blocks: ";
      returnString += this.newBlocks;
      returnString += "\nSteals: 2021-22: ";
      returnString += this.oldSteals;
      returnString += " 2022-2023: ";
      returnString += this.newSteals;
      returnString += "\nFouls: 2021-22: ";
      returnString += this.oldFouls;
      returnString += " 2022-2023: ";
      returnString += this.newFouls;
      returnString += "\nTurnovers: 2021-22: ";
      returnString += this.oldTurnovers;
      returnString += " 2022-2023: ";
      returnString += this.newTurnovers;
      returnString += "\nFGM: 2021-22: ";
      returnString += this.oldFGM;
      returnString += " 2022-2023: ";
      returnString += this.newFGM;
      returnString += "\n3PTM: 2021-22: ";
      returnString += this.oldThreePTM;
      returnString += " 2022-2023: ";
      returnString += this.newThreePTM;
      returnString += "\nFG Missed: 2021-22: ";
      returnString += this.oldFGMiss;
      returnString += " 2022-2023: ";
      returnString += this.newFGMiss;
      returnString += "\nFT Missed: 2021-22: ";
      returnString += this.oldFTMiss;
      returnString += " 2022-2023: ";
      returnString += this.newFTMiss;
      returnString += "\nOBPM: 2021-22: ";
      returnString += this.oldOBPM;
      returnString += " 2022-2023: ";
      returnString += this.newOBPM;
      returnString += "\nDBPM: 2021-22: ";
      returnString += this.oldDBPM;
      returnString += " 2022-2023: ";
      returnString += this.newDBPM;
      returnString += "\nBPM: 2021-22: ";
      returnString += this.oldBPM;
      returnString += " 2022-2023: ";
      returnString += this.newBPM;
      returnString += "\nORTG: 2021-22: ";
      returnString += this.oldORTG;
      returnString += " 2022-2023: ";
      returnString += this.newORTG;
      returnString += "\nDRTG: 2021-22: ";
      returnString += this.oldDRTG;
      returnString += " 2022-2023: ";
      returnString += this.newDRTG;
      returnString += "\nPER: 2021-22: ";
      returnString += this.oldPER;
      returnString += " 2022-2023: ";
      returnString += this.newPER;
      returnString += "\nWS: 2021-22: ";
      returnString += this.oldWS;
      returnString += " 2022-2023: ";
      returnString += this.newWS;
      returnString += "\nVORP: 2021-22: ";
      returnString += this.oldVORP;
      returnString += " 2022-2023: ";
      returnString += this.newVORP;
      returnString += "\nFantasy Score: 2021-22: ";
      returnString += this.oldFantasyScore;
      returnString += " 2022-2023: ";
      returnString += this.newFantasyScore;
      returnString += "\nSalary Worth: 2022-23: $";
      returnString += this.salaryWorth;
      returnString += " Million \n";
            
      return returnString;
   }
}