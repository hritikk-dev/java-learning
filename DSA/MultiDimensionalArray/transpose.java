package DSA.MultiDimensionalArray;

public class transpose {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
        {4,5,6}};
        int row = arr.length;
        int col = arr[0].length;

        int [][] ans = new int [col][row];

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<arr.length;j++){
                ans[i][j] = arr[j][i];
            }
        }

        // arr[0] ko arr[1] pe point kraa diye mtlb address change
        // int []temp=arr[0];
        // arr[0] = arr[1];
        // arr[1] = temp;
        


        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
