// Merge Sort algorithm
package DSA.sortingAlgo;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {4,3,6,2,7,1,9};

        sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private  static void sort(int[] arr) {

        int n = arr.length;
        if(n == 1) return;  // if the size of array is one so it is always be sorted 

        // Step 1: divide the big array into 2 half and full-half size
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0; // idx travels on arr

        // Step 2 : copy elements from big array to both small array
        for(int i = 0; i < a.length; i++){
            a[i] = arr[idx++];
        }
        for(int i = 0; i < b.length; i++){
            b[i] = arr[idx++];
        }

        // Step 3
        sort(a);
        sort(b);

        // Step 4 : Merge 'a' and 'b' into arr
        merge(a,b,arr);
        
    }

    private static void merge(int[] a, int[]b, int []arr){
        int i=0, j=0, k=0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }else{
                arr[k++] = b[j++];
            }
        }

        while (i < a.length) {
            arr[k++] = a[i++];
        }

        while (j<b.length) {
            arr[k++] = b[j++];
        }

    }
}
