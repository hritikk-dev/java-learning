// print one to n

package DSA.Recursion;

import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n  = sc.nextInt();
        printOneToN(n);
        sc.close();
    }   

    public  static void printOneToN(int n){
        // base case
        if(n == 0) return;

        printOneToN(n-1);  
        System.out.print(n + " ");

    }
}
