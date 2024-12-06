//Logging Stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class EscapeEngine {
     //Logger object
     final static Logger log = LogManager.getLogger(EscapeRoomGame.class.getName());
     static Scanner UserInput = new Scanner(System.in);

    public void run() {
        //Parser
        NounVerbParser UserInputHandler = new NounVerbParser();
        //Variable to make sure loop quits
        boolean running = true;
        // Creating objects
        LivingRoom livingRoom = new LivingRoom();
        //Creating key (check and use methods can be tested)
        Key key1 = new Key(1, "This isn't a normal key", "Yellow Key");


        // Game logic
        while (running) {
            //UserInput
            String GivenData = UserInput.nextLine();

            //Processing commands
            UserInputHandler.Parse(GivenData);

            //Exitting if necessary
            if (GivenData.equalsIgnoreCase("exit")) {
                log.debug("Shutting Down!");
                running = false;
            }
        }

        System.out.println("Game shutting down");
    }
}