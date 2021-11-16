package JavaFeatures08;

import java.util.List;
import java.util.Map;

public class FactoryMethodsDemo {
     public static void main(String[] args) {
//      List<Integer> obj = List.of(1,2,3,4,5,6);
//        obj.forEach(System.out::println);

        Map<String,Integer> obj = Map.of("n",7,"l",9,"j",2);
        obj.forEach((i,j)-> System.out.println(i+" "+j));


    }
}
