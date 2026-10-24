// Cyclic sort implementation

package DSA.CyclicSort;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr = {3,4,1,2,6,5,7,8};
        cyclic(arr);

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void cyclic(int []arr){
        int n = arr.length;
        int i=0;

        // loop execute 0 to n
        while (i < n) {
            if(arr[i] != i+1){  // agar current ele aur wo idx+1 equal nhi hai to swap kana hai
                int correctIdx = arr[i];
                arr[i] = arr[correctIdx-1];   // current ele ko corIdx-1 wale se kana hai
                arr[correctIdx-1] = correctIdx;
            }else{
                i++;
            }
        }
    }
}