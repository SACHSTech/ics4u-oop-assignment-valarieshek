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
        //choice = Integer.parseInt(keyboard.readLine());
    }else if (choice <6){
      token = token+1;
      System.out.println("testing");
    }if (choice == 1){
      //token = token+1;
      MainMenu supply = new Paints ("a", "faber-castle");
      System.out.println("Category: "+ supply.getName());
    }if (choice == 2){
      //token = token+1;
      MainMenu tool = new Brushes (3, "canson");
      System.out.println("Category: "+ tool.getName());
    }if (choice == 3){
      //token = token+1;
      MainMenu paper = new Paper ("watercolour", "canson");
      System.out.println("Category: "+ paper.getName());
    }if (choice == 4){
      //token = token+1;
      MainMenu pencil = new Pencils ("2B", "faber-castle");
      System.out.println("Category: "+ pencil.getName());
    }if (choice == 5){
      //token = token+1;
      MainMenu eraser = new Erasers ("soft", "mono");
      System.out.println("Category: "+ eraser.getName());
    }

  }

  }
}