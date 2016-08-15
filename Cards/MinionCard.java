package Cards;

/*
*  Class extends the basic Card class.
*  It allows creating minionCards.
*/

public class MinionCard extends Card{
  
  private int attack;
  private int hp;
  
  /* Class' constructor */
  public MinionCard(String name, int cost, int attack, int hp){
    this.name = name;
    this.cost = cost;
    this.attack = attack;
    this.hp = hp;
  }
  // Getter Methods
  /* Method returns value of current HP of the minion. */
  public int getHp(){
    return this.hp;
  }
  
  /* Method returns value of current attack of the minion. */
  public int getAttack(){
    return this.attack;
  }
  
  // Setter methods
  /* Method sets value of HP of the minion. */
  public void setHp(int hp){
    this.hp = hp;
  }
  
  /* Method sets value of attack of the minion. */
  public void setAttack(int attack){
    this.attack = attack;
  }
  
  /* Method allows a minionCard to attack another minion. */
  public void attack(MinionCard target){
    System.out.println(this.name + "(" + this.hp + ") attacks " + target.getName() + "(" + target.getHp() + ")");
    int targetHp = target.getHp() - this.attack;
    int thisHp = this.hp - target.getAttack();
    if(targetHp <= 0) {
      target.setHp(0);
    }
    else {
      target.setHp(targetHp);
    }
    
    if(thisHp <= 0) {
      this.setHp(0);
    }
    else {         
      this.setHp(thisHp);
    }
    
    System.out.println(this.name + "(" + this.hp + ")         " + target.getName() + "(" + target.getHp() + ")");
  }
  
}