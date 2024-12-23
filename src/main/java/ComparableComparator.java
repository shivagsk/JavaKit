import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
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
}

public class ComparableComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        for(int i=4; i>=0; i--) {
            studentList.add(new Student(String.valueOf(i), i+10, "abc"+String.valueOf(i)));
        }
        Collections.sort(studentList);
        for(Student x: studentList){
            System.out.println(x.toString());
        }
        Collections.sort(studentList, (s1,s2) -> {
            return s2.marks() -s1.marks();
        });
        System.out.println(studentList);
    }
}
