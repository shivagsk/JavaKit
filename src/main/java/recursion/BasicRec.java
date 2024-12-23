package recursion;

import java.net.SocketOption;

public class BasicRec {
    static int res =0 ;
    public static void main( String[] arg) {
        int n =123;
       // System.out.println(sumOfDigits(n,0));
       // System.out.println(fact(4));
        intReverse(1234);
        System.out.println(res);
    }
    static int fact(int n) {
        if(n==1)
            return n;
        System.out.println(n);
        return n*fact(n-1);

    }
    static int sumOfDigits(int n, int sum) {
        if(n == 0)
            return sum;
        return sumOfDigits(n/10, sum + n%10);
    }

    static void intReverse(int n) {
        if(n == 0)
            return ;
        System.out.println(n);
        res = res *10 + n%10;
        intReverse(n/10);
        System.out.println(n%10);

        System.out.println(res);
    }
}
