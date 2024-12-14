import java.util.ArrayList;
import java.util.List;

public class Bathroom implements RoomTemplate
{
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
        System.out.println("The bathroom  is smaller than expected,   lacking  any sort of  liveliness, with\n" +
                "plain   walls  and a  dull   floor.  It  contains  all of   the typical bathroom\n" +
                "necessities, a toilet against the wall to your left with a sink  on the opposite\n" +
                "wall, a plain mirror above that. Directly ahead of you is an empty bathtub, with\n" +
                "a  wall vent to the left, right where you’d get  out of  the tub at. If the heat\n" +
                "was on as you got out,  it’d probably feel pretty nice. The  only doorway in the\n" +
                "room is the one you entered through, leading back to the dining room.\n" +
                "\n" +
                "Use 'HELP' for a list of commands.");
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
