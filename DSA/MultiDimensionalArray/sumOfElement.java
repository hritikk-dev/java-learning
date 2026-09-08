// Sum of element in given array and maximum element 
package DSA.MultiDimensionalArray;
import  java.util.Scanner;

public class sumOfElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter no of rows ");
        int row = sc.nextInt();
        System.out.print(" Enter no of cols ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter elements in 2-D array ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
                if(arr[i][j] > max) max = arr[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of the element is "+sum);
        System.out.println("Maximum element is " + max);
    }
}
