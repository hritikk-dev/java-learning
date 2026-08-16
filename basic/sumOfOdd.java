
import java.util.Scanner;;
public class sumOfOdd {

    public static void sumOfOddN(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum+=i;
            }
        }

        System.out.println("the sum of given no is : " + sum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();

        sumOfOddN(n);
        sc.close();
    }
}
