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

        //Inventory (temp)
        List<Items> Inventory = new ArrayList<>();

        //Variable to make sure loop quits
        boolean running = true;

        // Creating objects
        LivingRoom livingRoom = new LivingRoom();

        //Creating key (check and use methods can be tested)
        Key key1 = new Key(1, "This isn't a normal key", "Yellow Key");

        //Putting it in bearskin rug
        BearRug bearRug = new BearRug();

        // Game logic
        while (running) {
            //UserInput
            String GivenData = UserInput.nextLine();

            //Processing commands
            location = UserInputHandler.Parse(GivenData, location);

            //Exitting if necessary
            if (GivenData.equalsIgnoreCase("exit")) {
                log.debug("Shutting Down!");
                running = false;
            }
        }

        System.out.println("Game shutting down");
    }
}