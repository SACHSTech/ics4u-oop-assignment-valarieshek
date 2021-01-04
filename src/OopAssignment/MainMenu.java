package src.OopAssignment;

public abstract class MainMenu{
  
  private String name;

  public MainMenu(){

  }
 
 /*
  public MainMenu(String name){
    this.name = name;
  }

  public void setName (String name){
    this.name = name;
  } 

  public String getName(){
    return this.name;
  }
*/
  

  public abstract double getPrice();
  public abstract double getTotalPrice();
  public abstract String getBrands();
}