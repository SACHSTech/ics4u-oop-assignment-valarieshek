package src.OopAssignment;
import src.OopAssignment.*;

public class Pencils extends MainMenu{
  private String brands;
  private String darkness;
  private String series;
  private int quantity;
  private String media;
  private String type;
  private double price;

  public Pencils(String name, String darkness, String brands, int quantity, double price){
    super(name);
    this.darkness = darkness;
    this.brands = brands;
    this.quantity = quantity;
    this.price = price;

  }

  public Pencils(String darkness, String brands, int quantity, double price){
    this("Pencils", darkness, brands, quantity, price);
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

  public Pencils(String media, String type){
    this.media = media;
    this.type = type;
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
