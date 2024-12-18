public class Using {

    // Method to save time having to add help hint
    // after all text manually
    public void helptext() {
        System.out.println("\n" +
                "Use 'HELP' for a list of commands.");
    }

    // Creating a "useItem" method to use an item
    // By using the inv inventory, we can ensure the player has the item
    // By using the used inventory, we can ensure the player hasn't already used
    // a one time use item and is trying to use it again
    public Item useItem(String location, String noun, Inventory inv, Inventory used) {

        // Creating placeholder item to return when no action should be taken
        Item NoAction = new Item("No","Action");

        // Goes through each item in the game trying to see what one the user
        // wants to use.
        switch (noun) {
            case "bearkey":

                // Confirms that they have the key and they're in the right room
                if (inv.contains("BearKey")){
                    if (location.equals("masterbedroom")){
                        System.out.println("You use the  bears key and unlock the  nightstand.  You pull it open and find a\n" +
                                "flashlight inside.");

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item RugKey = new Item("RugKey", "Key found in  bear rug in the  living  room, appears to be for something smaller\n" +
                                "than a door.");
                        return RugKey;
                    }
                    else{
                        System.out.println("Item cannot be used here.");
                        return NoAction;
                    }
                }
                else{
                    System.out.println("Item not found in inventory");
                    return NoAction;
                }

            case "diningkey":

                // Confirms that they have the key and they're in the right room
                if (inv.contains("DiningKey")){
                    if (location.equals("kitchen")){
                        System.out.println("You use the key you found in the dining room's china hutch on the locked door in\n" +
                                "the kitchen. It unlocks it.");

                        //Guides the player a bit about how to progress
                        if (!used.contains("FlimsySaw")){
                            System.out.println("The board above still blocks the door.");
                        }
                        else if (used.contains("FlimsySaw")){
                            System.out.println("The basement is now accessible.");
                        }

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item DiningKey = new Item("DiningKey", "Key found in  the china hutch of the  dining  room. Appears to be for a door of\n" +
                                "some sort.");
                        return DiningKey;
                    }
                    else{
                        System.out.println("Item cannot be used here.");
                        return NoAction;
                    }
                }
                else{
                    System.out.println("Item not found in inventory");
                    return NoAction;
                }

            case "flashlight":

                // Confirms that they have the flashlight
                if (inv.contains("Flashlight")){

                    // Sees if flashlights already on or not and gives diff message
                    if (used.contains("Flashlight")){
                        System.out.println("The flashlight is  already on, and you don't  wish  to turn it off. Based on its\n" +
                                "brightness you're sure it has a lot of power  left,  and it makes  you feel more\n" +
                                "confident and safe.");
                        return NoAction;
                    }
                    else{
                        System.out.println("You turn the flashlight on. It isn't doing much now, but maybe in a dark room it\n" +
                                "will help.");

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item Flashlight = new Item("Flashlight", "A typical  flashlight, found in the  master  bedroom's nightstand. It works, and\n" +
                                "seems to have a large battery.");
                        return Flashlight;
                    }
                }
                else{
                    System.out.println("Item not found in inventory");
                    return NoAction;
                }

            default:
                // User input can't be correlated to an item
                System.out.println("Item not found in inventory");
                return NoAction;
        }
    }
}
