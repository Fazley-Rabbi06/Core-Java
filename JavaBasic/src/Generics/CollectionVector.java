package Generics;

import java.util.ArrayList;
import java.util.Vector;

public class CollectionVector {

    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
//        Demo v = new Demo();
        v.add(3);
        v.add(5);
        v.add(99);
        v.add(3);
        v.add(5);
        v.add(99);
        v.add(3);
        v.add(5);
        v.add(99);
        v.add(3);
        v.add(5);
        v.add(99);
        System.out.println(v.size());
    }
}
