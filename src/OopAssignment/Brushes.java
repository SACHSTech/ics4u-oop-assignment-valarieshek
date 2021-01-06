package src.OopAssignment;
import src.OopAssignment.*;

public class Brushes extends MainMenu{
  private String brands;
  private int size;
  private String series;
  private int quantity;
  
  double FaberCastleA = 7.99;
  double FaberCastleB = 12.99;
  double FaberCastleC = 16.99;
  private double price;

  public Brushes(String name, int size, String brands, int quantity){
    super(name);
    this.size = size;
    this.brands = brands;
    this.quantity = quantity;

  }

  public Brushes(int size, String brands, int quantity){
    this("Brushes", size, brands, quantity);
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