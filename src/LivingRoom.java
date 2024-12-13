import java.util.ArrayList;
import java.util.List;

public class LivingRoom implements RoomTemplate{

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
        //Example
        System.out.println("You walk into a cozy living room, the wood floorboards " +
                "thumping with each step under your feet. The room is warmly illuminated " +
                "by a fireplace set in the corner, crackling away with small pops as the wood " +
                "inside burns. Glancing around, you see a brown leather couch with a small " +
                "glass coffee table in front of it, a decorative pot filled with small cactus " +
                "on top of it. A bearskin rug sits in front of that, serving as a centerpiece " +
                "for the room. A grandfather clock softly clicks against the wall next to an " +
                "opened door, showing a dining area in the next room over. You notice the " +
                "windows next to the front door are boarded up tight with strong boards, and " +
                "no light is shining through the cracks, suggesting it's night outside of the " +
                "house. Against another wall is a bookshelf, with regular wall shelving on each " +
                "side of it. The bookshelf is full of books, and the shelves are lined with " +
                "trinkets and picture frames. Besides the bookshelf is a door, leading to what " +
                "appears to be a master bedroom." +
                " " +
                "Use 'HELP' command for commands");
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
}
