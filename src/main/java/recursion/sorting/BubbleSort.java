package recursion.sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(33,22,101,56,4,2,6,1,6);
        List<Integer> list1 = List.of(3,2,7,4,9); // returns an unmodifiable list collection

        // Recursive approach
        bubbleSortUsingRec(list);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(8,4,2,77,45,23,901);
        // Iterative approach
        bubbleSortUsingIter(list2);
        System.out.println(list2);

    }

    static void bubbleSortRec(List<Integer> list, int n, int ind) {
        if(n == 1)
            return ;
        if(ind < n-1) {
            if (list.get(ind) > list.get(ind+1)) {
                list.set(ind,  list.get(ind) ^ list.get(ind+1));
                list.set(ind+1, list.get(ind) ^ list.get(ind+1));
                list.set(ind, list.get(ind) ^ list.get(ind+1));
            }
            bubbleSortRec(list, n, ind+1);
        } else {
            bubbleSortRec(list, n-1, 0);
        }
    }
    static void bubbleSortUsingRec(List<Integer> list) {
        bubbleSortRec(list, list.size(), 0);
    }

    static void bubbleSortUsingIter(List<Integer> list) {
        for(int i=0; i<list.size()-1; i++) {
            for(int j=0; j<list.size()-i-1; j++) {
                if(list.get(j) > list.get(j+1)) {
                    list.set(j, list.get(j) ^ list.get(j+1));
                    list.set(j+1, list.get(j) ^ list.get(j+1));
                    list.set(j, list.get(j) ^ list.get(j+1));
                }
            }
        }
    }
}
