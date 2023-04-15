import java.util.ArrayList;


public class Food {
  private String name;
  private String [] ingredientList;
  private String recipe;
  
  public Food(String name, String[] ingredientList, String recipe) //takes in food name, recipe, and ingredients
  { 
    this.name = name;
    this.ingredientList = ingredientList;
    this.recipe = recipe;
  }

  public String[] getIngredients ()
  //returns ingredients
  {
    return ingredientList;

    
  }
   public String getRecipe ()
  //returns recipes
  {
    return recipe;

    
  }
  
  public String getName(){

    return name;
    
  }
  
}
