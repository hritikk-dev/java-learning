package DSA.MultiDimensionalArray.multiDimensionalArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {

        // Declear ArrayList of ArrayList
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows ");
        int row = sc.nextInt();
        System.out.print("Enter no of cols ");
        int cols = sc.nextInt();

        System.out.print("Elements of ArrayList ");
        for(int i = 0; i < row; i++){
            System.out.println("Enter element for " + i + " row ");
            // declear a arrayList and add element in it
            ArrayList<Integer> CurrRow = new ArrayList<>(); 
            for(int j = 0; j < cols; j++){
                CurrRow.add(sc.nextInt());
            }

            // at the end add that currRow to the original arrayList
            arr.add(CurrRow);
        }

        // printing the arrayList

        System.out.println();
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }


        // access the element and modified it

        arr.get(0).set(1,99);
        System.out.print(arr.get(0).get(1));

        sc.close();
    }
}
