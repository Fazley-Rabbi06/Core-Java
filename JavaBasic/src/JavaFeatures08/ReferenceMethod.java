package JavaFeatures08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReferenceMethod {
    public static void main(String[] args) {
        List<Person> p = new ArrayList<>();
        p.add(new Person(12,"Rabbi"));
        p.add(new Person(16,"Kabbi"));
        p.add(new Person(10,"Labbi"));
        p.add(new Person(24,"Tabbi"));
        p.forEach(System.out::println);
        CompareValue c = new CompareValue();
        Collections.sort(p,c::comName);
//        System.out.println(p);
        System.out.println("After Sorting: ");
        p.stream().map(s->s.getName()).forEach(System.out::println);

        Comparator<Person> com1 = (o1,o2)->{
            if (o1.age > o2.age) return 1;
            return -1;
        };
        System.out.println("\nAfter sorting the age-");
        Collections.sort(p,com1);
        p.stream().map(i->i.getAge()).forEach(System.out::println);

//        new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        };

    }
}
class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
class CompareValue{
    public int comName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
}
