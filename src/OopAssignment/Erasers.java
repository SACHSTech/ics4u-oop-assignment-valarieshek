package src.OopAssignment;
import src.OopAssignment.*;

public class Erasers extends MainMenu{
  private String brands;
  private String type;
  private String series;
  private int quantity;
  private String media;


  double price;

  public Erasers(String name, String type, String brands, int quantity){
    super(name);
    this.type = type;
    this.brands = brands;
    this.quantity = quantity;

  }
  public Erasers(String type, String brands, int quantity){
    this("Erasers", type, brands, quantity);
  }

  public String getSeries(){
    return series;
  }

  public String getBrands(){
    return brands;
  }

  public int getQuantity(){
    return quantity;
  }

  public double getTotalPrice(){
    return price*quantity;
  }

  public Erasers(String media){
    this.media = media;
  }

  public String getMedia(){
    return media;
  }

  public String getType(){
    return type;
  }
}