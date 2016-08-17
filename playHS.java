import Cards.*;
import Board.*;
import Players.*;
import CardDatabase.*;

public class playHS{

  

  static public void main(String []args){
  
    Player player1 = null, 
	   player2 = null;
    String filepath = null;
    System.out.println("----------START----------");
    if(args != null){
      for(int i = 0;  i < args.length; i++){
	if(args[i].equals("-p1")){
	  System.out.println("Player 1 initialized");
	  player1 = new Player(args[i + 1]);
	}
	else if(args[i].equals("-p2")){
	  System.out.println("Player 2 initialized");
	  player2 = new Player(args[i + 1]);
	}
	else if(args[i].equals("-filepath")){
	  filepath = args[i+1];
	  filepath = System.getProperty("user.dir").concat(filepath);
	  System.out.println("Reading available cards from the file: " + args[i+1]);
	}
	else if(args[i].equals("-c1")){
	  player1.setClass(args[i+1]);
	}
	else if(args[i].equals("-c2")){
	  player2.setClass(args[i+1]);
	}
      }
    }
    
    CardsDB db = new CardsDB(filepath);
    db.loadDatabase();
    
    
    
    
    System.out.print("Hearthstone dziala!\n");
  }


}






















