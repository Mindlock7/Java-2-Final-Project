public interface ItemTemplate {
    //Properties for unlocking things (break a wall, unlock a door, etc.)
    Integer UnlockId = 0; //If ID is 0 it shouldn't unlock anything
    String UnlockText = "You put the key in the lock and twisted as it clicks open";
    String NoUnlockText = "You put the key into the lock but it doesn't budge, seems like this is the wrong key";
    String NotUnlockableText = "There doesn't appear to be a lock";

    //Methods
    public boolean Use();
}
