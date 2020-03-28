package be.molowayi.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ChoppingCart implements Serializable {
    private double total;

    private Item[] items = {
      new Item("Appels", 2.0d),
      new Item("Pears", 1.7d),
      new Item("Bananas", 3.0d),
      new Item("Oranges", 2.5d),
      new Item("Kiwi", 3.5d)
    };

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void calculate(){
        total =0;
        for (Item item :
                items) {
            total += item.getPrice() * item.getNumber();
        }
    }
}
