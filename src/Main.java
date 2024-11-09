//Logging Stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    //Logger object
    final static Logger log = LogManager.getLogger(Main.class.getName());
    static Scanner UserInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Kevin's edit
        //Nothing of value but comments
        //Here to demonstrate a push
        try {
            //Parser
            NounVerbParser UserInputHandler = new NounVerbParser();

            //Variable to make sure loop quits
            boolean running = true;

            //Telling when its ready to go
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
            log.error("An Exception Has Occured...");
        }
        finally {
            UserInput.close();
        }
    }
}
