import java.util.ArrayList;


public class Food {
  private String name;
  private String [] ingredientList;
  private String recipe;
  
  public Food(String name, String[] ingredientList, String recipe) { 
  //Constructs Food object with name, list of ingredients, recipe
    this.name = name;
    this.ingredientList = ingredientList;
    this.recipe = recipe;
  }

  public String[] getIngredients () {
  //Returns ingredients of Food object in an array of Strings
    return ingredientList;
  }
  
   public String getRecipe () {
   //Returns recipe of Food object
    return recipe;
  }
  
  public String getName(){
  //Returns name of Food Object
    return name;
    
  }

  public String toString (){
  //toString method to return name in case of Food object interaction in a String method
    return name;
    
  }
  
}
