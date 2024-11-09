//Logging Stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Logger;

public class Main {
    //Logger object
    final static Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args)
    {
        //Kevin's edit
        //Nothing of value but comments
        //Here to demonstrate a push
        try {
            System.out.println("Hello world!!!!!");
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
