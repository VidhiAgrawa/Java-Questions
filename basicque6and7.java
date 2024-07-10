// Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
// Now solve the above question to check if atleast one of the conditions 'a < 50' and 'a < b' is true.


package practicequestion1;
import java.util.*;
public class basicque6and7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A:- ");
        int A = sc.nextInt();
        System.out.println("Enter the number B:- ");
        int B = sc.nextInt();
        
        if( A < 50 && A < B ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if( A < 50 || A < B ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
