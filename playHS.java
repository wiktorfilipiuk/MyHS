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
      }
    }
    
    CardsDB db = new CardsDB(filepath);
    db.loadDatabase();
//     db.showAvailableCards();
    
//     MinionCard dw = new MinionCard("Deathwing", 10, 12, 12);
//     MinionCard janusz = new MinionCard("Silverhand Recruit", 0, 1, 1);
//     WeaponCard winaxe = new WeaponCard("Fiery Waraxe", 2, 3, 2);
//     
//     Player mesuri = new Player("Mesuri");   
//     Card multipleCards[] = {janusz, janusz, janusz, janusz, janusz,
// 			    janusz, janusz, janusz, janusz, janusz,
// 			    janusz, janusz, janusz, janusz, janusz,
// 			    janusz, janusz, janusz, janusz, janusz,
// 			    janusz, janusz, janusz, janusz, janusz,
// 			    janusz, janusz, janusz, janusz, janusz};
//     mesuri.addCardToDeck(winaxe);
//     mesuri.addCardToDeck(winaxe);
//     mesuri.addCardToDeck(winaxe);
//     mesuri.addCardToDeck(multipleCards);
//     
//     //mesuri.showDeck();
//     System.out.println(multipleCards.length);
    
    
    System.out.print("Hearthstone dziala!\n");
  }


}






















