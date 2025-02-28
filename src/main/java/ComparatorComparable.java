import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
     int age;
     String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    public int compare(Student1 ob1, Student1 ob2) {
//        return ob1.age - ob2.age;
//    }

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparatorComparable {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(new Student1(10, "Shiva"),
                new Student1(24, "daku"));
        List<Student1> students1 = new ArrayList<>(Arrays.asList(new Student1(21, "Shiva"),
                new Student1(12, "daku")));
        List<Student1> students2 = List.of(new Student1(921, "Shiva"),
                new Student1(24, "daku"));
        students1.set(1, new Student1(100, "DAASS"));
        students1.add(new Student1(20, "sai"));

        System.out.println(students1);


        Comparator<Student1> ss =
            (Student1 o1, Student1 o2) -> {
                return o2.name.compareTo(o1.name);
            }
        ;
        Collections.sort(students1, ss);
        System.out.println(students1);
        Collections.sort(students1, ss.reversed());
        System.out.println(students1);
        Collections.sort(students1, (ob1, ob2) -> {
            return ob2.age - ob1.age;
        });
        System.out.println(students1);

    }
}
