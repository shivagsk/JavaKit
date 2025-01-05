package searching;

import sortings.BubbleSortIterative;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 6, 1, 8, 12, 78, 32, 87};
        int key=1;

        BubbleSortIterative.bubble(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        int l = 0, r = arr.length;
        boolean flag = false;

        while(l <=  r) {
            int mid = (r-l)/2 + l;
            if(arr[mid] == key) {
                flag = true;
                break;
            } else if(arr[mid] > key) {
                r = mid -1;
            } else {
                l = mid +1;
            }
        }
        System.out.println("Element found ? " + flag);
    }

}
