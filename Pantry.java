import java.util.*;

public class Pantry {
  
  ArrayList<Food> pantry;
  //ArrayList containing all Food objects (whether it be Breakfast, Lunch, or Dinner)
  Boolean exitCondition;
  //Exit condition to exit ingredient input loop

  public Pantry() {
  //Constructs a Pantry object, initializing the ArrayList of Food Objects and setting the exit condition to true (referring to there is another ingredient to be inputted)
    pantry = new ArrayList<Food>();
    exitCondition = true;  
  }

  public ArrayList<Food> getPantry() {
  //Returns the ArrayList of Food objects 
    return pantry;
  }

  public Boolean getExitCondition() {
  //Returns current exit conditon
    return exitCondition;
  }
  
  public ArrayList<Food> findFood(ArrayList<Food> foodArray) {
  //Returns ArrayList of Food objects that contain ingredients inputted
    ArrayList<Food> currentItems = new ArrayList<Food>();
    String ingredient;
    Scanner console = new Scanner(System.in);
    
    System.out.println();
    System.out.print("Ingredient? Type no if there are no more ingredients: ");
    ingredient = console.next();
    //Prompts for ingredient

    if (ingredient.equals("no")) {
    //Stopping condition for ingredient input
      for (int i = 0; i < currentItems.size(); i++) {
        if (i != currentItems.size() - 1) {
          System.out.print(currentItems.get(i) + ", ");
        } else {
          System.out.print(currentItems.get(i));
        }
      }
      exitCondition = false;
      return currentItems;
      //Changes exit condition to false and breaks loop by returning the ArrayList containing Food objects
    }

    for (Food item : foodArray) {
      for (String ingred : item.getIngredients()) {
        if (ingredient.equals(ingred)) {
          if (!(currentItems.contains(item))) {
            currentItems.add(item);
            //Adds Food object that contains inputted ingredient to ArrayList
          }
        }
      }
    }
    //Enhaced for loops above iterate through all Food objects in Pantry and locate which ones contain the given ingredient
    
    if (currentItems.size() == 0) {
      System.out.print("There are no recipes that require these ingredients");
      return currentItems;
    }
    //If ingredients inputted don't match to a single Food object, statement is returned along with empty ArrayList
    
    return currentItems;
    
  }



  public Food findMode(ArrayList<Food> Foods) {
  //finds and returns the Food object that has the most occurences
    Food mode = null;
    int maxCount = 0;
    
    for (int i = 0; i < Foods.size(); i++) {
      int count = 0;
    
      for (int j = 0; j < Foods.size(); j++) {
          if (Foods.get(j).getName().equals(Foods.get(i).getName())) {
            count++;
          }
      }

      if (count > maxCount) {
        maxCount = count;
        mode = Foods.get(i);
        
      }
    }
    
     System.out.println("Your best option is " + mode.getName());
    String[] ingredients = mode.getIngredients();
    for (int i = 0; i < ingredients.length; i++) {
      System.out.println(ingredients[i]);
    }
    System.out.println("Here's how to make it:");
    System.out.println("\n" + mode.getRecipe());
    return mode;
  }

  

