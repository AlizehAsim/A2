package four;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[4];
        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 3;

        System.out.println("Array Size: " + arr.length);
        int i = 0;
        while (i < 4)
        {
            System.out.println(array[i] + "\t");
            i++;
        }

        List<Integer> list = new LinkedList<Integer>();
        list.add(111);
        list.add(2);
        list.add(33);
        list.add(33);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Last Index:" + list.lastIndexOf(2));
    }
}
