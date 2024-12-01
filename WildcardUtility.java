import java.util.Collection;
import java.util.List;

public class WildcardUtility {
    public static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }

    public static double sumOfNumberList(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
