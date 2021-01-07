package src.OopAssignment;
import src.OopAssignment.*;

public class Paints extends MainMenu{
  private String series;
  private String brands; 
  private int quantity;
  private String media;
  private String type;
  private String darkness;
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

  public Paints(String media, String type, String darkness){
    this.media = media;
    this.type = type;
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