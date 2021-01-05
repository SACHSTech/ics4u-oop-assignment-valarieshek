package src.OopAssignment;
import src.OopAssignment.*;

public class Paper extends MainMenu{
  private String brands;
  private String media;

  public Paper(String name, String media, String brands){
    super(name);
    this.media = media;
    this.brands = brands;

  }

  public Paper(String media, String brands){
    this("Paper", media, brands);
  }
}
