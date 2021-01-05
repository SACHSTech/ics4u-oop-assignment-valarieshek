package src.OopAssignment;


public abstract class MainMenu{
  
  private String name;

    public MainMenu(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    

  public MainMenu(){
  } 
/*
  public abstract double getTotalPrice();
  public abstract String getBrands();
  public abstract String getSeries();
  public abstract double getSize();

*/
}