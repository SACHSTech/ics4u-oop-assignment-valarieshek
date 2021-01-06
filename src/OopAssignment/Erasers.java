package src.OopAssignment;
import src.OopAssignment.*;

public class Erasers extends MainMenu{
  private String brands;
  private String texture;
  private String series;
  private int quantity;

  double price;

  public Erasers(String name, String texture, String brands, int quantity){
    super(name);
    this.texture = texture;
    this.brands = brands;
    this.quantity = quantity;

  }
  public Erasers(String texture, String brands, int quantity){
    this("Erasers", texture, brands, quantity);
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