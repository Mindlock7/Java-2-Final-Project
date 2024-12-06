import java.util.ArrayList;
import java.util.List;

/**
 * Represents a room in the Escape Room game.
 * Each room has a name, description, items, and connections to other rooms.
 */
public class Room {

    private String name;
    private String description;
    private List<String> items; // Items present in the room
    private List<String> connectedRooms; // Names of connected rooms

    // Constructor
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
        this.connectedRooms = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }

    public List<String> getConnectedRooms() {
        return new ArrayList<>(connectedRooms);
    }

    public void addConnectedRoom(String roomName) {
        connectedRooms.add(roomName);
    }

    @Override
    public String toString() {
        return "Room: " + name + "\nDescription: " + description + "\nItems: " + items.toString() + "\nConnected Rooms: " + connectedRooms.toString();
    }
}

