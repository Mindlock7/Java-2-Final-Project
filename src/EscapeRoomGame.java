// Time Stuff
import java.time.LocalTime;
import java.util.Locale;

public class EscapeRoomGame {

    public static void main(String[] args) {
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
        String elapsedTime = timer.getElapsedTime(); // Updated to use the new Timer method
        System.out.println("Elapsed Time: " + elapsedTime);
    }
}
