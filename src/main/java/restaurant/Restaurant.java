package restaurant;

import org.jetbrains.annotations.NotNull;
import restaurant.recipe.Recipe;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<Recipe> revenue = new ArrayList<>();

    private double amount = 0;
    public void newRevenue (@NotNull String name, @NotNull String summary, double value,@NotNull String @NotNull ... ingredients) {
        revenue.add(new Recipe(name, summary, value, ingredients));
    }
    public String getMenu () {
        if (revenue.isEmpty()) {
            return "The menu is empty.";
        }
        StringBuilder menu = new StringBuilder();
        for (Recipe rev : revenue) {
            menu.append("Name: ").append(rev.getNAME())
                    .append("\nSummary: ").append(rev.getSUMMARY())
                    .append("\nValue: ").append(rev.getValue())
                    .append("\nIngredients: ").append(rev.getIngredients())
                    .append("\n\n");
        }
        return menu.toString();
    }

    public double getAmount () {
        return amount;
    }
    private void setAmount (double value) {
        this.amount += amount;
    }
    public String buyItem (@NotNull String name, User user) {
        if (name.isBlank()) {
            return "the name of the item cannot be found because it is null.";
        }
        for (Recipe rec : revenue) {
            if (rec.getNAME().equalsIgnoreCase(name)) {
                if (rec.getValue() <= user.getAmount()) {
                    user.setAmount(-(rec.getValue()));
                    setAmount(rec.getValue());
                    return "the purchase was successful, enjoy your item.";
                } else {
                    return "you don’t have the money to buy this item. Please, don’t insist.";
                }
            }
        }
        return "there is no item with that name on the menu.";
    }
}
