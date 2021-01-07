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
    double totalPrice = 0;
    while(token == 0){
    int choice = Integer.parseInt(keyboard.readLine());
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
      System.out.println("1) Faber-Castell");
      System.out.println("2) Canson");
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 7.99;
          MainMenu supply = new Paints ("a", "Faber-Castell", choice4, price);
          System.out.println("Category: "+ supply.getName());
          System.out.println("Brand: "+supply.getBrands());
          System.out.println("Series: "+supply.getSeries());
          System.out.println("Quantity: "+supply.getQuantity());
          System.out.println("Total Price: $"+supply.getTotalPrice());
          totalPrice = totalPrice + supply.getTotalPrice();
          System.out.println("Testing: "+totalPrice);
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
        }else if (choice5 ==1){
          System.out.println("Please choose the category you would like and enter the number corresponding to it");
        }
        }else if (choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 9.99;
          MainMenu supply = new Paints ("b", "Faber-Castell", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 14.99;
          MainMenu supply = new Paints ("c", "Faber-Castell", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 6.99;
          MainMenu supply = new Paints ("a", "Canson", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 8.99;
          MainMenu supply = new Paints ("b", "Canson", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 10.99;
          MainMenu supply = new Paints ("c", "Canson", choice4, price);
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
          System.out.println("How many would you like to purchase?");
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
          System.out.println("How many would you like to purchase?");
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
          System.out.println("How many would you like to purchase?");
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
      System.out.println("1) Kokuyo");
      System.out.println("2) Canson");
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 11.99;
          MainMenu paper = new Paper ("watercolour", "Kokuyo", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 9.99;
          MainMenu paper = new Paper ("Pencil Sketches", "Kokuyo", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 10.99;
          MainMenu paper = new Paper ("Markers", "Kokuyo", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 20.99;
          MainMenu paper = new Paper ("watercolour", "Canson", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 15.99;
          MainMenu paper = new Paper ("Pencil Sketches", "Canson", choice4, price);
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
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 13.99;
          MainMenu paper = new Paper ("Markers", "Canson", choice4, price);
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
          System.out.println("How many would you like to purchase?");
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
          System.out.println("How many would you like to purchase?");
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
          System.out.println("How many would you like to purchase?");
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
      System.out.println();
      System.out.println("Which brand would you like to choose?");
      System.out.println("1) canson");
      System.out.println("2) curry's");
      System.out.println("3) Winsor & Newton");
      System.out.println();
      int choice2 = Integer.parseInt(keyboard.readLine());
      if(choice2==1){
        System.out.println();
        System.out.println("Which size would you like?");
        System.out.println("1) Round");
        System.out.println("2) Flat");
        System.out.println("3) Rigger");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 4.50;
          MainMenu brush = new Brushes ("round", "canson", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.99;
          MainMenu brush = new Brushes ("flat", "canson", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 12.49;
          MainMenu brush = new Brushes ("Rigger", "canson", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 2){
        System.out.println();
        System.out.println("Which size would you like?");
        System.out.println("1) Round");
        System.out.println("2) Flat");
        System.out.println("3) Rigger");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 2.99;
          MainMenu brush = new Brushes ("round", "curry's", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.49;
          MainMenu brush = new Brushes ("flat", "curry's", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 9.59;
          MainMenu brush = new Brushes ("Rigger", "curry's", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 3){
        System.out.println();
        System.out.println("Which size would you like?");
        System.out.println("1) Round");
        System.out.println("2) Flat");
        System.out.println("3) Rigger");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 12.89;
          MainMenu brush = new Brushes ("round", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 8.99;
          MainMenu brush = new Brushes ("flat", "Winsor &  Newton", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 13.49;
          MainMenu brush = new Brushes ("Rigger", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ brush.getName());
          System.out.println("Brand: "+brush.getBrands());
          System.out.println("Type: "+brush.getType());
          System.out.println("Quantity: "+brush.getQuantity());
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+brush.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }
    }if (choice == 4){
      System.out.println();
      System.out.println("Which brand would you like to choose?");
      System.out.println("1) Staedtler");
      System.out.println("2) Winsor & Newton");
      System.out.println("3) Faber-Castell");
      System.out.println();
      int choice2 = Integer.parseInt(keyboard.readLine());
      if(choice2==1){
        System.out.println();
        System.out.println("Which darkness would you prefer?");
        System.out.println("1) HB");
        System.out.println("2) 2B");
        System.out.println("3) H");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 2.49;
          MainMenu pencil = new Pencils ("HB", "Staedtler", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 2.49;
          MainMenu pencil = new Pencils ("2B", "Staedtler", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 2.49;
          MainMenu pencil = new Pencils ("H", "Staedtler", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 2){
        System.out.println();
        System.out.println("Which darkness would you prefer?");
        System.out.println("1) HB");
        System.out.println("2) 2B");
        System.out.println("3) H");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.00;
          MainMenu pencil = new Pencils ("HB", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.00;
          MainMenu pencil = new Pencils ("2B", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.00;
          MainMenu pencil = new Pencils ("H", "Winsor & Newton", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      
    }if (choice2 == 3){
        System.out.println();
        System.out.println("Which darkness would you prefer?");
        System.out.println("1) HB");
        System.out.println("2) 2B");
        System.out.println("3) H");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.49;
          MainMenu pencil = new Pencils ("HB", "Faber-Castell", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 ==2){
          System.out.println();
          System.out.println("How much would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.49;
          MainMenu pencil = new Pencils ("2B", "Faber-Castell", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if(choice3 == 3){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.49;
          MainMenu pencil = new Pencils ("H", "Faber-Castell", choice4, price);
          System.out.println("Category: "+ pencil.getName());
          System.out.println("Brand: "+pencil.getBrands());
          System.out.println("Darkness: "+pencil.getDarkness());
          System.out.println("Quantity: "+pencil.getQuantity());
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+pencil.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
      }
    }
    }if (choice == 5){
      //token = token+1;
      //MainMenu eraser = new Erasers ("soft", "mono", 4);
      //System.out.println("Category: "+ eraser.getName());
      System.out.println();
      System.out.println("Which brand would you like to choose?");
      System.out.println("1) Mono");
      System.out.println("2) Staedtler");
      System.out.println();
      int choice2 = Integer.parseInt(keyboard.readLine());
      if(choice2==1){
        System.out.println();
        System.out.println("Which texture would you like?");
        System.out.println("1) Hard");
        System.out.println("2) Soft");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 5.59;
          MainMenu eraser = new Erasers ("Hard", "Mono", choice4, price);
          System.out.println("Category: "+ eraser.getName());
          System.out.println("Brand: "+eraser.getBrands());
          System.out.println("Texture: "+eraser.getType());
          System.out.println("Quantity: "+eraser.getQuantity());
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if (choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 14.99;
          MainMenu eraser = new Erasers ("Soft", "Mono", choice4, price);
          System.out.println("Category: "+ eraser.getName());
          System.out.println("Brand: "+eraser.getBrands());
          System.out.println("Texture: "+eraser.getType());
          System.out.println("Quantity: "+eraser.getQuantity());
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }
      }else if (choice2 == 2){
        System.out.println();
        System.out.println("Which texture would you like?");
        System.out.println("1) Hard");
        System.out.println("2) Soft");
        System.out.println();
        int choice3 = Integer.parseInt(keyboard.readLine());
        if (choice3 == 1){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 3.59;
          MainMenu eraser = new Erasers ("Hard", "Staedtler", choice4, price);
          System.out.println("Category: "+ eraser.getName());
          System.out.println("Brand: "+eraser.getBrands());
          System.out.println("Texture: "+eraser.getType());
          System.out.println("Quantity: "+eraser.getQuantity());
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }else if (choice3 ==2){
          System.out.println();
          System.out.println("How many would you like to purchase?");
          int choice4 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          double price = 11.99;
          MainMenu eraser = new Erasers ("Soft", "Staedtler", choice4, price);
          System.out.println("Category: "+ eraser.getName());
          System.out.println("Brand: "+eraser.getBrands());
          System.out.println("Texture: "+eraser.getType());
          System.out.println("Quantity: "+eraser.getQuantity());
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println();
          System.out.println("Would you like to continue shopping or quit?");
          System.out.println("1) continue");
          System.out.println("2) quit");
          System.out.println();
          int choice5 = Integer.parseInt(keyboard.readLine());
          System.out.println();
          if (choice5 == 2){
          System.out.println("Total Price: $"+eraser.getTotalPrice());
          System.out.println("Thank you for visiting out store.");
          token = token+1;
        }
        }

      }

    }

  }
  }
}




