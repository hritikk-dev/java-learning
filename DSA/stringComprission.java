package DSA;

public class stringComprission {
    public static void strCompressed(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 97;
            freq[idx]++;
        }

        StringBuilder sb = new StringBuilder();
        // for(int i=0;i<26;i++){
        // if(freq[i] > 1){
        // ans+= (char)(i+97);
        // ans+=freq[i];
        // }else if(freq[i]==1){
        // ans+=(char)(i+97);
        // }
        // }

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
            }
        }
System.out.println(sb);
        // System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "aaabbzztkkaa";

        strCompressed(str);
    }
}


// wrong implementation