package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameFrequencyMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rahim", "Seven", 22));
        students.add(new Student(2, "Karim", "five", 44));
        students.add(new Student(3, "Karim", "one", 33));
        students.add(new Student(4, "Karim", "ten", 38));

        Map<String, Integer> map = new HashMap<>();

        for (Student s : students) {
            if (map.containsKey(s.getName()))
                map.put(s.getName(), map.get(s.getName()) + 1);

            else
                map.put(s.getName(), 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Name : "+entry.getKey() + ", Frequency : "+ entry.getValue());
        }
    }
}
