package recursion.patterns;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printTriangle(n,n);
    }
    static void printTriangle(int r, int c) {
        if(r == 0)
            return ;
        if(c == 0) {
            printTriangle(r-1,r-1);;
            System.out.println();
        } else {
            printTriangle(r, c - 1);
            System.out.print("* ");
        }
    }
}
