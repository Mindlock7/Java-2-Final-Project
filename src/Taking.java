public class Taking {

    // Creating a "takeItem" method to create an item
    // and place it in 2 inventories: the players and the 'taken'
    // inventory. Players inventory will be changeable, the taken
    // will not be. By doing this we will have a log of what has already
    // been taken, therefore preventing it from being taken again
    public Item takeItem(String location, String noun, Inventory taken){

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
                        return dud;
                    }
                    else{
                        System.out.println("RugKey added to inventory.");
                        return RugKey;
                    }
                }
                else{
                    // Player was in a room where item couldn't be taken
                    // Returns dud to add no item to inventory
                    return dud;
                }

            // Location doesn't have an item in it
            default:
                return dud;
        }
    }
}
