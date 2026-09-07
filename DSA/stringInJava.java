package DSA;

public class stringInJava {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "world";

        for(int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println(str.indexOf('H'));
        System.out.println(str.compareTo(str2));  // returns a integer value 

        System.out.println(str.toLowerCase());

        char []arr;
        arr = str.toCharArray();
        for(char ch : arr){
            System.out.println(ch);
        }
        System.out.println(arr);
    }
}
