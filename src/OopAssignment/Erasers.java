package src.OopAssignment;
import src.OopAssignment.*;

public class Erasers extends MainMenu{
  private String brands;
  private String texture;
  private String series;

  public Erasers(String name, String texture, String brands){
    super(name);
    this.texture = texture;
    this.brands = brands;

  }
  public Erasers(String texture, String brands){
    this("Erasers", texture, brands);
  }

  public String getSeries(){
    return series;
  }

  public String getBrands(){
    return brands;
  }
}