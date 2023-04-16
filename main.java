import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Pantry pantry = new Pantry(); 
    Scanner console = new Scanner(System.in);
    System.out.print("What type of recipe are you looking for? (Breakfast, Lunch, Dinner) ");
    String answer = console.next();
    if (answer.equals("Breakfast")) {
      pantry.fillBreakfast();  
    } else if (answer.equals("Lunch")) {
      pantry.fillLunch();
    } else {
      pantry.fillDinner();
    }
    System.out.println();
    
    Boolean conditional; 
    
    ArrayList<Food> currentPantry = pantry.getPantry();
    do { 
      pantry.findFood(currentPantry); 
      System.out.println();
      conditional = pantry.exitCondition;
    } while (conditional);
    
  }
}
