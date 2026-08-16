import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        int count  = 0;
        while (n > 0) {
            count++;
            n/=10;
            
        }
        System.out.print("Count is : "  + count);

        sc.close();

    }
}
