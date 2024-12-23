package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleSum {
    static List<List<Integer>> result = new ArrayList<>();
    static void triangleSum(List<Integer> arr) {
        if(arr.size() < 1)
            return;
//        if(arr.size() - 1 == ind) {
//            result.add(temp);
//            return ;
////            List<Integer> newList = new ArrayList<>();
//        }

        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.size() - 1; i++) {
            temp.add(arr.get(i) + arr.get(i+1));
        }

        triangleSum(temp);
        result.add(arr);
        //triangleSum(temp, 0, new ArrayList<>());
    }
    public static void main(String args[]) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        //List<Integer> temp = new ArrayList<>();
        triangleSum(arr);
        for(List<Integer> x: result) {
            //x.stream().forEach( ele -> System.out.print(ele + " "));
            System.out.println(x.toString());
        }
    }
}
