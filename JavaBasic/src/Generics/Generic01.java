package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//Here we are defining specific type
//        list.add(9); compile time  checking
        list.add("hello");
        list.add("hi");
        String s = list.get(1);//we don't need types casting here
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

}}
