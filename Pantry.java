import java.util.ArrayList;


public class Pantry {
  ArrayList<Food> pantry;

  public Pantry() {
    pantry = new ArrayList<Food>();
  }

  public ArrayList<Food> getPantry() {
    return pantry;
  }

  public void fillPantry() {
    
     String[] CheeseArtichokeOvenOmeletIngredients = {"salsa", "artichoke hearts", "parmasan cheese", "monterey jack cheese", "sharp cheddar cheese", "eggs", "sour cream"};
    Food CheeseArtichokeOvenOmelet = new Food("Zippy Cheese Artichoke Oven Omelet", CheeseArtichokeOvenOmeletIngredients, "Mix all ingredients in a sauce pan, over low heat. Cook until dough pulls from sides of pan. Knead by hand until dough is smooth in texture. Store in tightly closed container.");

    pantry.add(CheeseArtichokeOvenOmelet);
  }
  
}

