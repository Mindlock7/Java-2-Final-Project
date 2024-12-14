import java.util.ArrayList;
import java.util.List;

public class MasterBedroom implements RoomTemplate
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
        System.out.println("Walking into  the master bedroom, a  sense   of warmth and coziness  greets you.\n" +
                "Given normal circumstances, this would be a nice room to  call your own. A large\n" +
                "king  size bed sits against the wall, taking up the middle of  the room. Against\n" +
                "one side of the bed sits a   dark oak nightstand, and on the  other sits an open\n" +
                "door,  leading into  a master  bathroom. In a corner of the room sits a matching\n" +
                "dark oak dresser, with a large mirror on top  of  it. In front of the bed sits a\n" +
                "shag rug, looking old and worn down. The soft popping from the  fireplace can be\n" +
                "heard through the door leading to the living room.\n" +
                "\n" +
                "Use 'HELP' for a list of commands");
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
