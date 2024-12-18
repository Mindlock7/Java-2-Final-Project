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

            case "wirehanger":

                // Confirms that they have the hanger and they're in the right room
                if (inv.contains("WireHanger")){
                    if (location.equals("bathroom")){
                        System.out.println("You quickly undo  the hanger to get a  long  piece of wire and  start fishing it\n" +
                                "down into the vent. While it takes you a little while to get, you eventually get\n" +
                                "the wire to press down on the button,  rewarding you with a satisfying click and\n" +
                                "nothing  after. You half wonder if you just wasted your  time, but a part of you\n" +
                                "stays hopeful that something somewhere happened.");

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item WireHanger = new Item("WireHanger", "A wirehanger  from the closet. Very flimsy and easily bendable, it can likely be\n" +
                                "used to reach things in small spaces your fingers can't.");
                        return WireHanger;
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

            case "smallnote":

                // Confirms that they have the note and they're in the right room
                if (inv.contains("SmallNote")){
                    if (location.equals("diningroom")){
                        System.out.println("The lock on  the china hutch pops open  after you look at the note and enter the\n" +
                                "birthday into the padlock, allowing you to open  the cabinet. Inside is an empty\n" +
                                "gift bag and some printer paper, but on top  of  the printer paper  rests a key,\n" +
                                "looking like one to a door of some sort.");

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item SmallNote = new Item("SmallNote", "A small  note you found attached to  the master bedroom bathroom's mirror. Has a\n" +
                                "birthday on it, but you're unsure of what  those 4 numbers written could be used\n" +
                                "for.");
                        return SmallNote;
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

            case "flimsysaw":

                // Confirms that they have the saw and they're in the right room
                if (inv.contains("FlimsySaw")){
                    if (location.equals("kitchen")){
                        System.out.println("You grab the  flimsy saw, hoping that it can at least cut through this one board\n" +
                                "holding the door closed without falling  apart.  You saw and saw, and eventually\n" +
                                "get through the board. When you go to pull the saw out though, the blade snaps.");

                        //Guides the player a bit about how to progress
                        if (!used.contains("DiningKey")){
                            System.out.println("The door's knob is still locked.");
                        }
                        else if (used.contains("DiningKey")){
                            System.out.println("The basement is now accessible.");
                        }

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item FlimsySaw = new Item("FlimsySaw", "A saw found in the kitchen fridge. Looks way too flimsy for anything serious. It\n" +
                                "cant do anything more than a board or two.");
                        return FlimsySaw;
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

            case "splittingaxe":
                // Confirms that they have the axe and they're in the right room
                if (inv.contains("SplittingAxe")){
                    if (location.equals("livingroom")){
                        System.out.println("You use the axe and hack away at the front door, the heay oak splitting more and\n" +
                                "more with  each chop, the  iron   reinforcements  struggling to  hold everything\n" +
                                "together.  Eventually, with enough time   and effort, you break   down the door,\n" +
                                "leaving  shards  of wood and  iron everywhere.  You throw down the axe and catch\n" +
                                "your breath as you study the outside. You're in the woods, in the dark, the full\n" +
                                "moon  barely providing enough light  to see   the  outlines of   the  trees. The\n" +
                                "fireplace inside provides enough light to  see a dusty dirt path before you. You\n" +
                                "take  a few more  deep breaths and prepare yourself, knowing anything can happen\n" +
                                "once you  leave that door. You gather  yourself,  count down from  three in your\n" +
                                "head, and take off, sprinting down the path.");

                        // Creates duplicate of item and returns it
                        // Tells command outside to remove it from inv and add to used
                        Item SplittingAxe = new Item("SplittingAxe", "A large  splitting axe found in the  basement.  Would work perfect as a more\n" +
                                "destructive key for the front door.");
                        return SplittingAxe;
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

            default:
                // User input can't be correlated to an item
                System.out.println("Item not found in inventory");
                return NoAction;
        }
    }
}
