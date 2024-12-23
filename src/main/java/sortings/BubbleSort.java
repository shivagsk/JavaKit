package sortings;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;


public class BubbleSort {
    static void foo(int n) {
        System.out.print(n%10);
        if (n%10 != 0)
            foo(n/10);
        System.out.print(n%10);
    }
    public static void main(String[] args) {

        foo(1234);
        System.out.println();
        List<Integer> list = Arrays.asList(7,3,8,1,4,2,6);
        int n = list.size();

        for(int i=0; i<n; i++) {
            for(int j=0;j<n-1-i;j++) {
                if(list.get(j) > list.get(j+1)) {
                    swap(list, j, j+1);
                }
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
