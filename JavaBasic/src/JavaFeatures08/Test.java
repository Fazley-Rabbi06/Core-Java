package JavaFeatures08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,4);
//        Consumer<Integer> c = (i)-> System.out.println(i);
        list.stream().distinct().filter(i->i%2==0).forEach(i-> System.out.println(i));



    }
}
