package DSA.sortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {4,3,6,2,7,1,9};
        
        insertionsort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void insertionsort(int []arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int idx = i;
            while(idx > 0 &&arr[idx] < arr[idx-1]){
                int temp = arr[idx];
                arr[idx] = arr[idx-1];
                arr[idx-1] = temp;
                idx--;
            }
        }
    }
}
