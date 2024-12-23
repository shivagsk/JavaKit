package recursion.patterns;

import java.util.Scanner;

public class InvertedRightTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // using helper function
        printInvertedRightTriangle(n);

        // without using helper function
        printTriangle(n,n);
    }

    static void helper(int n) {
        if(n == 0)
            return;
        System.out.print("# ");
        helper(n-1);
    }
    static void printInvertedRightTriangle(int n) {
        if(n == 0)
            return ;
        helper(n);
        System.out.println();
        printInvertedRightTriangle(n-1);
    }

    static void printTriangle(int r, int c) {
        if(r == 0)
            return ;
        if(c == 0) {
            System.out.println();
            printTriangle(r-1,r-1);;
        } else {
            System.out.print("* ");
            printTriangle(r, c - 1);
        }
    }
}
