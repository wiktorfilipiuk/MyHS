import Cards.*;
import Board.*;
import Players.*;


public class playHS{
  public static void main(String []args){
  
    if(args != null){
      Player player1 = new Player(args[0]);
      Player player2 = new Player(args[1]);
    }
    
    MinionCard dw = new MinionCard("Deathwing", 10, 12, 12);
    MinionCard janusz = new MinionCard("Silverhand Recruit", 0, 1, 1);
    WeaponCard winaxe = new WeaponCard("Fiery Waraxe", 2, 3, 2);
    
    Player mesuri = new Player("Mesuri");   
    Card multipleCards[] = {janusz, janusz, janusz, janusz, janusz,
			    janusz, janusz, janusz, janusz, janusz,
			    janusz, janusz, janusz, janusz, janusz,
			    janusz, janusz, janusz, janusz, janusz,
			    janusz, janusz, janusz, janusz, janusz,
			    janusz, janusz, janusz, janusz, janusz};
    mesuri.addCardToDeck(winaxe);
    mesuri.addCardToDeck(winaxe);
    mesuri.addCardToDeck(winaxe);
    mesuri.addCardToDeck(multipleCards);
    
    //mesuri.showDeck();
    System.out.println(multipleCards.length);
    
    
    System.out.print("Hearthstone dziala!\n");
  }
}
