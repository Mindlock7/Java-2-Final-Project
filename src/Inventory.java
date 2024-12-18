import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    // Method to save time having to add help hint
    // after all text manually
    public void helptext() {
        System.out.println("\n" +
                "Use 'HELP' for a list of commands.");
    }

    // Add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
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

    // Checks to see if incoming item already exists in inventory
    public boolean contains(String itemName){
        for (Item x : items) {
            if (x.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

    // Display all items in the inventory
    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Your inventory is empty.");
            helptext();
        }
        else {
            System.out.println("Inventory:");
            for (Item item : items) {
                System.out.println(item);
            }
            helptext();
        }
    }
}
