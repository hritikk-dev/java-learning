import java.util.*;

public class main1 {

    // Called Function
     public static void average(int a, int b, int c) {
        System.out.println("Average of the no is " +(a+b+c)/3); 
    }

    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no ");
        int a = sc.nextInt();
        System.out.print("enter 2nd no ");
        int b = sc.nextInt();
        System.out.print("enter 3rd no ");
        int c = sc.nextInt();
        average(a,b,c);
        sc.close();
    }

    
}