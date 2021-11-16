package CollectionFrameworks;

import java.util.*;

public class HashSetDemo{
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
//        Set<String> hs = new LinkedHashSet<>();
//        Set<Integer> hs = new TreeSet<>();
        hs.add(5);
        hs.add(8);
        hs.add(9);
        hs.add(2);
        hs.add(7);
        Iterator<Integer>ob = hs.iterator();
        while (ob.hasNext()){
            System.out.println(ob.next()+" ");
        }

    }
}
