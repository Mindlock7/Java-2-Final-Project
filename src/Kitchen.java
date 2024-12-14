import java.util.ArrayList;
import java.util.List;

public class Kitchen implements RoomTemplate
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
        System.out.println("As you  walk into the kitchen, your  gut quivers and drops slightly, but looking\n" +
                "around,  there’s no feasible explanation as  to  why.  Something just  feels off\n" +
                "about this room despite its seemingly normal appearance. A black and white vinyl\n" +
                "floor  creates  the typical   kitchen  look, paired with  the  usual appliances.\n" +
                "Cupboards line the walls, sitting both above and below a granite countertop. The\n" +
                "countertop runs along the wall, wrapping around  a corner of the kitchen to form\n" +
                "an L shape. In said corner is the kitchen   sink,  with windows on  its left and\n" +
                "right,  boarded up tight the same  as the ones in the living  room  were. On the\n" +
                "right edge of the countertop, where  it ends, sits a fridge, softly humming away\n" +
                "as  it chills whatever’s inside.  On the ground beside the fridge sits a pair of\n" +
                "metal bowls.  Against the left edge  of   the  countertop sits a  stove, looking\n" +
                "somehow  old yet new at the  same time, being a recent model  but  looking as if\n" +
                "it’s  been used  for years  on  end without being maintained or cleaned.  On the\n" +
                "opposite wall sits a closed door,  looking very uninviting compared to the other\n" +
                "door connected to the room, leading to the dining room.\n" +
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
