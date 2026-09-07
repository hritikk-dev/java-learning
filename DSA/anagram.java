package DSA;

public class anagram {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        int [] arr = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            arr[ch-97]++;
        }
        for(int i=0;i<s1.length();i++){
            char ch = s2.charAt(i);
            arr[ch-97]--;
        }

        for(int i=0;i<arr.length; i++){
            System.out.print(i);
            System.out.println(arr[i]);
        }
        
    }
}
