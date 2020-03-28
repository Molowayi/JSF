package be.molowayi.jsf;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class PizzaIngredients implements Serializable {

    private String[] ingredients;

    private static SelectItem[] ingredientItems = {
            new SelectItem("bacon", "Bacon"),
            new SelectItem("cheese", "Cheese"),
            new SelectItem("egg", "Egg"),
            new SelectItem("mushrooms", "Mushrooms"),
            new SelectItem("oregano", "Oregano"),
            new SelectItem("pepper", "Pepper"),
            new SelectItem("salami", "Salami"),
            new SelectItem("tomatoes", "Tomatoes")
    };

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public static SelectItem[] getIngredientItems() {
        return ingredientItems;
    }

    public static void setIngredientItems(SelectItem[] ingredientItems) {
        PizzaIngredients.ingredientItems = ingredientItems;
    }
}
