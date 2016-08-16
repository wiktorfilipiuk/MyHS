package Players;

import java.util.*;

import Cards.Card;
import Board.PlayerBoardInterface;
import CardDatabase.CardsDB;

public class Player implements PlayerBoardInterface{

  private final String playerName;
  private String className;
  
  private Card[] deck = new Card[30];
  private int lastCardNumber = 0;
  List<Card> hand = new ArrayList<Card>(); 
  
  
  /* Class' constructor */
  public Player(String playerName){
    this.playerName = playerName;
  }
  
  // Get methods
  /* Method returns name of the player. */
  public String getPlayerName(){
    return this.playerName;
  }
  
  /* Method returns name of the player's class. */
  public String getClassName(){
    return this.className;
  }
  
  // Set methods
  /* Method sets name of the player's class. */
  public void setClassName(String className){
    this.className = className;
  }
  
  // Remaining methods
  /* Method adds a single card to the deck. */
  public void addCardToDeck(Card card){
    this.deck[this.lastCardNumber] = card;
    this.lastCardNumber++;
  }
  /* Method adds multiple cards to the deck. */
  public void addCardToDeck(Card cardDeck[]){
    if( lastCardNumber >= 30 ){
      System.out.println("Error: Your deck is full.");
      return ;
    }
    
    for(Card card : cardDeck){
      if(lastCardNumber < 30){
	this.deck[lastCardNumber] = card;
	lastCardNumber++;
      }
      else{
	System.out.println("Deck is already full");
	return ;
      }
    }
  }
  
  public void showDeck(){  
    for(int i = 0; i < (this.lastCardNumber); i++){
      System.out.println(i + ": " + deck[i].getName());
    }
  }

  public void putCardToHand(Card card){
    this.hand.add(card);
  }
  
  /* Method implementation from the PlayerBoardInterface */
  @Override
  public void playCard(){
    
  }
  
  @Override
  public void mulligan(){
    
  }
  

  
  
}







