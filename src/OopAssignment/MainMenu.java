package src.OopAssignment;
import java.io.*;

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
  
  public abstract String getSeries();
  public abstract String getBrands();
  public abstract int getQuantity();
  public abstract double getTotalPrice();
  public abstract String getMedia();
  public abstract String getType();
/*
  
  
  
  public abstract double getSize();

*/
}