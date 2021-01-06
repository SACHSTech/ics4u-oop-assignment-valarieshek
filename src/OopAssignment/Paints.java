package src.OopAssignment;
import src.OopAssignment.*;

public class Paints extends MainMenu{
  private String series;
  private String brands; 
  private int quantity;
  private String media;

  
  double FaberCastleB = 12.99;
  double FaberCastleC = 16.99;
  private double price;
  
  public Paints(String name, String series, String brands, int quantity, double price){
    super(name);
    this.series = series;
    this.brands = brands;
    this.quantity = quantity;
    this.price = price;

  }

  public Paints(String series, String brands, int quantity, double price){
    this("Paints", series, brands, quantity, price);
  }

  public int getQuantity(){
    return quantity;
  }

  public String getSeries(){
    return series;
  }

  public String getBrands(){
    return brands;
  }

  public double getTotalPrice(){
    return price*quantity;
  }

  public Paints(String media){
    this.media = media;
  }

  public String getMedia(){
    return media;
  }
  
}