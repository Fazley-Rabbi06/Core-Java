package CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> obj = new ArrayDeque<>();
        obj.add(9);
        obj.add(8);
        obj.add(8);
        obj.add(2);
        obj.add(5);
//      obj.forEach(i-> System.out.println(i));
        System.out.println(obj);
        System.out.println(obj.peek());
        obj.addFirst(2);
        System.out.println(obj);
        obj.addLast(8);
        System.out.println(obj);
        obj.remove();
        System.out.println(obj);
        obj.removeLast();
        System.out.println(obj);

    }

}
