package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class PlayAround {
    public static void main(String[] args) {
        int n = 10;
        Set<String> set = new HashSet<>();
        IntStream.range(1,10).forEach( (x) -> set.add("abc" + String.valueOf(x)));
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        for(String x : set) {
            System.out.println(x);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list = Arrays.asList(new Integer[]{1,23,12});
        list.stream().forEach((x) -> pq.add(x));
//        for(int i=0; i< pq.size(); i++) { // wrong way as pq size changes dynamically.. when deleted an ele
//            System.out.println(pq.poll());
//        }

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
