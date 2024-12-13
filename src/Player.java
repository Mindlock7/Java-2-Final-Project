import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in the Escape Room game.
 * Each player has a name, a current room, and an inventory of items.
 */
public class Player {

    private String name; // The player's name
    private Room currentRoom; // The room the player is currently in
    private List<String> inventory; // The player's inventory

    // Constructor
    public Player(String name, Room startingRoom) {
        this.name = name;
        this.currentRoom = startingRoom;
        this.inventory = new ArrayList<>();
    }

    // Getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for current room
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    // Inventory management
    public void addToInventory(String item) {
        inventory.add(item);
    }

    public boolean removeFromInventory(String item) {
        return inventory.remove(item);
    }

    public List<String> getInventory() {
        return new ArrayList<>(inventory); // Return a copy to prevent external modification
    }

    @Override
    public String toString() {
        return "Player: " + name + "\nCurrent Room: " + (currentRoom != null ? currentRoom.getName() : "None") + "\nInventory: " + inventory;
    }
}
