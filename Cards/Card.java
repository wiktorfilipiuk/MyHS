package Cards;

import Cards.CardClass;

/*
 * Basic class for all possible cards in Hearthstone
 * 
 */


public abstract class Card{

  protected String name;
  protected int cost;
  //protected String rarityType;
  //protected String classType;
  /* Default constructor */
  public Card() {}
  
  /* Constructor */
  public Card(String name, int cost){
    this.name = name;
    this.cost = cost;
  }
  // Get methods
  /* Method returns name of the card */
  public String getName(){
    return this.name;
  }
  /* Method returns cosr of the card */
  public int getCost(){
    return this.cost;
  }
  
  // Set methods
  /* Method sets name of the card */
  public void setName(String name){
    this.name = name;
  }
  
  /* Method sets cost of the card */
  public void setCost(int cost){
    this.cost = cost;
  }
  
  protected void finalize(){
    System.out.println(this.name + " is being destroyed!");
  }
  
  abstract protected void specialEffect();
  abstract public void showCardInfo();
}