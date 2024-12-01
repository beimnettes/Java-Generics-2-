import java.util.ArrayList;
import java.util.Collections;

public class GenericSortUtility {
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        Collections.sort(list);
    }
}
