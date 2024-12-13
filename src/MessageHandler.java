import java.time.LocalTime;
import java.util.Locale;

/**
 * Handles game messages such as introductions and greetings based on locale and time.
 * This is an immutable object.
 */
public final class MessageHandler {

    // Holds the introductory message for the game
    private final String introMessage;

    /**
     * Constructor that initializes the `MessageHandler` with the player's locale and time.
     * It automatically generates the introductory message when an instance is created.
     *
     * @param locale    the player's locale (e.g., Spanish or English)
     * @param localTime the current local time (used for time-based greetings)
     */
    public MessageHandler(Locale locale, LocalTime localTime) {
        // Builds the introductory message based on the provided locale and time
        this.introMessage = buildIntroMessage(locale, localTime);
    }

    /**
     * Retrieves the game's introductory message.
     * This message can be shown to the player at the start of the game.
     *
     * @return the intro message
     */
    public String getIntroMessage() {
        return introMessage;
    }

    /**
     * Constructs the game's introductory message based on the player's locale and time of day.
     *
     * @param locale    the player's locale (determines language: Spanish or English)
     * @param localTime the current local time (used for generating greetings like "Good Morning")
     * @return the complete introductory message
     */
    private String buildIntroMessage(Locale locale, LocalTime localTime) {

        // Gets the language code ("en" for English, "es" for Spanish) from the locale
        String language = locale.getLanguage();
        String message;

        // Constructs the message in Spanish if the locale is "es" (Spanish)
        if (language.equals("es")) {
            message = "Bienvenido a la aventura de Escape Room. \n"
                    + getTimeOfDayGreeting(locale, localTime)
                    + "Explora las habitaciones, resuelve acertijos y encuentra tu camino para escapar.\n"
                    + "¡Buena suerte!";
        } else {
            // Constructs the message in English if the locale is anything other than "es"
            message = "Welcome to the Escape Room adventure. \n" //Here we add our introductory message to the game.
                    + getTimeOfDayGreeting(locale, localTime)   // Adds a greeting based on the time
                    + "Explore the rooms, solve puzzles, and find your way to escape.\n"; //Can Obvi change, just a start.
        }

        return message; // Returns the introductory message
    }

    // Introductory lore to the game to help users get started
    public String getGameIntro(){
        String message;
        message = "As you  come to, a feeling of soreness encapsulates your body. Your eyes flutter\n" +
                "open,  seeing the cool wooden  floor  you’ve   been  laid down  upon.  You don’t\n" +
                "remember  much,  other than  going  out last night to meet  friends before being\n" +
                "stopped  on the way by a  hooded man,  asking   if  you wanted  to  play a game.\n" +
                "Attempting to ignore him, you shrugged it off and tried to continue walking down\n" +
                "the street, but a sharp pain  greets your neck, and before you  can process what\n" +
                "even  happened,  your world started  to go blurry. Now you’re here, laying on an\n" +
                "unknown floor. You sit up and begin to look around.\n" +
                "\n" +
                "You appear to be in a living room. The room is warmly illuminated by a fireplace\n" +
                "set in  the corner, crackling away with   small  pops as the  wood inside burns.\n" +
                "Glancing  around, you see a brown leather couch with  a small glass coffee table\n" +
                "in  front of  it, a  decorative  pot  filled with small cactus on  top  of it. A\n" +
                "bearskin rug sits in front of that,  serving   as a centerpiece for  the room. A\n" +
                "grandfather clock softly clicks against the wall next to an opened door, showing\n" +
                "a  dining area in the next room over. You notice  the windows  next to the front\n" +
                "door are boarded up tight with   strong boards, and no light  is shining through\n" +
                "the cracks, suggesting it's  night outside of the house. Against another wall is\n" +
                "a  bookshelf,  with regular wall shelving on  each  side of it. The bookshelf is\n" +
                "full  of books, and the  shelves are  lined  with trinkets  and  picture frames.\n" +
                "Besides the bookshelf is a door, leading to what appears to be a master bedroom.\n" +
                "\n" +
                "Use 'HELP' for a list of commands.\n";
        return message;
    }

    /**
     * Generates a greeting based on the time of day and the player's locale.
     * For example:
     * - "Good Morning" if it's before noon in English
     * - "¡Buenos días!" if it's before noon in Spanish
     *
     * @param locale    the player's locale (determines language: Spanish or English)
     * @param localTime the current local time (determines the time-based greeting)
     * @return the greeting message
     */
    private String getTimeOfDayGreeting(Locale locale, LocalTime localTime) {
        String greeting;

        // Check if the language is Spanish
        if (locale.getLanguage().equals("es")) {
            if (localTime.isBefore(LocalTime.of(6, 0))) {
                greeting = "¡Buena madrugada! ";
            } else if (localTime.isBefore(LocalTime.of(12, 0))) {
                greeting = "¡Buenos días! ";
            } else if (localTime.isBefore(LocalTime.of(18, 0))) {
                greeting = "¡Buenas tardes! ";
            } else {
                greeting = "¡Buenas noches! ";
            }
        } else {
            // Default to English for any other language
            if (localTime.isBefore(LocalTime.of(6, 0))) {
                greeting = "Good early morning! ";
            } else if (localTime.isBefore(LocalTime.of(12, 0))) {
                greeting = "Good morning! ";
            } else if (localTime.isBefore(LocalTime.of(18, 0))) {
                greeting = "Good afternoon! ";
            } else {
                greeting = "Good evening! ";
            }
        }

        return greeting; // Returns the appropriate greeting
    }
}
