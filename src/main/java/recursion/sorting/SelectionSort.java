package recursion.sorting;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,1,9,7,5);

        // Recursive Approach
        selectionSortUsingRec(list);
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(7,6,25,65,5,4,3,1);

        // Iterative Approach
        selectionSortUsingIter(list1);
        System.out.println(list1);

    }

    static void selectionSortRec(List<Integer> list, int n, int ind, int maxInd) {
        if(n == 1)
            return ;
        if(ind < n) {
            if(list.get(ind) > list.get(maxInd)) {
                maxInd = ind;
            }
            selectionSortRec(list, n, ind+1, maxInd);
        } else {
            if(ind-1 != maxInd) {
                list.set(ind - 1, list.get(ind - 1) ^ list.get(maxInd));
                list.set(maxInd, list.get(ind - 1) ^ list.get(maxInd));
                list.set(ind - 1, list.get(ind - 1) ^ list.get(maxInd));
            }
            selectionSortRec(list, n-1, 0, 0);
        }
    }
    static void selectionSortUsingRec(List<Integer> list) {
        selectionSortRec(list, list.size(), 0, 0);
    }

    static void selectionSortUsingIter(List<Integer> list) {
        for(int i=0; i<list.size(); i++) {
            int maxInd = 0;
            for(int j=0; j<list.size()-i; j++) {
                if(list.get(j) > list.get(maxInd)) {
                    maxInd = j;
                }
            }
            int j = list.size()-1-i;
            if (maxInd != j) {
                list.set(j, list.get(j) ^ list.get(maxInd));
                list.set(maxInd, list.get(j) ^ list.get(maxInd));
                list.set(j, list.get(j) ^ list.get(maxInd));
            }
        }
    }
}
