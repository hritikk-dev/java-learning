package DSA.Recursion;

import DSA.MultiDimensionalArray.sumOfElement;

public class recursionOnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,6,45,7,54,9};

        printRecursive(arr,0);
        System.out.println();
        print(arr, 0);
    }

    public static void printRecursive(int []arr,int idx){
        if(idx == arr.length) return ;
        printRecursive(arr, idx+1);
        System.out.print(arr[idx] + " ");
    }

    
    public static void print(int []arr,int idx){
        if(idx == arr.length) return ;
        System.out.print(arr[idx] + " ");
        printRecursive(arr, idx+1);
    }
}
