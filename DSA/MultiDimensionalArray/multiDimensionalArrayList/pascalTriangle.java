// Pascal triangle in ArrayList
package DSA.MultiDimensionalArray.multiDimensionalArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of rows ");
        int row = sc.nextInt();

        pascal(row,sc);
        sc.close();
    }

    public static void pascal(int row, Scanner sc ) {

        // int [][] arr = new int[row][];  // we can initialize the 2d array with only row size without cols size 
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < row; i++){
            // arr[i] = new int[i+1]; // we have to initialize with arr[i] with the column otherwise it gives an error can't store int value to null pointer
            ArrayList<Integer> curRow = new ArrayList<>(i+1);

            for(int j = 0; j < i+1; j++){
                
                if(j == 0 || j == i) {
                    // arr[i][j] = 1;
                    curRow.add(1);
                }else {
                    // arr[i][j] = arr[i-1][j]+ arr[i-1][j-1];
                    curRow.add((arr.get(i-1).get(j) + arr.get(i-1).get(j-1))); 
                }

            }
            arr.add(curRow);
        }


        // printing the pascal triangle
        System.out.println();
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        ArrayList<Integer>ans = new ArrayList<>();
        System.out.println("Enter idx for ans ");
        int idx = sc.nextInt();
        
        // method 1 -> find the all element from particular row 
        // for(int i = 0; i<arr.size(); i++){
        //     if(idx == i) { // now i am at the correct index
        //         for(int j = 0; j<arr.get(i).size(); j++){
        //             ans.add(arr.get(i).get(j));
        //         }
        //     }
        // }

        // method2 ->  find the all element from particular row 
        if(idx >= 0 && idx < arr.size()){
            ans.addAll(arr.get(idx));  // all ele from cols in one time 
        }

        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
