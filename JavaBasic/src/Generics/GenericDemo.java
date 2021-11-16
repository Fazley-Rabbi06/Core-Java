package Generics;

import java.util.*;

public class GenericDemo<arr> {
    public static void main(String[] args) {
//        int[] value = new int[6];
//        value[0] = 1;
//        Object[] values = new Object[4];

//        Collection<Integer> value = new ArrayListDemo();
//        value.add(7);
//        value.add(9);
//        value.add(6);
//        value.add(3);

//        Iterator i = value.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        for (int x:value
//             ) {
//            System.out.println(x);
//        }
        List<Integer> value = new ArrayList<Integer>();
        value.add(75);
        value.add(69);
        value.add(677);
        value.add(35);;
        value.add(17);




//        value.forEach(System.out::println);

        for (int x:value
        ) {
            System.out.println(x);
        }


    }


}
