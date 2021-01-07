package src.OopAssignment;
import src.OopAssignment.*;

public class Erasers extends MainMenu{
  private String brands;
  private String type;
  private String series;
  private int quantity;
  private String media;
  private String darkness;

  double price;

  public Erasers(String name, String type, String brands, int quantity, double price){
    super(name);
    this.type = type;
    this.brands = brands;
    this.quantity = quantity;
    this.price = price;

  }
  public Erasers(String type, String brands, int quantity, double price){
    this("Erasers", type, brands, quantity, price);
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

  public Erasers(String media, String darkness){
    this.media = media;
    this.darkness = darkness;
  }

  public String getMedia(){
    return media;
  }

  public String getType(){
    return type;
  }

  public String getDarkness(){
    return darkness;
  }
}