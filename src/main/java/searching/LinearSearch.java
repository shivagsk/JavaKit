package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,6,32,76,8};
        int key = 32;
        boolean flag = false;
        for(int x : arr) {
            if(x == key) {
                flag = true;
                break;
            }
        }
        System.out.println(" Element found ? " + flag);
    }
}
