package src.OopAssignment;
import java.io.*;

import src.OopAssignment.*;

public class Tester {
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("             Welcome to Kiki's Art Supply");
    System.out.println("                      Main Menu");
    System.out.println();
    System.out.println("Please choose the category you would like and enter the"); 
    System.out.println("          number corresponding to it below");
    System.out.println();
    System.out.println("                     1) Paints");
    System.out.println("                     2) Paper");
    System.out.println("                     3) Brushes");
    System.out.println("                     4) Pencils");
    System.out.println("                     5) Erasers");
    System.out.println("                     6) Quit/Exit");
    System.out.println();
  

    int token = 0;
    
    while(token == 0){
    int choice = Integer.parseInt(keyboard.readLine());
    //System.out.println(choice);
    if (choice == 6){
      System.out.println("Thank you for visiting our store.");
      token = token+1;
    }else if(choice != 6 && choice != 5 && choice != 4 && choice != 3 && choice != 2 && choice != 1){
        System.out.println("Error in choice, please choose again");
    }else if (choice <6){
      System.out.println("testing");
    }if (choice == 1){
      System.out.println();
      System.out.println("Which brand would you like to choose?");
      System.out.println("1) faber-castle");
      System.out.println("2) canson");
      System.out.println("3) Winsor & Newton");
      System.out.println();
      int choice2 = Integer.parseInt(keyboard.readLine());
      if(choice2==1){
        System.out.println();
        System.out.println("Which series of colour would you like?");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 7.99;
          MainMenu supply = new Paints ("a", "faber-castle", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if (choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 9.99;
          MainMenu supply = new Paints ("b", "faber-castle", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==3){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 14.99;
          MainMenu supply = new Paints ("c", "faber-castle", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: "+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 2){
        System.out.println();
        System.out.println("Which series of colour would you like?");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 6.99;
          MainMenu supply = new Paints ("a", "canson", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 8.99;
          MainMenu supply = new Paints ("b", "canson", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==3){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 10.99;
          MainMenu supply = new Paints ("c", "canson", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: "+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 >3){
          System.out.println("Error in choice, please re-choose");
          choice3 = Integer.parseInt(keyboard.readLine());
        }
      }else if (choice2 == 3){
        System.out.println();
        System.out.println("Which series of colour would you like?");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 8.99;
          MainMenu supply = new Paints ("a", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 10.99;
          MainMenu supply = new Paints ("b", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if (choice3 == 3){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 18.99;
          MainMenu supply = new Paints ("c", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+supply.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 >3){
          System.out.println("Error in choice, please re-choose");
          choice3 = Integer.parseInt(keyboard.readLine());
        }

      }
    }if (choice == 2){
      //token = token+1;
      System.out.println();
      System.out.println("Which brand would you like to choose?");
      System.out.println("1) kokuyo");
      System.out.println("2) canson");
      System.out.println("3) Winsor & Newton");
      System.out.println();
      int choice2 = Integer.parseInt(keyboard.readLine());
      if(choice2==1){
        System.out.println();
        System.out.println("Which media is the paper for?");
        System.out.println("1) Watercolour");
        System.out.println("2) Pencil Sketches");
        System.out.println("3) Markers");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 11.99;
          MainMenu paper = new Paper ("watercolour", "kokuyo", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 9.99;
          MainMenu paper = new Paper ("Pencil Sketches", "kokuyo", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 10.99;
          MainMenu paper = new Paper ("Markers", "kokuyo", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 2){
        System.out.println();
        System.out.println("Which media is the paper for?");
        System.out.println("1) Watercolour");
        System.out.println("2) Pencil Sketches");
        System.out.println("3) Markers");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 20.99;
          MainMenu paper = new Paper ("watercolour", "canson", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 15.99;
          MainMenu paper = new Paper ("Pencil Sketches", "canson", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 13.99;
          MainMenu paper = new Paper ("Markers", "canson", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 3){
        System.out.println();
        System.out.println("Which media is the paper for?");
        System.out.println("1) Watercolour");
        System.out.println("2) Pencil Sketches");
        System.out.println("3) Markers");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 28.99;
          MainMenu paper = new Paper ("watercolour", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 18.99;
          MainMenu paper = new Paper ("Pencil Sketches", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 21.99;
          MainMenu paper = new Paper ("Markers", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ paper.getName());
          System.out.println("Brand: "+paper.getBrands());
          System.out.println("Media: "+paper.getMedia());
          System.out.println("Quantity: "+paper.getQuantity());
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+paper.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }
    }if (choice == 3){
      //token = token+1;
      MainMenu tool = new Brushes (3, "canson", 7);
      System.out.println("Category: "+ tool.getName());
    }if (choice == 4){
      //token = token+1;
      MainMenu pencil = new Pencils ("2B", "faber-castle", 12);
      System.out.println("Category: "+ pencil.getName());
    }if (choice == 5){
      //token = token+1;
      MainMenu eraser = new Erasers ("soft", "mono", 4);
      System.out.println("Category: "+ eraser.getName());
      
    }

  }

  }
}

