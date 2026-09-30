package DSA.sortingAlgo;

public class MergeSortPractice {
    public static void main(String[] args) {

        int arr[] = {4,6,3,7,2,0,8};
        mergeSort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }

    public static void mergeSort(int arr[]){
        int n = arr.length;

        if(n == 1) return;  // array ka size 1 ho jaye to array sorted hai 

        // divide the array in 2 halves
        int []a= new int[n/2];
        int []b= new int[(n-n/2)];

        int idx = 0;

        // fill both array with elements from original array
        for(int i = 0; i < a.length; i++){
            a[i] = arr[idx++];
        }
        for(int j = 0; j < b.length; j++){
            b[j] = arr[idx++];
        }

        // repeat this again and again until the size of array is > 1 for both a and b array
        mergeSort(a);
        mergeSort(b);

        merge(a,b, arr);

    }

    public static void merge(int []a, int []b, int[] arr) {

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }else arr[k++] = b[j++];
        }

        while (i < a.length) {
            arr[k++] = a[i++];    
        }
        
        while(j < b.length){
            arr[k++] = b[j++];
        }
        
    }
}
