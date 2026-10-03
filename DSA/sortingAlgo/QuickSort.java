package DSA.sortingAlgo;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4,6,3,7,2,0,8};
        
        // we have to provide array stIndex endIndex
        quick(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quick(int []arr, int st, int end){

        if(st < end){

            // step 1: find pivot element index than divide the array in two parts
            int pivotIdx = partition(arr,st,end);
    
            // step 2: split the array into 2 parts on the basis of pivotIdx
            quick(arr, st, pivotIdx-1);
            quick(arr, pivotIdx+1, end);

        }

    }

    public static int partition(int[] arr, int st, int end) {

        int pivotEle = arr[end];

        int j = st;
        int k = st;

        while (j < end) {

            if (arr[j] < pivotEle) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;

                k++;
            }

            j++;
        }

        int temp = arr[k];
        arr[k] = arr[end];
        arr[end] = temp;

        return k;
    }
    
}
