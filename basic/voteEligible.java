import java.util.*;
public class voteEligible {

    public static boolean checkElegiblity(int age){
        if(age >= 18){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        boolean vote = checkElegiblity(age);
        if(vote){
            System.out.print("You are eligible to vote");
        }else{
            System.out.print("You are not eligible to vote");
        }

        sc.close();

    }
}
