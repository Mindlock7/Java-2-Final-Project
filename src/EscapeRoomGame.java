//Logging Stuff
//import org.apache.logging.log4j.LogManager;
//import java.util.Scanner;
import java.time.LocalTime;
import java.util.Locale;

//import org.apache.logging.log4j.Logger;

public class EscapeRoomGame {
    /**
    //Logger object
    final static Logger log = LogManager.getLogger(EscapeRoomGame.class.getName());
    static Scanner UserInput = new Scanner(System.in);
     **/

    public static void main(String[] args)
    {
        // Initialize the Timer
        Timer timer = Timer.getInstance();

        // Set locale and time for MessageHandler
        Locale locale = Locale.getDefault();
        LocalTime localTime = LocalTime.now();

        // Generate and display the introductory message using MessageHandler
        MessageHandler messageHandler = new MessageHandler(locale, localTime);
        System.out.println(messageHandler.getIntroMessage());
        System.out.println(messageHandler.getGameIntro());

        // Initialize EscapeEngine to run the game logic
        EscapeEngine engine = new EscapeEngine();

        // Run the game logic
        engine.run();

        // Display elapsed time when the game ends
        long elapsedTime = timer.getElapsedTime();
        System.out.println("Elapsed Time: " + elapsedTime + " seconds");

        // Commented out for now for testing purposes
        /**
        //Kevin's edit
        //Nothing of value but comments
        //Here to demonstrate a push
        try {
            //Parser
            NounVerbParser UserInputHandler = new NounVerbParser();

            //Variable to make sure loop quits
            boolean running = true;

            //Telling when it's ready to go
            log.debug("Starting Up!");

            //Game loop
            while (running) {
                //UserInput
                String GivenData = UserInput.nextLine();

                UserInputHandler.Parse(GivenData);

                if (GivenData.equalsIgnoreCase("exit")) {
                    log.debug("Shutting Down!");
                    running = false;
                }
            }
        }
        catch (Exception ex) {
            log.error("An Exception Has Occurred...");
        }
        finally {
            UserInput.close();
            System.out.println("Hello world!!!!!");
            log.debug("Hello World!");

        }
        **/
    }
}
