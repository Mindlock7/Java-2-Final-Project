import java.util.ArrayList;
import java.util.List;

public interface RoomTemplate {

    // Stores room connections
    List<String> connections = new ArrayList<>();

    // Stores room items
    List<String> roomItemsList = new ArrayList<>();

    // Contains room connections
    // Will be used to navigate between rooms
    public default List<String> connectedRooms()
    {
        return connections;
    }

    // Will display a description of the room
    // Used whenever a player first enters a room
    public void roomDescription();

    // Contains items within the room
    // Will be used to know what items the player can pick up
    public default List<String> roomItems()
    {
        return roomItemsList;
    }

    // Will be used to interact with "interactables" in the room
    // Needed for items that can't be picked up, but just looked at
    public void roomInteractables();
}
