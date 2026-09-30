package DSA.Recursion;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(Math.min(a,b), Math.max(a, b));

        System.out.println(res);
        sc.close();
    }
    public static int gcd(int a, int b){

        if(b%a == 0) return a;
        return gcd(b%a, a);
    }
}
