import java.util.ArrayList;
import java.util.List;

public class Basement implements RoomTemplate
{
    private boolean isLocked = true; // The basement starts locked

    private boolean isDark = true; // Requires player to have flashlight

    // Stores room connections
    List<String> connections = new ArrayList<>();

    // Stores room items
    List<String> roomItemsList = new ArrayList<>();

    // Method will return the room connections list
    @Override
    public List<String> connectedRooms()
    {
        return connections;
    }

    // Description of room given to user
    @Override
    public void roomDescription()
    {
        System.out.println("");
    }

    // Method returns the room items list
    @Override
    public List<String> roomItems()
    {
        return roomItemsList;
    }

    // Switch statement will be placed here in this method
    // Paired with the verb noun parser, this will give descriptions about the room
    @Override
    public void roomInteractables()
    {
        // Insert interactables here...
    }

    public boolean isLocked() {
        return isLocked;
    }

    // Unlocks the basement
    public void unlock() {
        isLocked = false;
        System.out.println("You unlocked the basement!");
    }

    public boolean isDark() {
        return isDark;
    }

    // Unlocks the basement
    public void useLight() {
        isDark = false;
        System.out.println("You illuminate the basement with your flashlight.");
    }
}