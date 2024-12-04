import java.util.Comparator;

public class Key implements Comparable<Key> {
    //General Item Properties
    private Boolean MultipleUses = false; //Incase you want this to break multiple walls or open many locks

    //Unlocking ID for making sure it only unlocks one kind of lock
    private Integer UnlockId;
    //When it can unlock/break something
    private String UnlockText = "You put the key in the lock and twist as it clicks open";
    //When it's unlockable but not the right ID
    private String NoUnlockText = "You put the key into the lock but it doesn't budge, seems like this is the wrong key";
    //When it's not unlockable at all
    private String NotUnlockableText = "There doesn't appear to be a lock";

    //Desciption of the item
    private String Description;

    //Name to show in inventory
    private String ItemName = "Random Key";

    //UnlockID and description key creation
    public Key(Integer unlockId, String description, String itemName) {
        UnlockId = unlockId;
        Description = description;
        ItemName = itemName;
    }

    public Key(Integer unlockId, String description, String itemName, Boolean multipleUses) {
        UnlockId = unlockId;
        Description = description;
        ItemName = itemName;
        MultipleUses = multipleUses;
    }

    //Everything key creation
    public Key(Integer unlockId, String description, String itemName, String unlockText, String noUnlockText, String notUnlockableText) {
        UnlockId = unlockId;
        Description = description;
        ItemName = itemName;
        UnlockText = unlockText;
        NoUnlockText = noUnlockText;
        NotUnlockableText = notUnlockableText;
    }

    public Key(Integer unlockId, String description, String itemName, String unlockText, String noUnlockText, String notUnlockableText, Boolean multipleUses) {
        UnlockId = unlockId;
        Description = description;
        ItemName = itemName;
        UnlockText = unlockText;
        NoUnlockText = noUnlockText;
        NotUnlockableText = notUnlockableText;
        MultipleUses = multipleUses;
    }


    //ItemName Methods
    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemName() {
        return ItemName;
    }

    //UnlockId Methods
    public void setUnlockId(Integer unlockId) {
        UnlockId = unlockId;
    }

    public Integer getUnlockId() {
        return UnlockId;
    }


    //Other Methods
    public String Check() {
        return Description;
    }

    public boolean Use() {
        //logic here (for checking if the thing the player is looking or using the key on can be unlocked, and whether
        //it matches the rest of the UnlockID
        System.out.println(UnlockText);
        return true;
    }

    @Override
    public int compareTo(Key k) {
        return this.ItemName.compareTo(k.getItemName());
    }

    public static Comparator<Key> UnlockIdCompare = new Comparator<Key>() {

        @Override
        public int compare(Key k1, Key k2) {
            return k1.getUnlockId() - k2.getUnlockId();
        }
    };
}
