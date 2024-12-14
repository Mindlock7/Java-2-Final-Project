import java.util.ArrayList;
import java.util.List;

public class DiningRoom implements RoomTemplate
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
        System.out.println("Entering the dining  room, you quickly realize  that  this seems to be more of a\n" +
                "connecting room than anything. Doorways take up  the majority of each  wall with\n" +
                "no décor on them, creating a very open concept feel.  In the center sits a large\n" +
                "wooden  table with chairs around it, being very tidy besides a newspaper sitting\n" +
                "on it’s surface. Above the  table hangs a metal chandelier,   providing light to\n" +
                "the room. One doorway leads to the kitchen, you discover as you peek through it.\n" +
                "Walking  around the  room to  the  next wall, you try the door sitting there and\n" +
                "find it unlocked, opening up to a  bathroom.  Further along the same wall sits a\n" +
                "tall china hutch, showing distinct weathering and age. Walking past that  to the\n" +
                "next  wall, you discover  a   closet, the  door  already being   opened a crack.\n" +
                "Finally,  you proceed to the the last wall, finding nothing but another doorway.\n" +
                "Hardly a wall  at all with how much of  it is opened up to be a large doorway to\n" +
                "the living room, but alas, counted as a wall nonetheless.\n" +
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