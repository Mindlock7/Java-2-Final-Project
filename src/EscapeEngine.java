//Logging Stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class EscapeEngine {
     //Logger object
     final static Logger log = LogManager.getLogger(EscapeRoomGame.class.getName());
     static Scanner UserInput = new Scanner(System.in);


    public void run() {
        //Parser
        VerbNounParser UserInputHandler = new VerbNounParser();

        // Location string created, used to track players location
        // Defaults to living room when first ran because that's where player begins
        String location = "livingroom";

        // Creation of player inventory
        Inventory inv = new Inventory();

        // Creation of "isUsedInv" which is an inventory
        // used to verify if an item has been used before or not.
        // Useful for knowing when to unlock something
        Inventory isUsedInv = new Inventory();

        // Creation of "isTakenInv" which is an inventory
        // used to verify if an item has been taken before or not.
        // Useful for preventing item duplication in the taken class
        Inventory isTakenInv = new Inventory();

        //Variable to make sure loop quits
        boolean running = true;

        // Game logic
        while (running) {
            //UserInput
            String GivenData = UserInput.nextLine();

            //Processing commands
            String returnedValue = UserInputHandler.Parse(GivenData, location, inv, isUsedInv, isTakenInv);

            // Depending on what was returned, chooses a course of action
            // If "take" was returned, runs the taking command
            if (returnedValue.equals("take")){
                Item result = UserInputHandler.parseTake(GivenData, location, isTakenInv);

                // Creates dud, same item that would be created if item can't be taken
                // If result and dud match, doesn't add result to the inventories
                // If it does not, adds result
                Item dud = new Item("dud","item didn't exist");
                if (result.equals(dud)){
                    // Nothing happens
                }
                else{
                    inv.addItem(result);
                    isTakenInv.addItem(result);
                }
            }

            // If returned value isnt a take, its confirmed to be a location
            else{
                location = returnedValue;
            }

            //Exitting if necessary
            if (GivenData.equalsIgnoreCase("exit")) {
                log.debug("Shutting Down!");
                running = false;
            }
        }

        System.out.println("Game shutting down");
    }
}