package streams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicPractise {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,8,5,3,4,8,99,23,453,675);

        System.out.println(list.stream().
                sorted().
                skip(1).
                limit(1).findFirst().get()); //.forEach(System.out::println);

        List<Integer> ll = Arrays.asList(1,2,3,4);
        System.out.println(ll.stream().filter(x -> x%2==1)
                .map(x -> x*x)
                        .reduce(0, (a,b) -> a+b));
        // forEach() uses Consumer FI - accept() SAM - No returnType
        list.forEach(x -> System.out.println(x));

        List<Integer> predicateList = list.stream().filter(x -> x>100).collect(Collectors.toList());
        System.out.println(predicateList + "  length: " + predicateList.size());

        Set<Integer> functionSet = list.stream().map(x -> x*2).collect(Collectors.toSet());
        System.out.println(functionSet + "  length: " + functionSet.size());

        // Comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        System.out.println(list.stream().max(comparator).get());
        int m = list.stream().max((x1,x2) -> {
            return x1-x2;
        }).get();
        System.out.println(m);

        System.out.println(list.stream().max(Integer::compareTo).get());
        System.out.println( "MAximum : " + Collections.max(list) + "  |Minimum : " +
        Collections.min(list));


        // sum of all Even numbers in list

        System.out.println("Sum of elements ::" + list.stream().filter(x -> (x&1)==0).reduce(0, (x1, x2) -> x1+x2));//collect(Collectors.toList());
        System.out.println(list.stream().filter(x->x%2==0).collect(Collectors.summingInt(Integer::intValue)));
        System.out.println(list.stream().filter(x->x%2==1).mapToInt(Integer::intValue).sum());

        // Strings starting with letter 'a'

        String[] names = {"shiva", "aabc", "agd", "udu", "strength"};

        System.out.println("Count of strings starting with A -> " + Arrays.asList(names).stream()
                .filter(x -> x.startsWith("st")).count());

    }
}
