package CollectionFrameworks;

import java.util.Stack;

public class StackDemo<T> {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Rabbi");
        stack.push("Taus");
        stack.push("Arpon");
        stack.push("Ayon");
        System.out.println(stack);
//        stack.forEach(i-> System.out.println(i));
        stack.pop();
//        stack.forEach(System.out::println);
        System.out.println(stack.search( "Arponk"));
    }
}
