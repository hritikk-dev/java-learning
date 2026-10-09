package DSA.sortingAlgo;

public class quickSortPractice {
    public static void main(String[] args) {
        int []arr = {4,6,3,7,2,0,8};

        quickSort(arr,0,arr.length-1);

        for(int e : arr){
            System.out.print(e + " ");
        }
    }

    public static void quickSort(int []arr, int st, int end){
        if(st<end){
            int pivotIdx = partition(arr,st,end);

            quickSort(arr, st, pivotIdx-1);
            quickSort(arr, pivotIdx+1, end);

        }
    }

    public static int partition(int []arr, int st, int end){

        int pivotEle = arr[end];

        int j = st;
        int k = st;

        while(j < end){
            if(arr[j] < pivotEle){
                
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;

                j++;
                k++;
            }else{
                j++;
            }
        }

        int temp = arr[end];
        arr[end] = arr[k];
        arr[k] = temp;

        return k;
    }
}
