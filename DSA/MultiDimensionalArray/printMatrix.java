// Print matrix in snake pattern
package DSA.MultiDimensionalArray;

public class printMatrix {
    public static void main(String[] args) {
    int [][] arr = {{5,12,3},{20,8,15},{9,11,10}};
    
        // 5 12 3
        // 20 8 15
        // 9 11 10

        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j=arr[i].length-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            // System.out.println();
        }
    }
}
