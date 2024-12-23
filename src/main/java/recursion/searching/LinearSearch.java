package recursion.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinearSearch {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,6,2,8,9,12,2);
        int key = 2;

        // Recursive approach
        System.out.println("Recursive Approach :: " + linerSearch(list, key));
        System.out.println(keyMatchInd(list, key, 0, list.size(), new ArrayList<>()));

        // Iterative approach
        System.out.println("Iterative Approach :: " + (list.stream().filter( x -> x==key).collect(Collectors.toList()).size() > 0));
    }

    static boolean helper(List<Integer> list, int key, int ind, int n) {
        if(ind == n)
            return false;
        if(list.get(ind) == key)
            return true;
        return helper(list, key, ind+1, n);
    }

    // Keeping the indices of matching ele in List and returning list
    static List<Integer> keyMatchInd(List<Integer> list, int key, int ind, int n, List<Integer> res) {
        if(ind == n)
            return res;
        if(list.get(ind) == key)
            res.add(ind);
        return keyMatchInd(list, key, ind+1, n, res);
    }
    static boolean linerSearch(List<Integer> list, int key) {
        int n = list.size();
        return helper(list, key, 0, n);
    }
}
