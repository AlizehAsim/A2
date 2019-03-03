package three;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("LQ");
        hash_set.add("KK");
        hash_set.add("QG");
        hash_set.add("LQ");
        hash_set.add(null);

        System.out.println("HashSet: " + hash_set);
        hash_set.remove("KK");
        System.out.println("HashSet After Removal: " + hash_set);

        TreeSet<String> treeset = new TreeSet<String>();

        treeset.add("FCB");
        treeset.add("RMA");
        treeset.add("ATM");
        treeset.add("FCB"); //didn't add it bcs Set
        //treeset.add(null); //gave error

        System.out.println("TreeSet: " + treeset);
    }
}
