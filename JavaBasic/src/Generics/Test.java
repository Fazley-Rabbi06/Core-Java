package Generics;

public class Test {
    public static void main(String[] args) {
//        GernericClass<Integer> obj = new GernericClass<Integer>();
//        int s = obj.add(6);
//        System.out.println(s);
          GernericMethod obj = new GernericMethod();
          Integer[] intArr = {1,2,3,4,5};
          Character[] charArr = {'a','b','c','d'};
          obj.display(intArr);



    }
}
