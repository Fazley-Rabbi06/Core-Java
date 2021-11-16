package JavaFeatures08;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        for (Integer i:arr
//             ) {
//            System.out.println(i);
//        }
        arr.forEach(i-> System.out.println(i));




    }
}
