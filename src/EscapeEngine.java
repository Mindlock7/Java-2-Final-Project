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

            // Process other commands using VerbNounParser
                String returnedValue = UserInputHandler.Parse(GivenData, location, inv, isUsedInv, isTakenInv);

                // Check for "take" command
                if (returnedValue.equals("take")) {
                    Item result = UserInputHandler.parseTake(GivenData, location, isTakenInv, isUsedInv);
                    Item dud = new Item("dud", "item didn't exist");
                    if (!result.equals(dud)) {
                        inv.addItem(result);
                        isTakenInv.addItem(result);
                    }
                }
                else if (returnedValue.equals("use")) {
                    Item result = UserInputHandler.parseUse(GivenData, location, isTakenInv, isUsedInv);
                    Item NoAction = new Item("No","Action");
                    Item Flashlight = new Item("Flashlight", "A typical  flashlight, found in the  master  bedroom's nightstand. It works, and\n" +
                            "seems to have a large battery.");
                    Item SplittingAxe = new Item("SplittingAxe", "A large  splitting axe found in the  basement.  Would work perfect as a more\n" +
                            "destructive key for the front door.");
                    if (result.equals(SplittingAxe)){
                        running = false;
                        System.out.println("You escaped and won the game!");
                    }
                    else if (!result.equals(NoAction) && !result.equals(Flashlight)){
                        inv.removeItem(result.getName());
                        isUsedInv.addItem(result);
                    }
                }
                else {
                    location = returnedValue;
                }

                // Exit command
                if (GivenData.equalsIgnoreCase("exit")) {
                    log.debug("Shutting Down!");
                    running = false;
                }

        }

        System.out.println("Game shutting down...");
    }
}
