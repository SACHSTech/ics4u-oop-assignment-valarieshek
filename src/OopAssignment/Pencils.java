package src.OopAssignment;
import src.OopAssignment.*;

public class Pencils extends MainMenu{
  
  private String Brands;
  private String Package;

  public Pencils(String Brands){
        this.Brands = Brands;
  }
  public void setBrands(String Brands)
    {
        this.Brands = Brands;
    }
  public String getBrands(){
    return this.Brands;
  }
  
}

//}