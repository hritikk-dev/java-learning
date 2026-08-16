import java.util.Scanner;

public class fibonacci {
    public static void fibonacciSeriese(int n){
        int count = 0;
        int first = 1;
        int second = 1;

        while (count <= n) {
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;

            count++;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n ");
        int n = sc.nextInt();
        fibonacciSeriese(n);
        sc.close();
    }    
}
