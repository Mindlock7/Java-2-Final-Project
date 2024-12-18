public class Use {

    public void attemptUse(String itemName, String location, Inventory inv, Inventory isUsedInv) {
        // Check if the item exists in inventory
        if (!inv.contains(itemName)) {
            System.out.println("You don't have a " + itemName + " to use.");
            return;
        }

        // Handle specific item uses
        switch (itemName.toLowerCase()) {
            case "flashlight":
                if (location.equals("basement")) {
                    System.out.println("You turn on the flashlight and illuminate the basement.");
                    isUsedInv.addItem(new Item("flashlight", "Used to illuminate dark areas."));
                } else {
                    System.out.println("You turn on the flashlight, but there's nothing special to see here.");
                }
                break;

            case "key":
                if (location.equals("basement")) {
                    System.out.println("You use the key to unlock the basement door.");
                    isUsedInv.addItem(new Item("key", "Used to unlock doors."));
                } else {
                    System.out.println("There’s nothing to unlock with the key here.");
                }
                break;

            case "hanger":
                System.out.println("You bend the wire hanger into a hook. It might help reach something small.");
                break;

            default:
                System.out.println("The " + itemName + " cannot be used here.");
        }
    }
}
