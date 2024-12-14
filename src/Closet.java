import java.util.ArrayList;
import java.util.List;

public class Closet implements RoomTemplate
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
        System.out.println("Entering the  closet, you flick on the   light  switch and wait,  the light bulb\n" +
                "taking a moment before flickering to life and illuminating  the room with a soft\n" +
                "warm  glow, similar to  the   light the chandelier produces in   the dining room\n" +
                "behind you. Upon looking around, you see it’s very cramped and claustrophobic in\n" +
                "here,  with  a faint smell of moth balls greeting your nose. There’s fancy dress\n" +
                "clothing for both male and female  figures   hanging  along the rack,  taking up\n" +
                "every   wire hanger  in the  room   besides one on the far end.   Outside of the\n" +
                "clothing though, the room is  pretty   barren,  disappointing you  slightly. The\n" +
                "floor is clear of anything, just plain wooden boards slowly starting to warp.\n" +
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
