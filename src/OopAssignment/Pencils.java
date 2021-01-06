package src.OopAssignment;
import src.OopAssignment.*;

public class Pencils extends MainMenu{
  private String brands;
  private String darkness;
  private String series;
  private int quantity;

  double price;

  public Pencils(String name, String darkness, String brands, int quantity){
    super(name);
    this.darkness = darkness;
    this.brands = brands;
    this.quantity = quantity;

  }

  public Pencils(String darkness, String brands, int quantity){
    this("Pencils", darkness, brands, quantity);
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
