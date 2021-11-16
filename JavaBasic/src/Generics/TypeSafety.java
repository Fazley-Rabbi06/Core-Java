package Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafety {
    public static void main(String[] args) {
//        Before Generic
//        List list = new ArrayListDemo();
//        list.add(6);
//        list.add("8");
//        System.out.println(list);
//        System.out.println(list.getClass());

        List<Integer>list = new ArrayList<>();
        list.add(7);
        list.add(6);
//        list.add("66");//Cause of generic here we can see this type of error

    }



}
