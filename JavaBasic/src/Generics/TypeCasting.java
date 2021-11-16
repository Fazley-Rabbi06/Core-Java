package Generics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TypeCasting {
    public static void main(String[] args) {
//        Befor Generic
//        List list = new ArrayListDemo();
//        list.add("hello");
//        String s = (String)list.get(0);
        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);


    }
}
