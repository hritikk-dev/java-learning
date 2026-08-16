import java.util.*;

public class circumference {

    public static double circumferenceOfCircle(int r) {

        double pie =  3.14159;
        return 2*pie*r;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius ");
        int rad = sc.nextInt();

        double res = circumferenceOfCircle(rad);
        System.out.print("Circumference of circle is : " + res);
        sc.close();
    }
}
