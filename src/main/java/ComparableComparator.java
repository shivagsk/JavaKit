import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.hash;

class Student implements Comparable<Student> {
    private String id;
    private int marks;

    public Student(String id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    private String name;
    public String id() {
        return id;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }

    public int marks() {
        return marks;
    }

    public Student setMarks(int marks) {
        this.marks = marks;
        return this;
    }

    public String name() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    @Override
    public int hashCode() {
        return hash(marks, name);
    }
    @Override
    public boolean equals(Object ob) {
        if(this == ob) return true;
        if(ob == null || this.getClass() != ob.getClass()) return false;
        Student temp = (Student) ob;
        return name.equals(temp.name) && marks == temp.marks && id.equals(temp.id);

    }
}

public class ComparableComparator {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        Student st1 = new Student("1", 80, "Shiva");
        Student st2 = new Student("2", 90, "Daku");
        Student st3 = new Student("1", 80, "Shiva");

        map.put(st1, "A");
        map.put(st2, "B");
        map.put(st3, "A");
        System.out.println(st1.hashCode() + " " + st3.hashCode());
        System.out.println(st1.equals(st3));
        System.out.println(map);



        //

//        List<Student> studentList = new ArrayList<>();
//        for(int i=4; i>=0; i--) {
//            studentList.add(new Student(String.valueOf(i), i+10, "abc"+String.valueOf(i)));
//        }
//        Collections.sort(studentList);
//        for(Student x: studentList){
//            System.out.println(x.toString());
//        }
//        Collections.sort(studentList, (s1,s2) -> {
//            return s2.marks() -s1.marks();
//        });
//
//        Collections.sort(studentList, Collections.reverseOrder());
//        Comparator<Student> ss = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        };
//        Collections.sort(studentList, ss.reversed());
//        System.out.println(studentList);
    }
}
