package recursion.searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,7,11,23,89);
        int key = 11;

        // Recursive approach
        System.out.println("Recursive approach :: " + _binarySearch(list, key));

        // Recursive for rotateBinarySearch
        System.out.println(rotateBinarySearch(list, 0, list.size(), key));

        // Iterative approach
        boolean flag = false;
        int start = 0, end = list.size()-1;
        int mid = -1;
        while(start<=end) {
            mid = start + (end-start)/2;
            if(list.get(mid) == key) {
                flag = true;
                break;
            } else if(list.get(mid) > key) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        if(flag)
            System.out.println(" Iterative approach | Element found at index :" + mid);
        else System.out.println("Not Found");
    }

    static boolean helper(List<Integer> list, int key, int start, int end) {
        if(start > end) {
            return false;
        }
        int mid = (end-start)/2 + start;
        if(list.get(mid) == key)
            return true;
        return  list.get(mid) > key ? helper(list, key, start, mid-1) : helper(list, key, mid+1, end);
    }

    static boolean _binarySearch(List<Integer> list, int key) {
        int n =list.size();
        return helper(list, key, 0, n-1);
    }

    static boolean rotateBinarySearch(List<Integer> list, int start, int end, int key) {

        if(start > end)
            return false;
        int mid = start + (end-start)/2;
        if(list.get(mid) == key)
            return true;
        if(list.get(mid) >= list.get(start)) {
            if(key >= list.get(start) && key <= list.get(mid)) {
                return rotateBinarySearch(list, start, mid-1, key);
            }
            return rotateBinarySearch(list, mid+1, end, key);
        }
        if (key >= list.get(mid) && key <= list.get(end)) {
            return rotateBinarySearch(list, mid+1, end, key);
        }
        return rotateBinarySearch(list, start, mid-1, key);

    }
}
