// factorial of a number

package DSA.Recursion;
import  java.util.Scanner;

public class factorialOfAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int res = fact(n);
        System.out.println("factorial of n is : " + res);

        sc.close();
    }

    public static int fact(int n){
        // base case
        if(n == 1) return 1;
        
        return fact(n-1) * n;
    }
}
