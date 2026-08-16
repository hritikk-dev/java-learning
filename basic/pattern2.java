import java.util.Scanner;;
public class pattern2 {

    public static void displayPattern(int n){
        int a = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                a++;
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
