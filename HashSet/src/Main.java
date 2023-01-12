import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // HashSet only add unique

        // Search
        System.out.println(set.contains(1));

        //Delete
        set.remove(1);
        System.out.println(set.contains(1));
        set.add(1);

        //print
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}