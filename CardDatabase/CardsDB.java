package CardDatabase;

import java.io.*;
import java.util.*;
import java.sql.*;

import Cards.*;


public class CardsDB {
  
  List<Card> database = new ArrayList<Card>(); 
  String filepath;
  /* Constructor of the database */
  public CardsDB(String filepath){
    this.filepath = filepath;
  }
  
  /* Method reads the cards that are available in the database and returns a single array containing all of them */
  public void loadDatabase(){    
    try{
      
      Scanner fileIn = new Scanner(new File(this.filepath));
      String line;
      while(fileIn.hasNextLine()){
	line = fileIn.nextLine();
	
	/* Dividing line-string and adding cards to the database */
 	this.splitAndAddCardToDB(line);
	
      }
      fileIn.close();
    }catch(FileNotFoundException e){
      System.out.println("File not found!");
    }
  }
  
  private void splitAndAddCardToDB(String line){
    String[] splittedLine = line.split("\\s+");
    int length = splittedLine.length;
    String name = "";

    
    if(splittedLine[0].equals("Minion")){
      for(int i = 1; i<length-3; i++){
	name += splittedLine[i];
      }
      
      this.database.add(new MinionCard( name, Integer.parseInt(splittedLine[length-3]), Integer.parseInt(splittedLine[length-2]), Integer.parseInt(splittedLine[length-1]) ));
    }
    else if(splittedLine[0].equals("Weapon")){
      for(int i = 1; i<length-3; i++){
	name += splittedLine[i];
      }
      this.database.add(new WeaponCard( name, Integer.parseInt(splittedLine[length-3]), Integer.parseInt(splittedLine[length-2]), Integer.parseInt(splittedLine[length-1])  ));
    }
    else if(splittedLine[0].equals("Spell")){
      for(int i = 1; i<length; i++){
	  name += splittedLine[i];
	}
      this.database.add(new SpellCard(name, Integer.parseInt(splittedLine[length-1]) ));
    }
  }
  
  public void showAvailableCards(){
    for(Card card : database){
      card.showCardInfo();
    }
  }
  
  
}













