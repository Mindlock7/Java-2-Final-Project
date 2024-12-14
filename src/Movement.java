import java.util.Objects;

public class Movement {

    // Method that attempts to interpret noun to move player
    public String attemptMove(String noun, String location) {
        switch (noun) {

            // If player typed 'livingroom' without a space
            case "livingroom":
                // Determines if player is already in requested room
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                // If not, then they move to said room
                else{
                    LivingRoom lr = new LivingRoom();
                    lr.roomDescription();
                    location = "livingroom";
                    return location;
                }

            // If player typed 'living room' with a space (even though
            // they're advised not to).
            case "living":
                if (Objects.equals(location, "livingroom")){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    LivingRoom lr = new LivingRoom();
                    lr.roomDescription();
                    location = "livingroom";
                    return location;
                }

            // Living room comments apply to all below cases
            // Just swap living room name to currently applied room
            case "diningroom":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    DiningRoom dr = new DiningRoom();
                    dr.roomDescription();
                    location = "diningroom";
                    return location;
                }

            case "dining":
                if (Objects.equals(location, "diningroom")){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    DiningRoom dr = new DiningRoom();
                    dr.roomDescription();
                    location = "diningroom";
                    return location;
                }

            case "kitchen":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    Kitchen k = new Kitchen();
                    k.roomDescription();
                    location = "kitchen";
                    return location;
                }

            case "closet":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    Closet c = new Closet();
                    c.roomDescription();
                    location = "closet";
                    return location;
                }

            case "bathroom":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    Bathroom b = new Bathroom();
                    b.roomDescription();
                    location = "bathroom";
                    return location;
                }

            case "masterbedroom":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    MasterBedroom mb = new MasterBedroom();
                    mb.roomDescription();
                    location = "masterbedroom";
                    return location;
                }

            case "masterbedroombathroom":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    MasterBedroomBathroom mbb = new MasterBedroomBathroom();
                    mbb.roomDescription();
                    location = "masterbedroombathroom";
                    return location;
                }

            case "basement":
                if (Objects.equals(location, noun)){
                    System.out.println("You are already in this room.");
                    return location;
                }
                else{
                    Basement b = new Basement();
                    // DOESNT WORK YET
                    // Would ensure player has key and flashlight
                    // Will create customized messages once item/inv system is refined
                    if (b.isLocked() == true && b.isDark() == true){
                        b.roomDescription();
                        location = "basement";
                        return location;
                    }
                    else{
                        return location;
                    }
                }

            default:
                System.out.println("Cannot determine where you would like to go.\n" +
                        "When typing a room, merge the words together.\n" +
                        "(Ex: 'masterbedroom', 'masterbedroombathroom').\n");
                return location;

        }
    }
}
