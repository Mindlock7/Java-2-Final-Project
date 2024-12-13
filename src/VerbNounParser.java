public class VerbNounParser {

    //Method for splitting the data and checking its result
    public void Parse(String data) {
        String[] DataSplit = data.split(" ");

        // Grabs first piece of input (verb)
        String action = DataSplit[0].toLowerCase();

        // Searches to see what command user wants to do using verb
        switch (DataSplit[0]) {
            case "move":
                System.out.println("Today is Saturday");
                break;
            case "take":
                System.out.println("Today is Sunday");
                break;
            case "help":
                System.out.println("The commands for the game:" +
                        "MOVE - Allows you to move into connected rooms" +
                        "LOOK - Look at an item in the room to gain a better description" +
                        "TAKE - Attempt to take an item from the room and put it in your inventory" +
                        "INVENTORY - Shows what items are in your inventory");
                break;
            case "look":
                System.out.println("Today is Sunday");
                break;
            case "inventory":

            default:
                System.out.println("Command is not recognized. Please try again.");
        }
    }
}
