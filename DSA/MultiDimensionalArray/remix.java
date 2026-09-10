// Reverse all rows of a given matrix & then reverse the column;
package DSA.MultiDimensionalArray;

public class remix {
    public static void main(String[] args) {

        int[][] arr = { { 5, 12, 3 }, { 20, 8, 15 }, { 9, 11, 10 } };

        // 5 12 3
        // 20 8 15
        // 9 11 10

        // int [][] brr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            int st = 0;
            int end = arr[i].length - 1;
            while (st <= end) {
                int tempEle = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = tempEle;
                st++;
                end--;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            int st = 0;
            int end = arr.length - 1;

            while (st < end) {
                int eleTemp = arr[st][j];
                arr[st][j] = arr[end][j];
                arr[end][j] = eleTemp;

                st++;
                end--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
