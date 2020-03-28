package be.molowayi.jsf;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class PizzaOrder implements Serializable {
    private String name;
    private String password;
    private String size;
    private String bottom;
    private boolean spicy;
    private int number;
    private String[] ingredients;

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    private static SelectItem[] ingredientItems ;    /* egion Description = {
        new SelectItem("bacon","Bacon"),
        new SelectItem("cheese","Cheese"),
        new SelectItem("egg","Egg"),
        new SelectItem("mushrooms","Mushrooms"),
        new SelectItem("oregano","Oregano"),
        new SelectItem("pepper","Pepper"),
        new SelectItem("salami","Salami"),
        new SelectItem("tomatoes","Tomatoes"),
    };
    */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public static SelectItem[] getIngredientItems() {
        return ingredientItems;
    }

    public static void setIngredientItems(SelectItem[] ingredientItems) {
        PizzaOrder.ingredientItems = ingredientItems;
    }

    public void save(){
        System.out.println("Data were saved");

//        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
//        context.redirect(context.getRequestContextPath() + "download-page.jsf?product=" + product + "&version=" + version);

        /*
        * FacesContext context = FacesContext.getCurrentInstance();
    HttpServletRequest origRequest = (HttpServletRequest)context.getExternalContext().getRequest();
    contextPath = origRequest.getContextPath();
try {
        FacesContext.getCurrentInstance().getExternalContext()
                .redirect(contextPath  + "/faces/OpenedAccountsProductTypeLevel.xhtml");
    } catch (IOException e) {
        e.printStackTrace();
    }
        *
        *
        * */
    }
}
