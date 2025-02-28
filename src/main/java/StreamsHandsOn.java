import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{//} implements Comparable<Employee>{
    private String name;
    private int age;
    private double salary;

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public double salary() {
        return salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    public int compareTo(Employee e) {
//        return this.name.compareTo(e.name);
//    }

    @Override
    public String toString() {
        return name + "  " + age + "  " + salary;
    }
}
public class StreamsHandsOn {
    public static void main(String[] args) {
        List<String> in = List.of("Shiva", "Sai", "Vinay");
        List<List<Employee>> employees = Arrays.asList(Arrays.asList(new Employee("Vinay", 30, 35),
                new Employee("Shiva", 22, 10)),
                Arrays.asList(new Employee("Vinay2", 30, 35),
                        new Employee("Shiva2", 22, 10)),
                Arrays.asList(new Employee("Vinay3", 30, 35),
                        new Employee("Shiva3", 22, 10)));
        employees.stream().flatMap(list ->
            list.stream()).sorted((Employee e1, Employee e2) ->
            e2.name().compareTo(e1.name())
        ).forEach(System.out::println);
        //employees.stream().flatMap()

//        employees.stream()
//                .flatMap(list -> list.stream()) // Flatten List<List<Employee>> to Stream<Employee>
//                .sorted((e1, e2) -> e1.name.compareTo(e2.name)) // Custom comparator
//                .forEach(System.out::println);

    }
}
