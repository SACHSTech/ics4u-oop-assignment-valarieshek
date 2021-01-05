package src.OopAssignment;
import src.OopAssignment.*;

public class Paints extends MainMenu{
  private String series;
  private String brands; 
  private int Quantity;
  
  public Paints(String name, String series, String brands){
    super(name);
    this.series = series;
    this.brands = brands;

  }

  public Paints(String series, String brands){
    this("Paints", series, brands);
  }

  public int getQuantity(int Quantity){
    this.Quantity = Quantity;
    return Quantity;
  }
}