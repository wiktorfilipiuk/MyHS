package Classes;




public abstract class Classes{

  public enum Voice{
    GREET,
    FAREWELL,
    WOW,
    APOLOGIZE,
    MISTAKE,
    TAUNT
  }
  
  protected String myClassName;
  protected String heroPowerName;
  protected int HP = 30;
  
  public int getHp(){
    return(this.HP);
  }
  
  public void setHp(int HP){
    this.HP = HP;
  }
  
  public String getHeroPowerName(){
    return(heroPowerName);
  }
  public String getClassName(){
    return(this.myClassName);
  }
  
  public String makeVoice(Voice voice){
    String output = null;
    switch (voice) {
      case GREET: 	output = (this.makeVoiceGreet()); 
			break;
      case FAREWELL: 	output = (this.makeVoiceFarewell()); 
			break;
      case WOW: 	output = (this.makeVoiceWow()); 
			break;
      case APOLOGIZE: 	output = (this.makeVoiceApologize()); 
			break;
      case MISTAKE: 	output = (this.makeVoiceMistake()); 
			break;
      case TAUNT: 	output = (this.makeVoiceTaunt()); 
			break;
    }
    return(output);
  }
  
  abstract void useHeroPower();
  abstract String makeVoiceGreet();
  abstract String makeVoiceFarewell();
  abstract String makeVoiceWow();
  abstract String makeVoiceApologize();
  abstract String makeVoiceMistake();
  abstract String makeVoiceTaunt();
}