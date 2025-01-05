package sortings;

public class BubbleSortIterative {

    public static void bubble(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            boolean flag = true;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //System.out.println(arr[j] + " i = " + i + " " + arr[j+1]);
                    flag = false;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] -arr[j+1];
                }
            }
            if(flag) break;
        }
//        System.out.println(arr);
//        for(int x: arr) {
//            System.out.print(x + " ");
//        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,21,56,32,8,56,1,11};
        bubble(arr);
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
