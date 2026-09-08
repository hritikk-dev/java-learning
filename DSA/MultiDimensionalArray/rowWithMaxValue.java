// Find the row with maximum sum
package DSA.MultiDimensionalArray;

public class rowWithMaxValue {
    public static void main(String[]args){
        int [][] arr= {{1,2,3},{40,50,6},{700,8,9}};


        int maxRowSum = 0;
        int maxRow = -1;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(maxRowSum < sum){
                maxRowSum = sum;
                maxRow=i;
            }
        }

        System.out.println("row with maximum sum "+ maxRowSum + " and row is "+(maxRow+1));
    }
}
