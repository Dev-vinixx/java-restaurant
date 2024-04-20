package restaurant.recipe.ingredients;

public record Ingredients(String name) {
    public String getName () {
        return name();
    }
}