package src.OopAssignment;
import src.OopAssignment.*;

public class Paints extends MainMenu{
  
  private String series;
  private String name;

  public Paints(String name, String series)
    {
        super(name);
        this.series = series;
    }

    public Paints(String name)
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
    

  public Paints(){

  } 


  public void setSeries(String series)
    {
        this.series = series;
    }

  
  public String getSeries(){
    return this.series;
  }
  
}