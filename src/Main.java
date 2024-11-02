//Logging Stuff
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args)
    {
        //Logger object
        final Logger log = LogManager.getLogger(Main.class.getName());

        //Kevin's edit
        //Nothing of value but comments
        //Here to demonstrate a push

        try {
           log.debug("Hello World!");
        }
        catch (Exception ex) {
            System.out.println("An Exception Has Occured...");
        }
        finally {
            //Clear scanners and other things
        }
    }
}
