package DSA.MultiDimensionalArray;

public class columnWiseReverse {
    public static void main(String[] args) {
        int[][] a = {
        {1, 2, 3 },
        {4, 5, 6 },
        {7, 8, 9}};

        int st = 0;
        int end = a.length-1; 
        
        while(st<end){

            for(int j=0;j<a[0].length;j++){
                int temp = a[st][j];
                a[st][j] = a[end][j];
                a[end][j] = temp;
            }

            st++;
            end--;
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
