import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Pantry foodList = new Pantry();
    foodList.fillPantry();
    ArrayList<Food> foodArray = foodList.getPantry();
    

    Scanner console = new Scanner(System.in);
    ArrayList<Food> currentItems = new ArrayList<Food>();
     
    findFood(console, foodArray);
  
  } //bracket for Main method

  public static ArrayList<Food> findFood(Scanner console, ArrayList<Food> foodArray) {
    String ingredient;
    ArrayList<Food> currentItems = new ArrayList<Food>();
    
    do {
        System.out.print("Ingredient? Type no if there are no more ingredients: ");
        ingredient = console.next().toLowerCase();
        //non case-sensitive
        for (Food item: foodArray) {
          for (String i: item.getIngredients()) { //
            if (ingredient.equals(i)) {
              currentItems.add(item);
              System.out.println(item);
            }  
          }
        }
        System.out.print("Ingredient? Type no if there are no more ingredients: ");
        ingredient = console.next().toLowerCase();
    } while (!(console.next().equals("no")));
    return currentItems;
  }
}
