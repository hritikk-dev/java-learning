// print Decreasing-Increasing 
package DSA.Recursion;

import java.util.Scanner;

public class printDecreAndIncrea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        increaseDecrease(n);
        sc.close();
    }

    public static void increaseDecrease(int n){
        if(n == 0)return;
        System.out.println(n);
        increaseDecrease(n-1);
        System.out.println(n);

    }
}
