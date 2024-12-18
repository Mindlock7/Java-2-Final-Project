public class VerbNounParser {

    //Method for splitting the data and checking its result
    public String Parse(String data, String location, Inventory inv, Inventory used, Inventory taken) {
        // Spliting the data string from user
        String[] DataSplit = data.split(" ");

        // Grabs first piece of input (verb)
        String action = DataSplit[0].toLowerCase();

        // Prepares second piece of input (noun)
        String noun;
        try {
            noun = DataSplit[1].toLowerCase();
        }
        catch(ArrayIndexOutOfBoundsException _){
            noun = "";
        }

        // Searches to see what command user wants to do using verb
        switch (action) {
            case "move":
                Movement move = new Movement();
                location = move.attemptMove(noun, location);
                return location;

            case "take":
                return "take";

            case "help":
                System.out.println("The commands for the game:\n" +
                        "MOVE - Allows you to move into connected rooms (NOTE: Type rooms without spaces, ex: 'livingroom', 'masterbedroom')\n" +
                        "LOOK - Look at an item in the room to gain a better description\n" +
                        "TAKE - Attempt to take an item from the room and put it in your inventory\n" +
                        "INVENTORY - Shows what items are in your inventory\n");
                return location;

            case "look":
                Looking look = new Looking();
                look.lookat(noun, location);
                return location;

            case "inventory":
                inv.displayInventory();
                return location;

            default:
                System.out.println("Command is not recognized. Please try again.");
                return location;
        }
    }

    public Item parseTake(String data, String location, Inventory taken){

        // Splitting the data string from user
        String[] DataSplit = data.split(" ");

        // Prepares second piece of input (noun)
        String noun = DataSplit[1].toLowerCase();

        // Creates new instance of Taking class
        // Inputs the variables into the take method
        // Returns result to engine
        Taking take = new Taking();
        Item result = take.takeItem(location, noun, taken);
        return result;
    }
}
