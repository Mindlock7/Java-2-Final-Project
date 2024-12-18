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
        System.out.println("Clicking the flashlight  on, you use it to  look down the steps. Before you is a\n" +
                "mud floor, but nothing else is visible from the   top  of the steps.  You take a\n" +
                "brief  deep breath and cautiously   place one foot after another   on each step,\n" +
                "trying  to ease  your weight  onto the flimsy boards and remain light as can be.\n" +
                "Once you reach the bottom, you glance  around. It’s a typical old basement, with\n" +
                "pipes  running along the walls  before going   up  into the  ceiling  at various\n" +
                "places. In the corner rests a  stack of cut wood, undoubtedly  for the fireplace\n" +
                "above.  A few  feet from  the stack  sits   a larger log, with  a rustic looking\n" +
                "splitting  axe lodged in the top.  The  only way in  and out  appears  to be the\n" +
                "stairs  to  the kitchen you  came down,   with  no doors nor  high up foundation\n" +
                "windows to be seen.\n" +
                "\n" +
                "Use 'HELP' for a list of commands.");
    }

    public void roomDescNoLight(){
        System.out.println("You stare  down into a dark void  from  the kitchen, the  darkness consuming the\n" +
                "light coming from the kitchen as if  it’s intentionally trying to blind you. The\n" +
                "most you can see are a few rickety steps against a cracking stone wall. You test\n" +
                "one   with your foot and  get  a  loud creaking as  a response,  almost  as if a\n" +
                "warning. You  feel uncomfortable going down there  with  no way to see what’s in\n" +
                "front of you. You stand at the top  of the  stairs, thinking,  the kitchen being\n" +
                "right behind you.\n" +
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