package src.OopAssignment;
import src.OopAssignment.*;

public class Brushes extends MainMenu{
  private String brands;
  private String type;
  private String series;
  private int quantity;
  private String media;
  
  double FaberCastleA = 7.99;
  double FaberCastleB = 12.99;
  double FaberCastleC = 16.99;
  private double price;

  public Brushes(String name, String type, String brands, int quantity, double price){
    super(name);
    this.type = type;
    this.brands = brands;
    this.quantity = quantity;
    this.price = price;

  }

  public Brushes(String type, String brands, int quantity, double price){
    this("Brushes", type, brands, quantity, price);
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

  public Brushes(String media){
    this.media = media;
  }

  public String getMedia(){
    return media;
  }

  public String getType(){
    return type;
  }
  
}