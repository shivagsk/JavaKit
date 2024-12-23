package sortings;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,7,5,8,1,9);
        int n = list.size();

        for(int i=0; i<n; i++) {
            int minInd = i;
            for(int j=i; j<n; j++) {
                if(list.get(minInd) > list.get(j)) {
                    minInd = j;
                }
            }
            swap(list, minInd, i);
        }

        for(int x : list) {
            System.out.print(x + " ");
        }
    }
}
