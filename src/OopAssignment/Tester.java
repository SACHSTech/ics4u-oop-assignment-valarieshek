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
        System.out.println("Brand: faber-castle");
        System.out.println("Which series of colour would you like?");
        System.out.println("1) A");
        System.out.println("2) B");
        System.out.println("3) C");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();

          System.out.println("Series: A");
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          double price = 7.99;
          MainMenu supply = new Paints ("a", "faber-castle", choice4, price*choice4);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: "+supply.getTotalPrice());
        }
      }
    }if (choice == 2){
      //token = token+1;
      MainMenu tool = new Brushes (3, "canson", 7);
      System.out.println("Category: "+ tool.getName());
    }if (choice == 3){
      //token = token+1;
      MainMenu paper = new Paper ("watercolour", "canson", 8);
      System.out.println("Category: "+ paper.getName());
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