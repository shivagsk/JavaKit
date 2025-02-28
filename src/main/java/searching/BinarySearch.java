package searching;

import sortings.BubbleSortIterative;

public class BinarySearch {
    public static int rotatedBinarySearch(int[] arr, int key) {
        int left = 0, right = arr.length -1;
        int mid;
        while(left <= right) {
            mid = (right-left)/2 + left;
            System.out.println(left + " " + mid + " " + right);
            if(arr[mid] == key) {
                return mid;
            } else if(arr[left] > arr[right]) {
                if(key >= arr[left] && key <= arr[mid]) {
                    right = mid -1;
                } else {
                    left = mid +1;
                }
            } else {
                if(arr[mid] < key) {
                    left = mid +1;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;

    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length -1;
        int mid;
        while(left <= right) {
            mid = (right-left)/2 + left;
            System.out.println(left + " l - r" + right);
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,8,9};
        //System.out.println(binarySearch(arr, 5));
        //System.out.println(binarySearch(arr, 4));



        int[] nums = new int[]{5,6,7,1,2,3};
        for(int x: nums) {

            System.out.println(x + " in position : " + rotatedBinarySearch(nums, x));
        }

        System.out.println(" in position : " + rotatedBinarySearch(nums, 9));
        /*int[] arr = new int[]{4, 2, 6, 1, 8, 12, 78, 32, 87};
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
    */
    }


}
