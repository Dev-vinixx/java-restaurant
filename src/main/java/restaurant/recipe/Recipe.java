package restaurant.recipe;

import org.jetbrains.annotations.NotNull;
import restaurant.recipe.ingredients.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String name;
    private final String summary;
    private final List<Ingredients> ingredients = new ArrayList<>();
    private final double value;

    public Recipe(@NotNull String name, @NotNull String summary, double value, @NotNull String @NotNull ... ingredients) {
        this.name = name;
        this.summary = summary;
        this.value = value;

        for (String ingredient : ingredients) {
            this.ingredients.add(new Ingredients(ingredient));
        }
    }

    public String getNAME() {
        return name;
    }

    public String getSUMMARY() {
        return summary;
    }

    public String getIngredients() {
        String[] ingredientsArray = new String[ingredients.size()];
        for (int i = 0; i < ingredients.size(); i++) {
            ingredientsArray[i] = ingredients.get(i).getName();
        }
        return String.join(", ", ingredientsArray);
    }

    public double getValue() {
        return value;
    }
}