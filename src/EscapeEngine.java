//Logging Stuff
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class EscapeEngine {
     //Logger object
     /**final static Logger log = LogManager.getLogger(EscapeRoomGame.class.getName());
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
    }**/
     // Map to store rooms by their normalized (lowercase) names
     private Map<String, Room> rooms = new HashMap<>();

    // The player currently in the game
    private Player player;

    // Constructor initializes rooms and player
    public EscapeEngine() {
        initializeRooms(); // Initialize all rooms
        initializePlayer(); // Start the player in the starting room
    }

    /**
     * Initializes all the rooms in the game.
     * This includes setting up room descriptions, items, and connections.
     */
    private void initializeRooms() {
        // Create rooms
        Room diningRoom = new Room("Dining Room", "A room with a large table surrounded by chairs.");
        Room kitchen = new Room("Kitchen", "A functional kitchen with pots, pans, and ingredients.");
        Room bedroom = new Room("Bedroom", "A cozy bedroom with a bed, a wardrobe, and a nightstand.");
        Room closet = new Room("Closet", "A small room filled with hangers and coats.");
        Room bathroom = new Room("Bathroom", "A clean bathroom with a sink, toilet, and shower.");

        // Add items to rooms
        diningRoom.addItem("Candle");
        diningRoom.addItem("Plate");
        kitchen.addItem("Knife");
        kitchen.addItem("Pan");
        bedroom.addItem("Pillow");
        bedroom.addItem("Lamp");
        closet.addItem("Coat");
        closet.addItem("Shoes");
        bathroom.addItem("Towel");
        bathroom.addItem("Toothbrush");

        // room connections
        diningRoom.addConnectedRoom("kitchen");
        diningRoom.addConnectedRoom("bedroom");
        kitchen.addConnectedRoom("dining room");
        bedroom.addConnectedRoom("dining room");
        bedroom.addConnectedRoom("closet");
        bedroom.addConnectedRoom("bathroom");
        closet.addConnectedRoom("bedroom");
        bathroom.addConnectedRoom("bedroom");

        // Store rooms in the map using normalized keys
        rooms.put("dining room", diningRoom);
        rooms.put("kitchen", kitchen);
        rooms.put("bedroom", bedroom);
        rooms.put("closet", closet);
        rooms.put("bathroom", bathroom);
    }

    /**
     * Initializes the player in the starting room.
     * Sets up the player's starting location and prints initial details.
     */
    private void initializePlayer() {
        // Get starting room from the map
        Room startingRoom = rooms.get("dining room"); // Use normalized key
        if (startingRoom == null) {
            // Check if starting room exists
            throw new IllegalStateException("Starting room 'dining room' does not exist.");
        }
        // Initialize the player in the starting room
        player = new Player("Explorer", startingRoom);

        // Welcome message, room description
        System.out.println("Welcome, " + player.getName() + "! You are starting in the " + startingRoom.getName() + ".");
        System.out.println(startingRoom.getDescription());
    }

    /**
     * Moves the player to the specified room if it is connected to the current room.
     *
     * @param roomName The name of the room to move to.
     */
    public void moveToRoom(String roomName) {
        // Normalize the input room name to lowercase
        String normalizedRoomName = roomName.toLowerCase();

        // Find the current room and the room wanting to move to
        Room currentRoom = player.getCurrentRoom();
        Room targetRoom = rooms.get(normalizedRoomName);

        if (targetRoom == null) {
            // If room does not exist show an error
            System.out.println("That room doesn't exist.");
            return;
        }

        // Check if the room is connected to the current room
        if (currentRoom.getConnectedRooms().contains(normalizedRoomName)) {
            // Move the player to the target room
            player.setCurrentRoom(targetRoom);
            System.out.println("You moved to: " + targetRoom.getName());
            System.out.println(targetRoom.getDescription());
        } else {
            // If the room is not connected show error
            System.out.println("You can't move to " + roomName + " from here.");
        }
    }

    /**
     * Displays the player's current inventory.
     */
    public void showInventory() {
        // get players inventory
        List<String> inventory = player.getInventory();
        if (inventory.isEmpty()) {
            // Message if inventory is empty
            System.out.println("Your inventory is empty.");
        } else {
            // Print items in the inventory
            System.out.println("You have the following items: " + String.join(", ", inventory));
        }
    }

    /**
     * Takes an item from the current room and adds it to the player's inventory.
     *
     * @param itemName The name of the item to take.
     */
    public void takeItem(String itemName) {
        // Get the current room the player is in
        Room currentRoom = player.getCurrentRoom();

        if (currentRoom.getItems().contains(itemName)) {
            // If item exists in the room, remove it from the room and add to inventory
            currentRoom.removeItem(itemName);
            player.addToInventory(itemName);
            System.out.println("You took the " + itemName + ".");
        } else {
            // message if the item is not found
            System.out.println("There's no " + itemName + " in this room.");
        }
    }

    /**
     * Drops an item from the player's inventory into the current room.
     *
     * @param itemName The name of the item to drop.
     */
    public void dropItem(String itemName) {
        if (player.getInventory().contains(itemName)) {
            // Remove item from inventory and add to the room
            player.removeFromInventory(itemName);
            player.getCurrentRoom().addItem(itemName);
            System.out.println("You dropped the " + itemName + ".");
        } else {
            // Message if the item is not in inventory
            System.out.println("You don't have a " + itemName + " in your inventory.");
        }
    }

    /**
     * The main game loop to process player commands.
     * Processes commands such as 'move', 'take', 'drop', 'inventory', 'look', and 'exit'.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in); // scanner for user input
        boolean running = true;

        while (running) {
            // Prompt for user input
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase(); // Normalize input to lowercase
            String[] words = input.split(" ", 2); // Seperate input into command and argument
            String command = words[0]; // Extract command
            String argument = words.length > 1 ? words[1] : null;

            switch (command) {
                case "move":
                    if (argument != null) {
                        // move command
                        moveToRoom(argument);
                    } else {
                        System.out.println("Move where?");
                    }
                    break;

                case "take":
                    if (argument != null) {
                        // take command
                        takeItem(argument);
                    } else {
                        System.out.println("Take what?");
                    }
                    break;

                case "drop":
                    if (argument != null) {
                        // drop command
                        dropItem(argument);
                    } else {
                        System.out.println("Drop what?");
                    }
                    break;

                case "inventory":
                    // Display inventory
                    showInventory();
                    break;

                case "look":
                    // Display current room details
                    System.out.println(player.getCurrentRoom());
                    break;

                case "exit":
                    // Exit the game loop
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    // Handle unknown commands
                    System.out.println("Unknown command.");
            }
        }

        scanner.close(); // Close the scanner
    }
}