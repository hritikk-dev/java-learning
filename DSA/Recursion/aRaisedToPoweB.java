// a raised to the power b
package DSA.Recursion;

import java.util.Scanner;

public class aRaisedToPoweB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter  b ");
        int b = sc.nextInt();

        int res = pow(a,b);
        System.out.print(a + " raised to " + b + " is " + res);
        sc.close();
    }

    public static int pow(int a , int b){

        // two base case
        if(b == 0) return 1;
        if(b==1) return a;

       return  pow(a,b-1)*a;
    }
}
