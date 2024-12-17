import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    // Add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " has been added to your inventory.");
    }

    // Remove an item from the inventory by name
    public boolean removeItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    // Display all items in the inventory
    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
