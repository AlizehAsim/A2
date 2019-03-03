package one;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // creating an ArrayList
        ArrayList<Integer> my_array = new ArrayList<Integer>();

        // adding object to arraylist
        my_array.add(1);
        my_array.add(2);
        my_array.add(3);

        System.out.println("ArrayList Size: " + my_array.size());


        // traversing elements using Iterator'
        System.out.println("ArrayList Elements:");
        Iterator it = my_array.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // creating Vector
        Vector<Integer> my_vector = new Vector<Integer>();
        my_vector.addElement(9);
        my_vector.addElement(8);
        my_vector.addElement(7);

        System.out.println("Vector Size: " + my_vector.size());

        // traversing elements using Enumeration
        System.out.println("\nVector Elements:");
        Enumeration e = my_vector.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
