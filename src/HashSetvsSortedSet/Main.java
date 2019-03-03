package two;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashSet<String> hash_set = new HashSet<String>();
        // Adding elements into HashSet usind add()
        hash_set.add("LQ");
        hash_set.add("KK");
        hash_set.add("QG");
        hash_set.add("LQ");

        // Displaying the HashSet Unordered
        System.out.println("HashSet: " + hash_set);
        hash_set.remove("KK");
        System.out.println("HashSet: " + hash_set);

        SortedSet set = new TreeSet();
        //add elements to the set
        set.add(45);
        set.add(45);
        set.add(9);
        set.add(58);
        set.add(0);
        System.out.println("SortedSet: " + set);
    }
}
