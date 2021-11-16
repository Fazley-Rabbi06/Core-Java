package CollectionFrameworks;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo<T> {
    public static void main(String[] args) {
        Queue<Integer> obj = new PriorityQueue<>();
        obj.add(5);
        obj.add(7);
        obj.add(5);
        obj.add(3);
        System.out.println(obj.peek());
//        obj.poll();
//        System.out.println(obj);

    }
}
