package Cards;

public class WeaponCard extends Card {
  private int durability;
  private int attack;
  
  /* Default constructor */
  public WeaponCard(){
    super();
  }
  
  /* Constructor */
  public WeaponCard(String name, int cost, int attack, int durability){
    super(name, cost);
    this.durability = durability;
    this.attack = attack;
  }
  // Set methods
  public void setDurability(int durability){
    this.durability = durability;
  }
  public void setAttack(int attack){
    this.attack = attack;
  }
  // Get methods
  public int getDurability(){
    return this.durability;
  }
  public int getAttack(){
    return this.attack;
  }
  
  
  /* Attack action performed by a weapon on a minion. */
  public void attackAction(MinionCard target){
    if(this.durability <= 0){
      System.out.println("This weapon's durability is 0. It cannot be used any more!");
      return ;
    }
    System.out.println(this.name + "(" + this.durability + ") attacks " + target.getName() + "(" + target.getHp() + ")");
    int targetHp = target.getHp() - this.attack;
    if(targetHp <= 0) {
      target.setHp(0);
    }
    else {
      target.setHp(targetHp);
    }
    this.durability -= 1;
    System.out.println(this.name + "(" + this.durability + ") attacks " + target.getName() + "(" + target.getHp() + ")");
   }
  @Override
  protected void specialEffect(){}
  @Override
  public void showCardInfo(){
    System.out.println("Weapon: " + super.getName() + ", Cost: " + super.getCost() 
		       + ", Attack: " + this.getAttack() + ", Durability: " + this.getDurability());
  }
}