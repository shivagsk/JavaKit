package sortings;

public class MultiplicationMatrix {

    public static void matrixMultiplication(int[][] res, int arr[][], int power) {
        int n = arr[0].length;
        if(power == 1) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
            return ;
        }


        int result[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                result[i][j] = 0;
                for(int k = 0; k<n ;k++) {
                    result[i][j] += (res[i][k] * arr[k][j]);
                }
            }
        }
        matrixMultiplication(result, arr, power-1);

    }
    public static void main(String[] args) {
        int [][] arr = new int[][]{{1,0}, {0,1}};
        matrixMultiplication(arr, arr, 4);
    }
}
