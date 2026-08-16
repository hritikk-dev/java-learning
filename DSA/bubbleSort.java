// Sort an array using bubble sort in reverse order

package DSA;

public class bubbleSort {

    // swaps in reverse order 
    public static void BubbleSort(int []arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){

            int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }

        

        for(int ele : arr){
            System.out.print(ele +  " ");
        }
    }
    public static void main(String[] args) {
        int []arr = {9,8,2,4,6};

        BubbleSort(arr);
    }
}
