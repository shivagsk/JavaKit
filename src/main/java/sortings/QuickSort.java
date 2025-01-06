package sortings;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        if (i!=j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low-1;
        for(int j=low; j<=high-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1,1,2,3,5};
        quickSort(arr, 0, arr.length-1);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
