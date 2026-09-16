package DSA.Recursion;

public class global {

    static int globalVar = 5; // this is global variable used in any function
    public static void main(String[] args) {
        printHello(globalVar);
    }

    public static void printHello(int n){
        // base case
        if(n == 0 )return ;
        System.out.print(n+" ");
        printHello(n-1);
    }
}
