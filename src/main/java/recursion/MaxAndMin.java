package recursion;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {3,2,7,-1,7,12};
        System.out.println(minimum(arr,0,arr[0]));

    }
    static int minimum(int[] arr, int ind, int min) {
        if(arr.length == ind)
            return min;
        min = arr[ind] < min ? arr[ind] : min;
        return minimum(arr, ind+1, min);
    }
}
