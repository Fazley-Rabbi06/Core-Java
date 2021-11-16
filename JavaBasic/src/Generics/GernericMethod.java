package Generics;

public class GernericMethod {
    public <E> void display(E[] element){
        for (E elements: element) {
            System.out.println(elements);
        }
    }
}
