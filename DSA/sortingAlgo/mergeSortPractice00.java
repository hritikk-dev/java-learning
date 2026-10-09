package DSA.sortingAlgo;

public class mergeSortPractice00 {
    public static void main(String[] args) {
        int []arr = {4,6,3,7,2,0,8};

        merge(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void merge(int []arr){
        int n = arr.length;
        if(n == 1) return;

        int []a = new int[n/2];
        int []b = new int[n-n/2];
        int k = 0;

        for(int i = 0; i<a.length; i++){
            a[i] = arr[k++];
        }

        for(int  j= 0; j<b.length; j++){
            b[j] = arr[k++];
        }

        merge(a);
        merge(b);

        combine(arr, a, b);
    }

    public static void combine(int []arr, int []a, int []b){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                arr[k++] = a[i++];
            }else{
                arr[k++] = b[j++];
            }
        }

        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }
}