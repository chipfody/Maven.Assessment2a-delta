package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private List <String> items;
    private Map <String, Integer> inventory;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.items = strings;
        inventory = new HashMap<>();
        for (String item : items)
            if (inventory.containsKey(item)) {
                inventory.put(item, inventory.get(item) + 1);
            } else {
                inventory.put(item, 1);
            }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        Map <String, Integer> inventory = new HashMap<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) + 1);
        } else {
            inventory.put(item, 1);
        }
       }


    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        inventory.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return null;
    }
}
