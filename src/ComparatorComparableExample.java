import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//A temporary file until we can find a good opportunity to use this
public class ComparatorComparableExample {
    public static void main(String[] args) {
        //Filling a list with keys to compare
        List<Key> testingList = new ArrayList<>();
        testingList.add(new Key(1, "Just a normal looking yellow key", "Yellow Key"));
        testingList.add(new Key(2, "A very small key for a drawer", "Small Key"));
        testingList.add(new Key(3, "A key that has a handle that looks like a skull", "Skeleton Key"));
        testingList.add(new Key(4, "A simple brown key, could be rust or dirt", "Brown Key"));

        //Sorting based off the comparable (name)
        Collections.sort(testingList);

        //Printing results
        System.out.println("Comparable:");
        for (Key key : testingList) {
            System.out.println(key.getItemName() + ": " + key.Check());
        }

        //Adding space in between
        System.out.println();

        //Sorting based on a comparator in the key class (UnlockId)
        Collections.sort(testingList, Key.UnlockIdCompare);

        //Printing results
        System.out.println("Comparator:");
        for (Key key : testingList) {
            System.out.println(key.getItemName() + ": " + key.Check());
        }
    }
}
