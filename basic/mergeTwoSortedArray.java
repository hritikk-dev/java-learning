import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter size of arr ");
        int n = sc.nextInt();
        System.out.print("Enter size of brr ");
        int m = sc.nextInt();
        int []arr = new int[n];
        int [] brr = new int[m];

        System.out.print("Enter arr elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter brr elements ");
        for(int i=0;i<m;i++){
            brr[i] = sc.nextInt();
        }
        // int n = arr.length;
        // int m = brr.length;
        int [] ans = new int[n+m];
        int ptr1 = 0;
        int ptr2 = 0;
        int idx = 0;
        while(ptr1 < n && ptr2 < m){
            if(arr[ptr1] <= brr[ptr2]){
                ans[idx] = arr[ptr1];
                idx++;
                ptr1++;
            }else if(arr[ptr1] > brr[ptr2]){
                ans[idx] = brr[ptr2];
                idx++;
                ptr2++;
            }

        }
        if(ptr1 < n){
            for(int i = ptr1; i<n; i++){
                ans[idx] = arr[i];
                idx++;
            }
        }else if(ptr2 < m){
            for(int i =ptr2; i<m; i++){
                ans[idx] = brr[i];
                idx++;
            }
        }
        System.out.print("Merged array is : ");
        for(int i=0;i<m+n; i++){
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }

}