    public void fillBreakfast() {
    //Fills Pantry with Breakfast foods
        // CheeseArtichokeOvenOmeletIngredients
      String[] CheeseArtichokeOvenOmeletIngredients = {"salsa", "artichoke hearts", "parmasan cheese", "monterey jack cheese", "sharp cheddar cheese", "eggs", "sour cream"};
	    Food CheeseArtichokeOvenOmelet = new Food("Zippy Cheese Artichoke Oven Omelet", CheeseArtichokeOvenOmeletIngredients, "Mix all ingredients in a sauce pan, over low heat. Cook until dough pulls from sides of pan. Knead by hand until dough is smooth in texture. Store in tightly closed container.");
	    pantry.add(CheeseArtichokeOvenOmelet);

	    
	//BlueberryCrunchCoffeeCake
	    String[] BlueberryCrunchCoffeeCakeIngredients = {
	  "butter",
	  "sugar",
	  "egg",
	  "flour",
	  "baking powder",
	  "salt",
	  "milk",
	  "vanilla extract",
	  "blueberries",
	  "butter",
	  "sugar",
	  "flour",
	  "cinnamon"
	};
	  Food BlueberryCrunchCoffeeCake = new Food ("Blueberry Crunch Coffee Cake", BlueberryCrunchCoffeeCakeIngredients, "Make cake batter by creaming butter, sugar and egg; add dry ingredients alternately with milk and vanilla.  Spread batter in a greased 9 x 9 square baking pan and top with berries. Combine the topping ingredients using a fork or pastry blender.  Sprinkle mixture over berries. Bake at 350 degrees, 25 - 30 minutes or until it test done.");
	pantry.add(BlueberryCrunchCoffeeCake);
	    
	//BreakfastGrilledCheeseMexicanStyle
	    String[] BreakfastGrilledCheeseMexicanStyleIngredients = {
	  "Jalapeno Jack cheese",
	  "egg",
	  "turkey bacon",
	  "green onions",
	  "sourdough bread",
	  "butter"
	};

	    Food BreakfastGrilledCheeseMexicanStyle = new Food ("Breakfast Grilled Cheese Mexican Style", BreakfastGrilledCheeseMexicanStyleIngredients, "Chop 4 cheese slices; combine with egg and set aside. Saute turkey bacon and green onions in butter until onions are translucent.Add egg and cheese mixture; cook, stirring over medium heat until egg are set. Remove and keep warm. Butter all slices of bread on one side. Place 4 slices of bread, buttered side down, in clean skillet.Top each with one slice of cheese and an equal amount of scrambled egg. Place one slice cheese over egg on each sandwich; top with remaining bread, buttered side up.Cook over medium-low heat, turning once carefully, until bread is golden brown and cheese is melted." );
	    pantry.add(BreakfastGrilledCheeseMexicanStyle);
	    
	    
	//AllInOneBreakfast
	    String[] AllInOneBreakfastIngredients = {
	  "whole wheat bread",
	  "butter",
	  "fresh mushrooms",
	  "tomato slices",
	  "grated parmesan cheese",
	  "bacon"
	};

	    Food AllInOneBreakfast = new Food ("All In One Breakfast", AllInOneBreakfastIngredients, "Place toast on baking sheet. Spread with butter if desired. Cover with mushrooms and tomato slices. Sprinkle cheese and crumbled bacon on top. Bake in 350 degree oven until cheese melts. 1 serving - 147 cal or 1 bread, 1 fat and 1 lean meat exchange (without butter) or 182 cal or 1 bread, 2 fat and 1 lean meat exchange (with butter).");
	    pantry.add(AllInOneBreakfast);
	    
	    //AlmondQuiche
	    String[] AlmondQuicheIngredients = {
	  "onion",
	  "butter",
	  "egg",
	  "half and half",
	  "milk",
	  "flour",
	  "pepper",
	  "swiss cheese",
	  "almonds",
	  "pie shell"
	};

	    Food AlmondQuiche = new Food ("Almond Quiche", AlmondQuicheIngredients, "Mix flour and oatmeal in blender and grind for about 30 seconds. Add 1 cup water and knead.Add corn syrup, peanut butter, nonfat milk, and confectioners sugar. Combine and knead well. Add more flour or powdered milk if dough is still sticky. Put out bowls of chocolate chips, butterscotch chips, sunflower seeds, white chocolate chips, red hots or peanuts to decorate creations. Mix 16 oz peanut butter with 6 tablespoons honey. Add dry milk or flour until not sticky. Chocolate chips may be added." );
	    pantry.add(AlmondQuiche);


	    //Amaretto French Toast
	    String[] AmarettoFrenchToastIngredients = { "milk", "amaretto butter", "amaretto syrup", "french bread"};
	    
	    Food AmarettoFrenchToast = new Food ("Amaretto French Toast", AmarettoFrenchToastIngredients,"In shallow bowl mix all ingredients except bread.  Soak bread in mixture.  In large skillet, melt some butter. Drain bread.  Cook in butter until both sides are golden brown. Serve immediately with Amaretto butter and Amaretto Syrup.  NOTE: For a change, try Irish Cream instead of Amaretto.\n");
	    pantry.add(AmarettoFrenchToast);

	    
	    
	  //American-Style Strata
	String [] AmericanStyleStrataIngredients = { "carrot", "eggs", "mozzarella", "bread", "milk", "dry mustard", "ground black pepper", "worcestershire", "dried thyme leaves", "dried basil leaves"};

	Food AmericanStyleStrata = new Food( "American Style Strata", AmericanStyleStrataIngredients, "In a 10x6x2 baking dish, layer bread slices to cover bottom of dish. Sprinkle cheese, meat and veggies over bread.    In a bowl, stir together the eggs, milk and seasonings till well mixed.  Pour carefully over ingredients in baking dish. Cover. Let stand 1 hour at room temperature or in fridge for longer periods. Uncover.  Bake 325~ for 50 to 60 minutes or until center is nearly set. Let stand 10 minutes. Cut into squares.");
	pantry.add(AmericanStyleStrata);


	//applePancakesIngredietns	
	String[] applePancakesIngredients = {
		    "flour",
		    "baking powder",
		    "cinnamon",
		    "cloves",
		    "butter",
		    "egg",
		    "milk",
		    "powdered milk",
		    "applesauce"
		};
	Food applePancake = new Food ("Apple Pancake", applePancakesIngredients,"Mix together flour, baking powder, salt, cinnamon and cloves.   Cut butter into flour mixture.   In a small bowl, beat together egg, milk, powdered milk and apple sauce.   Combine flour mixture with egg mixture until well mixed.   Bake on hot griddle.   Serve with butter and syrup or fruit.\n" );
	pantry.add(applePancake);

// Apple sausage pancakes
	String[] appleSausagePancakesIngredients = {
		    "egg",
		    "cinnamon",
		    "pancake mix",
		    "fresh apple",
		    "milk",
		    "bulk pork sausage",
		    "oil",
		    "sugar",
		    "apple cider",
		    "cornstarch",
		    "lemon juice",
		    "pumpkin pie spice",
		    "margarine or butter"
		};

	Food appleSausagePancakes = new Food ("Apple Sausage Pancakes", appleSausagePancakesIngredients, "Heat griddle to 375~.   In small bowl, beat egg on high speed until thick and lemon colored, about 5 minutes. Lightly spoon pancake mix into measuring cup; level off. Stir in pancake mix, milk, oil and cinnamon.  Fold in apples and sausage. Grease griddle lightly before making each pancake.  Pour batter from 1/4 cup measuring cup onto hot griddle. Bake until bubbles appear, about 2 minutes on each side. Serve with hot Cider Syrup. CIDER SYRUP: In medium saucepan, combine sugar, cornstarch and pumpkin pie spice; stir in apple cider and lemon juice. Cook, stirring constantly, until mixture thickens and boils for 1 minute. Remove from heat and stir in margarine.\n"
			+ "" );
	pantry.add(appleSausagePancakes);


//Apple cheddar Omelet
	String[] appleCheddarOmeletIngredients = {
		    "bacon",
		    "cheddar cheese soup",
		    "eggs",
		    "milk",
		    "apple",
		    "cheese, cheddar",
		    "pepper, black"
		};

	Food appleCheddarOmelet = new Food("Apple Cheddar Omelet", appleCheddarOmeletIngredients, " Microwave or fry bacon until crisp, drain, reserve drippings. Stir 1/2 cup of soup in bowl until smooth, add eggs; beat until well blended, set aside. In casserole, stir remaining soup until smooth, stir in apple, milk, cheese and pepper. Cover, micro-cook 4 minutes on HIGH until hot and bubbling. Stir once. Let stand, covered, while preparing omelets. Brush 1 teaspoon bacon drippings in bottom of pie plate. Pour in 1/2 egg mixture. Cover, micro-cook 2 minutes on HIGH. Using spatula, gently move outer edge to center, letting uncooked portion move to edge. Micro-cook 2 minutes on HIGH or until set. Fold in half, slide on plate. Repeat with bacon drippings and remaining egg mixture. Spoon sauce over each omelet, sprinkle with bacon. Campbell's Recipes\n"
			+ "");
      	pantry.add(appleCheddarOmelet);


//Benny's Eggs
      String[] BennysEggsingredients = {
    "eggs",
    "lemon juice",
    "orange rind",
    "butter",
    "eggs",
    "rich egg bread or brioche",
    "cream cheese",
    "smoked salmon",
    "orange slices",
    "fresh mint sprigs"
};

      Food  BennyEggs = new Food ("Benny's Eggs", BennysEggsingredients, "SAUCE-In a large metal bowl, whisk together egg, lemon juice and orange rind over a pan of boiling water for 1 minute. Gradually whisk in butter until sauce is smooth and well blended. It will be rather thin while warm, but will thicken as it cools slightly. EGGS-Crack eggs into shallow pan of boiling water.  Poach until done to your liking. Meanwhile, toast the bread. Spread with cream cheese. Top with the salmon. Place on plate. Top with 2 eggs per serving. Spoon sauce over. Serve with oranges and mint or parsley");

  	pantry.add(BennyEggs);

 




	  }
    public void fillLunch() {
    //Fills Pantry with Lunch foods

    String[] chickenCaesarSaladIngredients = {
  "grilled chicken breast",
  "romaine lettuce",
  "croutons",
  "parmesan cheese",
  "caesar dressing"
};

      String chickenCaesarSaladInstructions = "1. Season the chicken breast with salt and pepper.\n" +
  "2. Grill the chicken breast until cooked through.\n" +
  "3. Let the chicken breast cool, then slice it into thin strips.\n" +
  "4. Wash and dry the romaine lettuce, then tear it into bite-sized pieces.\n" +
  "5. In a large bowl, combine the romaine lettuce, croutons, and Parmesan cheese.\n" +
  "6. Add the sliced chicken breast on top.\n" +
  "7. Drizzle with Caesar dressing.\n" +
  "8. Toss the salad gently to coat everything in dressing.\n" +
  "9. Serve and enjoy!";

      Food chickenCaesarSalad = new Food ("Chicken Caesar Salad", chickenCaesarSaladIngredients, chickenCaesarSaladInstructions);
pantry.add(chickenCaesarSalad);
      

    String[] veggieWrapIngredients = {
  "tortilla",
  "hummus",
  "mixed vegetables ",
  "spinach",
  "feta cheese"
};

      String veggieWrapInstructions = "1. Lay the whole wheat tortilla flat on a clean surface.\n" +
  "2. Spread a generous amount of hummus evenly over the tortilla.\n" +
  "3. Thinly slice the mixed vegetables into long strips.\n" +
  "4. Arrange the sliced vegetables and spinach leaves on top of the hummus.\n" +
  "5. Crumble feta cheese (if using) over the vegetables.\n" +
  "6. Roll up the tortilla tightly, tucking in the sides as you go.\n" +
  "7. Cut the wrap diagonally into halves or into smaller pieces, if desired.\n" +
  "8. Serve and enjoy!";
      
Food veggieWrap = new Food ("Veggie Wrap", veggieWrapIngredients, veggieWrapInstructions);
pantry.add(veggieWrap);


      String[] capreseSaladSandwichIngredients = {
  "ciabatta bread",
  "mozzarella cheese",
  "tomato",
  "fresh basil leaves",
  "balsamic glaze",
  "olive oil",
};

      String capreseSaladSandwichInstructions = "1. Cut the ciabatta bread into desired sandwich size and slice it in half.\n" +
  "2. Thinly slice the fresh mozzarella cheese and tomato.\n" +
  "3. Rinse and pat dry the fresh basil leaves.\n" +
  "4. Drizzle balsamic glaze and olive oil on the bottom half of the ciabatta bread.\n" +
  "5. Layer the fresh mozzarella cheese, tomato slices, and basil leaves on top.\n" +
  "6. Sprinkle with salt and pepper to taste.\n" +
  "7. Close the sandwich with the top half of the ciabatta bread.\n" +
  "8. Press the sandwich lightly to compact the ingredients.\n" +
  "9. Cut the sandwich into halves or quarters, if desired.\n" +
  "10. Serve and enjoy!";

      Food capreseSaladSandwich = new Food ("caprese Salad Sandwich", capreseSaladSandwichIngredients, capreseSaladSandwichInstructions);
pantry.add(capreseSaladSandwich);

      String[] tunaSaladBowlIngredients = {
  "canned tuna",
  "mayonnaise",
  "dijon mustard",
  "red onion",
  "celery",
  "pickles",
  "lemon juice",
  "lettuce"
};

      String tunaSaladBowlInstructions = "1. Drain the canned tuna and transfer it to a mixing bowl.\n" +
  "2. Add mayonnaise, Dijon mustard, finely diced red onion, finely diced celery, chopped pickles, and lemon juice to the bowl.\n" +
  "3. Season with salt and pepper to taste.\n" +
  "4. Mix all the ingredients together until well combined.\n" +
  "5. Arrange mixed greens or lettuce in a serving bowl.\n" +
  "6. Spoon the tuna salad mixture over the greens.\n" +
  "7. Garnish with additional lemon juice, salt, and pepper, if desired.\n" +
  "8. Serve and enjoy!";

        Food tunaSaladBowl = new Food ("Tuna Salad Bowl", tunaSaladBowlIngredients, tunaSaladBowlInstructions);
pantry.add(tunaSaladBowl);


      String[] quinoaStirFryIngredients = {
  "quinoa",
  "assorted vegetables",
  "garlic",
  "ginger",
  "soy sauce",
  "sesame oil",
  "vegetable oil",
  

};

      String quinoaStirFryInstructions = "1. Cook quinoa according to package instructions and set aside.\n" +
  "2. Wash and prepare the assorted vegetables by slicing them into thin strips or bite-sized pieces.\n" +
  "3. Mince the garlic and ginger.\n" +
  "4. In a large skillet or wok, heat vegetable oil over high heat.\n" +
  "5. Add minced garlic and ginger and cook for 30 seconds or until fragrant.\n" +
  "6. Add the assorted vegetables and stir-fry for 3-4 minutes until they are crisp-tender.\n" +
  "7. Add cooked quinoa to the skillet and stir-fry for another 2-3 minutes.\n" +
  "8. Season with soy sauce, sesame oil, salt, and pepper to taste.\n" +
  "9. Garnish with chopped green onions, if desired.\n" +
  "10. Serve hot and enjoy!";

        Food quinoaStirFry = new Food ("Quinoa Stir Fry", quinoaStirFryIngredients, tunaSaladBowlInstructions);
pantry.add(quinoaStirFry);

      String[] spinachMushroomQuesadillaIngredients = {
  "flour tortillas",
  "spinach",
  "mushrooms",
  "red onion",
  "garlic",
  "shredded cheese",
  "olive oil",
  "sour cream"
};

String spinachMushroomQuesadillaInstructions = "1. Wash and roughly chop the spinach.\n" +
  "2. Clean and slice the mushrooms.\n" +
  "3. Finely dice the red onion and mince the garlic.\n" +
  "4. Heat olive oil in a skillet over medium heat.\n" +
  "5. Add minced garlic and diced red onion, and cook until softened.\n" +
  "6. Add sliced mushrooms and cook until they release their moisture and start to brown.\n" +
  "7. Add chopped spinach and cook until wilted.\n" +
  "8. Season with salt and pepper to taste.\n" +
  "9. Remove the skillet from heat and set aside.\n" +
  "10. Place a flour tortilla on a clean surface.\n" +
  "11. Sprinkle shredded cheese on one half of the tortilla.\n" +
  "12. Spoon the spinach and mushroom mixture on top of the cheese.\n" +
  "13. Fold the tortilla in half, pressing gently with a spatula.\n" +
  "14. Heat a clean skillet over medium heat and cook the quesadilla on each side until the tortilla is crispy and the cheese is melted.\n" +
  "15. Repeat the process with remaining tortillas and filling.\n" +
  "16. Cut the quesadillas into wedges or halves.\n";
  
Food spinachMushroomQuesadilla = new Food ("Spinach Mushroom Quesadilla", spinachMushroomQuesadillaIngredients, tunaSaladBowlInstructions);
pantry.add(spinachMushroomQuesadilla);
      
      
    }
  
