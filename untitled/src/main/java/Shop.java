import behaviours.ISell;

import java.util.ArrayList;

public class Shop{

    String name;
    private ArrayList<ISell> items;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfItems() {
        return this.items.size();
    }

    public void  addItem(ISell newItem) {
        items.add(newItem);
    }

    public void removeItem(ISell itemToRemove) {
        items.remove(itemToRemove);
    }

}
