package sortings;

public class MergeSort {

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l +1;
        int n2 = r - m;
        int[] ll = new int[n1];
        int[] rr = new int[n2];
        for(int i=0; i<n1; i++)
            ll[i] = arr[l+i];
        for(int i=0; i<n2; i++)
            rr[i] = arr[m+1+i];
        int i = 0, j = 0, k = l;
        while(i<n1 && j<n2) {
            if(ll[i] <= rr[j]) {
                arr[k] = ll[i];
                i++;
            } else {
                arr[k] = rr[j];
                j++;
            }
            k+=1;
        }
        while(i<n1) {
            arr[k] = ll[i];
            i++;
            k++;
        }
        while(j<n2) {
            arr[k] = rr[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int[] arr, int l, int r) {
        if( l< r) {
            int mid = (r - l) / 2 + l;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1,5,6,7,23,21};

        mergeSort(arr, 0, arr.length-1);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
