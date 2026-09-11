package DSA.MultiDimensionalArray;

public class multiplyOfMatrix {
    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3 }, { 4, 5, 6 }, { 1, 1, 2 } };
        int [][] b = {{ 1, 2, 3 }, { 4, 5, 6 }, { 1, 1, 2 } };
        int n=a.length;

        int [][] c = new int[3][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
