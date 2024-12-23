package sortings;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // 1 4 3 8 5 9 3 2
        for(int i=1; i<n; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
        for(int x:arr) {
            System.out.print(x +" ");
        }
    }
}
