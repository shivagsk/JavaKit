package sortings;

public class SelectionSortIterative {

//    public static void swap(int a, int b) {
//        a = a+b;
//        b = a-b;
//        a = a-b;
//    }
    public static void selection(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            int minind = i;
            for(int j = i+1; j<n; j++) {
                if(arr[j] > arr[minind]) {
                    //System.out.println(arr[j] + " in if " + arr[minind] + "  " + j + " " + minind);
                    minind = j;
                }
            }
            if(i != minind) {
                arr[i] = arr[i] + arr[minind];
                arr[minind] = arr[i] - arr[minind];
                arr[i] = arr[i] - arr[minind];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1,0, 12,32,66,99};

        selection(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