  public void fillDinner(){
  //Fills Pantry with Dinner foods
      String[] spaghettiBologneseIngredients = {
  "ground beef",
  "onion",
  "garlic",
  "carrots",
  "celery",
  "tomato paste",
  "crushed tomatoes",
  "beef broth",
  "red wine",
  "dried oregano",
  "dried basil",
  "spaghetti noodles",
  "parmesan cheese"
};

      String spaghettiBologneseInstructions = "1. Heat a large saucepan or Dutch oven over medium heat.\n" +
  "2. Add ground beef and cook until browned, breaking it up with a spoon.\n" +
  "3. Dice the onion, mince the garlic, and grate the carrots and celery.\n" +
  "4. Add onion, garlic, carrots, and celery to the saucepan and cook until vegetables are softened.\n" +
  "5. Stir in tomato paste, crushed tomatoes, beef broth, red wine, oregano, basil, salt, and pepper.\n" +
  "6. Bring to a boil, then reduce heat and let simmer for 30-40 minutes, stirring occasionally.\n" +
  "7. Meanwhile, cook spaghetti noodles according to package instructions.\n" +
  "8. Drain the noodles and toss with the bolognese sauce.\n" +
  "9. Serve hot with grated Parmesan cheese, if desired.\n" +
  "10. Enjoy!";

      Food spaghettiBolognese = new Food ("Spaghetti Bolognese", spaghettiBologneseIngredients, spaghettiBologneseInstructions);
pantry.add(spaghettiBolognese);



      String[] roastedChickenIngredients = {
  "whole chicken",
  "lemon",
  "fresh herbs",
  "garlic",
  "olive oil",
  "butter"
};

      String roastedChickenInstructions = "1. Preheat oven to 425°F (220°C).\n" +
  "2. Wash and pat dry the whole chicken with paper towels.\n" +
  "3. Cut the lemon in half and squeeze the juice from one half.\n" +
  "4. Chop fresh herbs and mince garlic.\n" +
  "5. In a small bowl, combine lemon juice, chopped herbs, minced garlic, olive oil, salt, and pepper to make a marinade.\n" +
  "6. Rub the marinade all over the chicken, including under the skin and inside the cavity.\n" +
  "7. Place the chicken on a roasting pan or baking dish.\n" +
  "8. If desired, place small pieces of butter under the skin for extra flavor and moisture.\n" +
  "9. Roast the chicken in the preheated oven for about 1 hour and 15 minutes, or until the internal temperature reaches 165°F (74°C) and the skin is golden brown and crispy.\n" +
  "10. Let the chicken rest for a few minutes before carving.\n" +
  "11. Serve hot and enjoy!";

Food roastedChicken = new Food ("Roasted Chicken", roastedChickenIngredients, roastedChickenInstructions);
pantry.add(roastedChicken);


      String[] bakedSalmonIngredients = {
  "salmon fillets",
  "lemon",
  "butter",
  "garlic",
  "fresh dill",
};

      String bakedSalmonInstructions = "1. Preheat oven to 375°F (190°C).\n" +
  "2. Place salmon fillets on a baking sheet lined with foil or parchment paper.\n" +
  "3. Cut lemon into slices and place them on top of the salmon fillets.\n" +
  "4. Melt butter in a small saucepan over low heat.\n" +
  "5. Mince garlic and chop fresh dill.\n" +
  "6. Stir minced garlic and chopped dill into melted butter.\n" +
  "7. Drizzle the lemon butter sauce over the salmon fillets.\n" +
  "8. Season with salt and pepper to taste.\n" +
  "9. Bake in the preheated oven for 12-15 minutes, or until salmon is cooked through and flakes easily with a fork.\n" +
  "10. Serve hot and enjoy!";

Food bakedSalmon= new Food ("Baked Salmon", bakedSalmonIngredients, bakedSalmonInstructions);
pantry.add(bakedSalmon);


      String[] lentilCurryIngredients = {
  "lentils",
  "assorted vegetables",
  "onion",
  "garlic",
  "ginger",
  "tomato sauce",
  "coconut milk",
  "curry powder",
  "turmeric",
  "cumin",
  "rice"
};


      String lentilCurryInstructions = "1. Cook lentils according to package instructions and set aside.\n" +
  "2. Chop assorted vegetables into bite-sized pieces.\n" +
  "3. Dice onion, mince garlic, and grate ginger.\n" +
  "4. Heat a large pot or skillet over medium heat.\n" +
  "5. Add onion, garlic, and ginger and sauté until softened.\n" +
  "6. Stir in tomato sauce, coconut milk, curry powder, turmeric, cumin, salt, and pepper.\n" +
  "7. Add chopped vegetables and simmer for about 10 minutes, or until vegetables are tender.\n" +
  "8. Stir in cooked lentils and let simmer for another 5 minutes.\n" +
  "9. Serve hot over cooked rice and enjoy!";

      Food lentilCurry= new Food ("Lentil Curry", lentilCurryIngredients, lentilCurryInstructions);
pantry.add(lentilCurry);


      String[] beefStirFryIngredients = {
  "beef sirloin",
  "broccoli",
  "onion",
  "garlic",
  "ginger",
  "soy sauce",
  "cornstarch",
  "beef broth",
  "brown sugar",
  "sesame oil",
  "vegetable oil",
  "rice"
};

      String beefStirFryInstructions = "1. Slice beef sirloin or flank steak thinly against the grain.\n" +
  "2. Cut broccoli into small florets.\n" +
  "3. Dice onion, mince garlic, and grate ginger.\n" +
  "4. In a small bowl, whisk together soy sauce, cornstarch, beef broth, brown sugar, and sesame oil to make the sauce.\n" +
  "5. Heat vegetable oil in a large skillet or wok over high heat.\n" +
  "6. Add sliced beef and cook until browned. Remove from the skillet and set aside.\n" +
  "7. In the same skillet, add more vegetable oil if needed.\n" +
  "8. Add diced onion, minced garlic, and grated ginger. Stir-fry until fragrant.\n" +
  "9. Add broccoli florets and stir-fry for 2-3 minutes.\n" +
  "10. Stir in the prepared sauce and cook until thickened.\n" +
  "11. Return the cooked beef to the skillet and stir-fry for another 2 minutes.\n" +
  "12. Season with salt and pepper to taste.\n" +
  "13. Serve hot over cooked rice and enjoy!";

Food beefStirFry= new Food ("beefStirFry", beefStirFryIngredients, beefStirFryInstructions);
pantry.add(beefStirFry);


      String[] spaghettiCarbonaraIngredients = {
  "spaghetti",
  "bacon",
  "eggs",
  "parmesan cheese",
  "garlic",
  "fresh parsley",
};

      String spaghettiCarbonaraInstructions = "1. Cook spaghetti according to package instructions until al dente. Drain and set aside.\n" +
  "2. Chop bacon or pancetta into small pieces.\n" +
  "3. Mince garlic and chop fresh parsley.\n" +
  "4. In a bowl, whisk together eggs, grated Parmesan cheese, minced garlic, chopped parsley, salt, and pepper.\n" +
  "5. In a large skillet, cook bacon or pancetta over medium heat until crispy.\n" +
  "6. Remove from the skillet and drain excess grease.\n" +
  "7. Add cooked spaghetti to the skillet with the cooked bacon or pancetta.\n" +
  "8. Stir in the egg mixture and cook for 1-2 minutes, stirring constantly, until the sauce thickens.\n" +
  "9. Remove from heat and season with additional salt and pepper to taste.\n" +
  "10. Serve hot and enjoy!";

      Food spaghettiCarbonara= new Food ("Spaghetti Carbonara", spaghettiCarbonaraIngredients, spaghettiCarbonaraInstructions);
pantry.add(spaghettiCarbonara);


      String[] shrimpAndGritsIngredients = {
  "shrimp",
  "grits",
  "butter",
  "onion",
  "bell pepper",
  "garlic",
  "chicken broth",
  "heavy cream",
  "cheddar cheese",
  "bacon",
  "green onions",
};

      String shrimpAndGritsInstructions = "1. Cook stone-ground grits according to package instructions.\n" +
  "2. In a large skillet, cook bacon until crispy. Remove from skillet and set aside.\n" +
  "3. In the same skillet, melt butter over medium heat.\n" +
  "4. Add diced onion, diced bell pepper, and minced garlic. Cook until softened.\n" +
  "5. Add raw shrimp to the skillet and cook until pink and opaque.\n" +
  "6. Remove shrimp from the skillet and set aside.\n" +
  "7. In the same skillet, add chicken or vegetable broth and bring to a simmer.\n" +
  "8. Stir in heavy cream and bring to a boil. Cook until slightly thickened.\n" +
  "9. Stir in grated cheddar cheese until melted.\n" +
  "10. Season with salt and pepper to taste.\n" +
  "11. Serve shrimp and sauce over cooked grits.\n" +
  "12. Crumble cooked bacon on top and sprinkle with chopped green onions.\n" +
  "13. Serve hot with optional hot sauce on the side and enjoy!";

Food shrimpAndGrits= new Food ("Shrimp And Grits", shrimpAndGritsIngredients, shrimpAndGritsInstructions);
pantry.add(shrimpAndGrits);
      


    }
}
