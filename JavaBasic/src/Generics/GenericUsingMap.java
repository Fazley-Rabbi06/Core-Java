package Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericUsingMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Rabbi");
        map.put(2,"Rashed");
        map.put(3,"x");

        Set<Map.Entry<Integer,String>>set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry e= itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
