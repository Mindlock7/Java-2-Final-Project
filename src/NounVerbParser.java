public class NounVerbParser {

    //Method for splitting the data and checking its result
    public void Parse(String data) {
        String[] DataSplit = data.split(" ");

        if (DataSplit[0].equalsIgnoreCase("move")) {
            System.out.println("Moving to " + DataSplit[1] + ".");
        }
    }
}
