package six;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        NavigableSet<String> navigable_set = new TreeSet<>();
        navigable_set.add("This");
        navigable_set.add("not");
        navigable_set.add("assignment");
        navigable_set.add("is");
        navigable_set.add("is");

        System.out.println("NavigableSet: " + navigable_set);

        NavigableMap<Integer, String> navigable_map =  new TreeMap<Integer, String>();
        navigable_map.put(3, "you");
        navigable_map.put(4, "doing");
        navigable_map.put(1, "why");
        navigable_map.put(5, "this");
        navigable_map.put(2, "are");

        System.out.printf("NavigableMap  : %s%n", navigable_map);
        System.out.printf("Reverse Map : %s%n", navigable_map.descendingMap());
    }
}
