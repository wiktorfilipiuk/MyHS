package Cards;


public class SpellCard extends Card{
  
  
  public SpellCard(){
    super();
  }
  
  public SpellCard(String name, int cost){
    super(name, cost);
  }
  @Override
  protected void specialEffect(){}
  @Override
  public void showCardInfo(){
    System.out.println("Minion: " + super.getName() + ", Cost: " + super.getCost() );
  }
}