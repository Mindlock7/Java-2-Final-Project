public class Key {
    //General Item Properties
    Boolean MultipleUses = false; //Incase you want this to break multiple walls or open many locks

    //Unlocking ID for making sure it only unlocks one kind of lock
    Integer UnlockId = 0;
    //When it can unlock/break something
    String UnlockText = "You put the key in the lock and twisted as it clicks open";
    //When it's unlockable but not the right ID
    String NoUnlockText = "You put the key into the lock but it doesn't budge, seems like this is the wrong key";
    //When it's not unlockable at all
    String NotUnlockableText = "There doesn't appear to be a lock";

    //Just UnlockID key creation
    public Key(Integer unlockId) {
        UnlockId = unlockId;
    }

    public Key(Integer unlockId, Boolean multipleUses) {
        UnlockId = unlockId;
        MultipleUses = multipleUses;
    }

    //Everything key creation
    public Key(Integer unlockId, String unlockText, String noUnlockText, String notUnlockableText) {
        UnlockId = unlockId;
        UnlockText = unlockText;
        NoUnlockText = noUnlockText;
        NotUnlockableText = notUnlockableText;
    }

    public Key(Integer unlockId, String unlockText, String noUnlockText, String notUnlockableText, Boolean multipleUses) {
        UnlockId = unlockId;
        UnlockText = unlockText;
        NoUnlockText = noUnlockText;
        NotUnlockableText = notUnlockableText;
        MultipleUses = multipleUses;
    }


    //Methods
    public boolean Use() {

        return true;
    }
}
