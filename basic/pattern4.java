import java.util.Scanner;
public class pattern4 {
    public static void printPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value on n");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
