public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{4,6,2,4,8,-1,3,0,1};
        String s = new String("Shiva");

        //int secondMax = Integer.MAX_VALUE, firstMax = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE, firstMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(firstMax < arr[i]) {
                System.out.println(" in iff");
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(secondMax < arr[i] && arr[i] < firstMax) {
                System.out.println(" in  else");
                secondMax = arr[i];
            }
//            if(arr[i] > secondMax) {
//                secondMax = arr[i];
//            }
            System.out.println(firstMax + "  " + secondMax);
        }

        System.out.println(firstMax + "  " + secondMax);
    }
}
