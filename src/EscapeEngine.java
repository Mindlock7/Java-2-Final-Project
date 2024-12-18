//Logging Stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class EscapeEngine {
    // Logger object
    final static Logger log = LogManager.getLogger(EscapeRoomGame.class.getName());
    static Scanner UserInput = new Scanner(System.in);

    public void run() {
        // Parser
        VerbNounParser UserInputHandler = new VerbNounParser();

        // Location string created, used to track players location
        String location = "livingroom";

        // Creation of player inventory
        Inventory inv = new Inventory();

        // Creation of "isUsedInv" for items used before
        Inventory isUsedInv = new Inventory();

        // Creation of "isTakenInv" for items taken before
        Inventory isTakenInv = new Inventory();

        // Variable to make sure loop quits
        boolean running = true;

        // Game logic
        while (running) {
            System.out.println("\nWhat would you like to do?");
            String GivenData = UserInput.nextLine();

            // Handle "use" commands and win condition
            if (GivenData.startsWith("use")) {
                String[] parts = GivenData.split(" ");
                if (parts.length > 1) {
                    String itemToUse = parts[1];

                    // Check for win condition (using axe in living room)
                    if (itemToUse.equalsIgnoreCase("axe") && location.equals("livingroom") && inv.contains("SplittingAxe")) {
                        System.out.println("You swing the axe and break down the door! You escape!");
                        running = false; // Ends the game
                        break;
                    }

                    // Additional use logic (e.g., flashlight, key)
                    else {
                        Use useHandler = new Use();
                        useHandler.attemptUse(itemToUse, location, inv, isUsedInv);
                    }
                } else {
                    System.out.println("Specify what you want to use.");
                }
            }

            // Process other commands using VerbNounParser
            else {
                String returnedValue = UserInputHandler.Parse(GivenData, location, inv, isUsedInv, isTakenInv);

                // Check for "take" command
                if (returnedValue.equals("take")) {
                    Item result = UserInputHandler.parseTake(GivenData, location, isTakenInv);
                    Item dud = new Item("dud", "item didn't exist");
                    if (!result.equals(dud)) {
                        inv.addItem(result);
                        isTakenInv.addItem(result);
                    }
                } else {
                    location = returnedValue;
                }

                // Exit command
                if (GivenData.equalsIgnoreCase("exit")) {
                    log.debug("Shutting Down!");
                    running = false;
                }
            }
        }

        System.out.println("Game shutting down...");
    }
}
