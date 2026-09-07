// reverse each word in string
package DSA;

public class reverseWord {
    public static void reverseEachWord(String str) {
        String ans = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String reverse = new StringBuilder(temp).reverse().toString();
                ans += reverse;
                ans += ' ';
                temp = "";
            } else {
                temp += ch;
            }
        }
        ans += new StringBuilder(temp).reverse().toString();
        System.out.print(ans);
    }

    public static void main(String[] args) {

        String str = "olleh I ma kitirh";

        reverseEachWord(str);
    }
}
