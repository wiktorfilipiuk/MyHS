package Classes;

public class Rogue extends Classes {
  
  public Rogue(){
    this.myClassName = "Rogue";
  }
  
  @Override
  void useHeroPower(){
    
  }
  @Override
  String makeVoiceGreet(){
    return(this.getClassName() + " says hello!");
  }
  @Override
  String makeVoiceFarewell(){
    return(this.getClassName() + " says goodbye!");
  }
  @Override
  String makeVoiceWow(){
    return(this.getClassName() + " says WoW!");
  }
  @Override
  String makeVoiceApologize(){
    return(this.getClassName() + " is sorry!");
  }
  @Override
  String makeVoiceMistake(){
    return(this.getClassName() + " made a mistake");
  }
  @Override
  String makeVoiceTaunt(){
    return(this.getClassName() + "says you're dummy!");
  }
}