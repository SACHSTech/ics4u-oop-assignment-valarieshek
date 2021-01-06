package src.OopAssignment;
import src.OopAssignment.*;

public class Paper extends MainMenu{
  private String brands;
  private String media;
  private String series;
  private int quantity;
  private String type;

  double price;

  public Paper(String name, String media, String brands, int quantity, double price){
    super(name);
    this.media = media;
    this.brands = brands;
    this.quantity = quantity;
    this.price = price;

  }

  public Paper(String media, String brands, int quantity, double price){
    this("Paper", media, brands, quantity, price);
  }

  public String getMedia(){
    return media;
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

  public Paper(String type){
    this.type = type;
  }

  public String getType(){
    return type;
  }
}
