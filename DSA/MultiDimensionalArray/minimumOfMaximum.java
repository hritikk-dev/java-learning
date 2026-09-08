// Find the minimum element out of all the maximum elements of each row
package DSA.MultiDimensionalArray;
import java.util.ArrayList;

public class minimumOfMaximum {
    public static void main(String[] args) {
        int [][] arr = {{5,12,3},{20,8,15},{9,11,10}};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int maxVal = 0;
            for(int j=0;j<arr[i].length; j++){
                if(arr[i][j] > maxVal) maxVal = arr[i][j];
            }
            list.add(maxVal);
        }

        int ans = Integer.MAX_VALUE;
        for(int ele : list){
            if(ele < ans) ans = ele;
        }

        System.out.println("minimum element out of all the maximum elements "+ans);
    }
    
}
