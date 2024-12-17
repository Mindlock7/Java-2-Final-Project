public class Item {

    // Sets up variables to be used to describe item
    private String name;
    private String description;


    // Constructor of an item
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Returns name (since it's a private variable, can't be accessed otherwise)
    public String getName() {
        return name;
    }

    // Returns description (since it's a private variable, can't be accessed otherwise)
    public String getDescription() {
        return description;
    }

    // Overriding toString so it can describe the item in a meaningful manner
    @Override
    public String toString() {
        return name + ": " + description;
    }
}
