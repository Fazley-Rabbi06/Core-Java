package Generics;

import java.util.ArrayList;

public class Container<T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public void display(){
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? extends T> arr){

    }

    public static void main(String[] args) {
        Container<Integer> obj = new Container<>();
        obj.demo(new ArrayList<Integer>(7));
    }
}
