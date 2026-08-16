import java.util.Scanner;
public class pattern1 {

    public static void displayPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        displayPattern(n);

        sc.close();
    }
}
