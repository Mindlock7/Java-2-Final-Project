public class Taking {

    // Method to save time having to add help hint
    // after all text manually
    public void helptext() {
        System.out.println("\n" +
                "Use 'HELP' for a list of commands.");
    }

    // Creating a "takeItem" method to create an item
    // By using the taken inventory, we can prevent item dupes
    // By using the used inventory, we can ensure prereq's for the item were met
    public Item takeItem(String location, String noun, Inventory taken, Inventory used){

        // Creates placeholder item "dud"
        // If dud is returned, it will not be added to either inventory
        Item dud = new Item("dud","item didn't exist");

        // Switch statement to cycle through possible rooms with items
        // Compares user location to know where to look for input item
        switch (location) {
            case "livingroom":

                // If user input is the word "key", creates an item
                if (noun.equals("key")){
                    Item RugKey = new Item("RugKey", "Key found in  bear rug in the  living  room, appears to be for something smaller\n" +
                            "than a door.");

                    // If item is in taken already, means the user has already
                    // had this item, and will not give it to them again
                    if (taken.contains("RugKey")){
                        System.out.println("You've already taken this item.");
                        helptext();
                        return dud;
                    }
                    else{
                        System.out.println("RugKey added to inventory.");
                        helptext();
                        return RugKey;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            case "diningroom":
                // If user input is the word "key", creates an item
                if (noun.equals("key")){

                    //Ensures china hutch was unlocked before taking
                    if (used.contains("SmallNote")){
                        Item DiningKey = new Item("DiningKey", "Key found in  the china hutch of the  dining  room. Appears to be for a door of\n" +
                                "some sort.");

                        // If item is in taken already, means the user has already
                        // had this item, and will not give it to them again
                        if (taken.contains("DiningKey")){
                            System.out.println("You've already taken this item.");
                            helptext();
                            return dud;
                        }
                        else{
                            System.out.println("DiningKey added to inventory.");
                            helptext();
                            return DiningKey;
                        }
                    }
                    else{
                        // Player input not found in room as item
                        // (prereq's weren't met)
                        // Returns dud to add no item to inventory
                        System.out.println("Item not found.");
                        helptext();
                        return dud;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            case "kitchen":
                // If user input is the word "saw", creates an item
                if (noun.equals("saw")||noun.equals("flimsysaw")||noun.equals("flimsy")){

                    // Ensuring button was pressed to open fridge
                    if (used.contains("WireHanger")){
                        Item FlimsySaw = new Item("FlimsySaw", "A saw found in the kitchen fridge. Looks way too flimsy for anything serious. It\n" +
                                "cant do anything more than a board or two.");

                        // If item is in taken already, means the user has already
                        // had this item, and will not give it to them again
                        if (taken.contains("FlimsySaw")){
                            System.out.println("You've already taken this item.");
                            helptext();
                            return dud;
                        }
                        else{
                            System.out.println("FlimsySaw added to inventory.");
                            helptext();
                            return FlimsySaw;
                        }
                    }
                    else{
                        // Player input not found in room as item
                        // (prereq's weren't met)
                        // Returns dud to add no item to inventory
                        System.out.println("Item not found.");
                        helptext();
                        return dud;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            case "masterbedroom":
                // If user input is the word "flashlight", creates an item
                if (noun.equals("flashlight")){

                    // Ensures the nightstand was unlocked before taking
                    if (used.contains("BearKey")){
                        Item Flashlight = new Item("Flashlight", "A typical  flashlight, found in the  master  bedroom's nightstand. It works, and\n" +
                                "seems to have a large battery.");

                        // If item is in taken already, means the user has already
                        // had this item, and will not give it to them again
                        if (taken.contains("Flashlight")){
                            System.out.println("You've already taken this item.");
                            helptext();
                            return dud;
                        }
                        else{
                            System.out.println("Flashlight added to inventory.");
                            helptext();
                            return Flashlight;
                        }
                    }
                    else{
                        // Player input not found in room as item
                        // (prereq's weren't met)
                        // Returns dud to add no item to inventory
                        System.out.println("Item not found.");
                        helptext();
                        return dud;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            case "masterbedroombathroom":
                // If user input is the word "note", creates an item
                if (noun.equals("note")||noun.equals("smallnote")||noun.equals("small")){
                    Item SmallNote = new Item("SmallNote", "A small  note you found attached to  the master bedroom bathroom's mirror. Has a\n" +
                            "birthday on it, but you're unsure of what  those 4 numbers written could be used\n" +
                            "for.");

                    // If item is in taken already, means the user has already
                    // had this item, and will not give it to them again
                    if (taken.contains("SmallNote")){
                        System.out.println("You've already taken this item.");
                        helptext();
                        return dud;
                    }
                    else{
                        System.out.println("SmallNote added to inventory.");
                        helptext();
                        return SmallNote;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            case "basement":
                // If user input is the word "axe", creates an item
                if (noun.equals("axe")||noun.equals("splitting")||noun.equals("splittingaxe")){
                    Item SplittingAxe = new Item("SplittingAxe", "A large  splitting axe found in the  basement.  Would work perfect as a more\n" +
                            "destructive key for the front door.");

                    // If item is in taken already, means the user has already
                    // had this item, and will not give it to them again
                    if (taken.contains("SplittingAxe")){
                        System.out.println("You've already taken this item.");
                        helptext();
                        return dud;
                    }
                    else{
                        System.out.println("SplittingAxe added to inventory.");
                        helptext();
                        return SplittingAxe;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            case "closet":
                // If user input is the word "hanger", creates an item
                if (noun.equals("wire")||noun.equals("hanger")||noun.equals("wirehanger")){
                    Item WireHanger = new Item("WireHanger", "A wirehanger  from the closet. Very flimsy and easily bendable, it can likely be\n" +
                            "used to reach things in small spaces your fingers can't.");

                    // If item is in taken already, means the user has already
                    // had this item, and will not give it to them again
                    if (taken.contains("WireHanger")){
                        System.out.println("You've already taken this item.");
                        helptext();
                        return dud;
                    }
                    else{
                        System.out.println("WireHanger added to inventory.");
                        helptext();
                        return WireHanger;
                    }
                }
                else{
                    // Player input not found in room as item
                    // Returns dud to add no item to inventory
                    System.out.println("Item not found.");
                    helptext();
                    return dud;
                }

            // Location doesn't have an item in it
            default:
                System.out.println("Item not found.");
                helptext();
                return dud;
        }
    }
}
