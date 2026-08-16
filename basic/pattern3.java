import java.util.Scanner;;
public class pattern3 {

    public static void displayPattern(int n){
        int spc = n-1;  
        for(int i=1; i<=n; i++){     
            for(int j=1; j<=i; j++){  
                if(j==1){
                    for(int k=spc; k>=j; k--){    
                        System.err.print(" ");       
                    }
                }  
                System.out.print(i +" ");
            }
            System.out.println();
            spc--;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n=sc.nextInt();
        displayPattern(n);
        sc.close();
    }
}
