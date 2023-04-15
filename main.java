import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Pantry foodList = new Pantry();
    foodList.fillPantry();
    ArrayList<Food> foodArray = foodList.getPantry();
    
    String ingredient;
    Scanner console = new Scanner(System.in);
    ArrayList<Food> currentItems = new ArrayList<Food>();
      Iterator<Food> iterate = currentItems.iterator();
    do {
      System.out.print("Ingredient? Type no if there are no more ingredients: ");
      ingredient = console.next();
      ingredient.toLowerCase(); //non case-sensitive
      for (Food item: foodArray) {
        for (String i: item.getIngredients()) { //
          if (ingredient.equals(i)) {
            currentItems.add(item);
          }  
          
        while(iterate.hasNext()){
          
         System.out.println(iterate.next().getName());
        }
          
          
        }
      }
    } while (!(console.next().equals("no")));
  
  }

  }
