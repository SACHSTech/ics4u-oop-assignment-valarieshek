package src.OopAssignment;
import src.OopAssignment.*;

public class Paper extends MainMenu{
  private String brands;
  private String media;
  private String series;
  private int quantity;

  double price;

  public Paper(String name, String media, String brands, int quantity){
    super(name);
    this.media = media;
    this.brands = brands;
    this.quantity = quantity;

  }

  public Paper(String media, String brands, int quantity){
    this("Paper", media, brands, quantity);
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
}
