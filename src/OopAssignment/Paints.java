package src.OopAssignment;
import src.OopAssignment.*;

public abstract class Paints extends MainMenu{
  
  private String series;
  public Paints(String series){
        this.series = series;
  }
  public void setSeries(String series)
    {
        this.series = series;
    }
  public String getSeries(){
    return this.series;
  }
  
}