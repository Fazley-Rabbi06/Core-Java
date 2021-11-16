package CollectionFrameworks;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String,Integer> phoneBook = new HashMap<>(); Not Synchronized
        Map<String,Integer> phoneBook = new TreeMap<>(); //Sorted
//        Map<String,Integer> phoneBook = new LinkedHashMap<>(); Maintain Insertion Order
//        Map<String,Integer> phoneBook = new Hashtable<>(); Synchronized



        phoneBook.put("Rabbi",01234567);
        phoneBook.put("Taus",987653);
        phoneBook.put("Ayon",564563);
        phoneBook.put("Mouno",324567);
//        System.out.println(phoneBook.get("Rabbi"));
//        Set<String> obj = phoneBook.keySet();
//        obj.forEach(i-> System.out.println(phoneBook.get(i)));
        Set<Map.Entry<String,Integer>> values = phoneBook.entrySet();

        for (Map.Entry<String,Integer> value :values
             ) {
            System.out.println(value.getKey()+" "+value.getValue());
        }



    }
}
