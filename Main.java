import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Test Pair
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println(pair);
        pair.setValue(30);
        System.out.println("Updated Pair: " + pair);

        // Test Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());

        // Test Generic Sort Utility
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        GenericSortUtility.sort(names);
        System.out.println("Sorted Names: " + names);

        // Test Wildcard Utility
        WildcardUtility.printCollection(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Sum of Numbers: " + WildcardUtility.sumOfNumberList(numbers));

        // Test Cache
        Cache<String> cache = new Cache<>();
        cache.add("user1", "Alice");
        cache.add("user2", "Bob");
        System.out.println("Retrieved User1: " + cache.get("user1"));
        cache.clear();
        System.out.println("Cache Cleared. Retrieved User1: " + cache.get("user1"));
    }
}
