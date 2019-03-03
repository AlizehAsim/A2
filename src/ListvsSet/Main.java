package five;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Set<String> set = new HashSet<String>();
        // Adding elements into HashSet usind add()
        set.add("LQ");
        set.add("KK");
        set.add("QG");
        set.add("LQ");

        // Displaying the HashSet Unordered
        System.out.println("HashSet: " + set);
        set.remove("KK");
        System.out.println("HashSet: " + set);

        List<Integer> list = new LinkedList<Integer>();
        list.add(111);
        list.add(2);
        list.add(33);
        list.add(33);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");
        }
    }
}
