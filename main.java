import java.util.*;
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Pantry pantry = new Pantry(); 
    Scanner console = new Scanner(System.in);
    ArrayList<Food> selection = new ArrayList<>();
    //Creates a new Pantry object and intializes an empty ArrayList

    System.out.print("What type of recipe are you looking for? (Breakfast, Lunch, Dinner) ");
    String answer = console.next().toLowerCase();
    if (answer.equals("breakfast")) {
      pantry.fillBreakfast();  
    } else if (answer.equals("lunch")) {
      pantry.fillLunch();
    } else if (answer.equals("dinner")){
      pantry.fillDinner();
    } else {
      throw new IllegalArgumentException("Not a valid answer");
    }
    //Fills Pantry with specific recipes due to input of Breakfast, Lunch, or Dinner
    
    Boolean conditional; 
    ArrayList<Food> temp;
    //Initializes two temporary variables to be used below in the do-while loop
    
    
    ArrayList<Food> currentPantry = pantry.getPantry();
    //Accesses Pantry object's ArrayList full of food and assigns it to currentPantry
    do { 
       temp = pantry.findFood(currentPantry);
       System.out.println();
      for  (int x = 0; x < temp.size(); x++) {
        selection.add(temp.get(x));
      }
      //Prompts for user input until "no" is entered and adds Food objects that match ingredients into empty ArrayList 
      conditional = pantry.exitCondition;
              
    } while (conditional);

    if (selection.size() == 0) {
      System.out.print("Go to the grocery store already");
      //This means no Food objects contained any ingredients inputted
    } else {
      System.out.println();
      pantry.findMode(selection);
      //Returns the Food object containing the greatest number of ingredients inputted
    }
    
  
  }
}
