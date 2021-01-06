package src.OopAssignment;
import src.OopAssignment.*;

public class Pencils extends MainMenu{
  private String brands;
  private String darkness;
  private String series;

  public Pencils(String name, String darkness, String brands){
    super(name);
    this.darkness = darkness;
    this.brands = brands;

  }

  public Pencils(String darkness, String brands){
    this("Pencils", darkness, brands);
  }

  public String getSeries(){
    return series;
  }

  public String getBrands(){
    return brands;
  }
}
