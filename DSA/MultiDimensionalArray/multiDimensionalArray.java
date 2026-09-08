package DSA.MultiDimensionalArray;

public class multiDimensionalArray {
    public static void main(String[] args) {
        int [][]arr= {{111,222,32},{40,50,6},{7,88,9}};
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // System.out.print(arr[i][j] + " ");
                if(arr[i][j] < minVal){
                    minVal = arr[i][j];
                }
            }
            // System.out.println();
        }

        System.out.println("Minimum element in the 2-D array is : " + minVal);
    }
}