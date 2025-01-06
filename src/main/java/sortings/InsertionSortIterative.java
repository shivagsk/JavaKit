package sortings;

public class InsertionSortIterative {

    public static void insertion(int[] arr) {
        int n = arr.length;

        for(int i=1; i<n; i++) {
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,4,2,5,7,4,8,77,66,55,90};

        insertion(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
