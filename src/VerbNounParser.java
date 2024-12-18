public class VerbNounParser {

    // Method for splitting the data and checking its result
    public String Parse(String data, String location, Inventory inv, Inventory used, Inventory taken) {
        String[] DataSplit = data.split(" ");

        // Grabs first word (verb)
        String action = DataSplit[0].toLowerCase();

        // Prepare second word (noun)
        String noun;
        try {
            noun = DataSplit[1].toLowerCase();
        } catch (ArrayIndexOutOfBoundsException _) {
            noun = "";
        }

        switch (action) {
            case "move":
                Movement move = new Movement();
                location = move.attemptMove(noun, location, used);
                return location;

            case "take":
                return "take";

            case "use":
                return "use";

            case "look":
                Looking look = new Looking();
                look.lookat(noun, location);
                return location;

            case "inventory":
                inv.displayInventory();
                return location;

            case "help":
                System.out.println("The commands for the game:\n" +
                        "MOVE - Allows you to move into connected rooms (ex: 'livingroom')\n" +
                        "LOOK - Look at an item in the room to gain a better description\n" +
                        "TAKE - Attempt to take an item\n" +
                        "USE - Use an item in your inventory (ex: 'use axe')\n" +
                        "INVENTORY - Shows what items are in your inventory\n" +
                        "EXIT - Exit the game\n");
                return location;

            default:
                System.out.println("Command not recognized. Please try again.");
                return location;
        }
    }

    public Item parseTake(String data, String location, Inventory taken, Inventory used) {
        String[] DataSplit = data.split(" ");
        String noun;

        try {
            noun = DataSplit[1].toLowerCase();
        } catch (ArrayIndexOutOfBoundsException e) {
            noun = "";
        }

        Taking take = new Taking();
        return take.takeItem(location, noun, taken, used);
    }

    public Item parseUse(String data, String location, Inventory inv, Inventory used) {
        String[] DataSplit = data.split(" ");
        String noun;

        try {
            noun = DataSplit[1].toLowerCase();
        } catch (ArrayIndexOutOfBoundsException e) {
            noun = "";
        }

        Using use = new Using();
        return use.useItem(noun, location, inv, used);
    }
}