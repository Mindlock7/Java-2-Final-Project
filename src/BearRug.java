import java.awt.desktop.SystemEventListener;
import java.util.HashMap;
import java.util.Map;

public class BearRug implements InteractableTemplate {
    private String Description = "A bearskin rug with something shiny in its mouth";

    //If the key of the map is -1, then using no item gives it, otherwise you need a certain item to find it
    private Map<Integer, Items> ItemsInInteractable = new HashMap<>();

    public BearRug() {
        ItemsInInteractable.put(-1, new Key(1, "This isn't a normal key", "Yellow Key"));
    }

    public Items Search(Key key) {
        Items FoundItem = null;

        if (key == null) {
            FoundItem = ItemsInInteractable.get(-1);
            ItemsInInteractable.remove(-1);
        } else {
            FoundItem = ItemsInInteractable.get(key.getUnlockId());
            ItemsInInteractable.remove(key.getUnlockId());
        }

        return FoundItem;
    }

    public String InteractableDescription() {
        return Description;
    }
}
