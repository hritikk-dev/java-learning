import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();


        int temp =n;

        for(int i=1; i<=n; i++){
            System.out.println(i);
            System.out.println(temp);
            if(i == temp){
                break;
            }
            temp--;

        }



        sc.close();
    }
}
