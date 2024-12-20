import java.util.ArrayList;
import java.util.List;

public class MasterBedroomBathroom implements RoomTemplate
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
        System.out.println("Walking  into  the bathroom connected to   the  master  bedroom,  the  cold tile\n" +
                "flooring  sends shivers through  your   body. You don’t know what  else you were\n" +
                "expecting besides  the seemingly normal bathroom  that  sits before you.  In the\n" +
                "corner sits a toilet, across from that a  walk in shower. To your immediate left\n" +
                "is a mirror doubling as the door for a medicine cabinet. A small note appears to\n" +
                "be stuck to the mirror. Below the medicine cabinet is  a small porcelain sink, a\n" +
                "pill bottle sitting next to the hot and cold handles. The bathroom only connects\n" +
                "to the master bedroom, leaving you in a dead end.\n" +
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