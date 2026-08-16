// Move all zeros to end

package DSA;

public class moveAllZero {

    public static void moveZeroToEnd(int []arr){
        int n= arr.length;
        // int zero = 0;
        int st = 0;
        int end = n-1;
        for(int i=0;i<n;i++){
            if(arr[st] == 0 && st < end){
                if(arr[end] != 0){
                    int temp = arr[st];
                    arr[st] = arr[end];
                    arr[end] = temp;

                    st++;
                    end--;
                }else {
                    end--;
                }
                
            }else{
                st++;
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int []arr = {1,0,0,0,3,0,0,5};

        moveZeroToEnd(arr);
    }
}
