public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,6,4,8,1};
        String s = new String("Shiva");

        int secondMax = -1, firstMax = -1;
        for(int i=0; i<arr.length; i++) {
            if(firstMax < arr[i]) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
        }
        System.out.println(firstMax + "  " + secondMax);
    }
}
