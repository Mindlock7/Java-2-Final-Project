import java.util.Objects;

public class Use {

    public void useItem(String itemName, String location, Inventory inv, Inventory usedInv) {
        // Check if the item is in the player's inventory
        if (!inv.contains(itemName)) {
            System.out.println("You don't have that item in your inventory.");
            return;
        }

        switch (itemName.toLowerCase()) {

            // Using the flashlight
            case "flashlight":
                if (location.equals("basement") && !usedInv.contains("flashlight")) {
                    System.out.println("You turn on the flashlight, illuminating the dark basement.");
                    usedInv.addItem(new Item("flashlight", "Used to light up dark areas."));
                } else if (usedInv.contains("flashlight")) {
                    System.out.println("The flashlight is already on.");
                } else {
                    System.out.println("There's nothing to illuminate here.");
                }
                break;

            // Using the key
            case "key":
                if (location.equals("kitchen") && !usedInv.contains("key")) {
                    System.out.println("You use the key to unlock the basement door.");
                    usedInv.addItem(new Item("key", "Used to unlock the basement."));
                    Basement basement = new Basement();
                    basement.unlock(); // Unlock the basement
                } else if (usedInv.contains("key")) {
                    System.out.println("The key has already been used.");
                } else {
                    System.out.println("You can't use the key here.");
                }
                break;

            // Using the coat hanger
            case "hanger":
                if (location.equals("bathroom") && !usedInv.contains("hanger")) {
                    System.out.println("You use the coat hanger to press the button in the vent. A hidden compartment opens.");
                    usedInv.addItem(new Item("hanger", "Used to press a button in the bathroom vent."));
                    // Add any game logic for the secret compartment here
                } else if (usedInv.contains("hanger")) {
                    System.out.println("You've already used the coat hanger here.");
                } else {
                    System.out.println("You can't use the coat hanger here.");
                }
                break;

            default:
                System.out.println("You can't use that item here.");
                break;
        }
    }
}
