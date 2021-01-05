package src.OopAssignment;
import src.OopAssignment.*;

public class Brushes extends MainMenu{
  private String brands;
  private int size;

  public Brushes(String name, int size, String brands){
    super(name);
    this.size = size;
    this.brands = brands;

  }

  public Brushes(int size, String brands){
    this("Brushes", size, brands);
  }
}