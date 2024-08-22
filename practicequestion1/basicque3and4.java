// Write a program to enter a 4 digit number from keyboard. Add 8 to the number and then divide it by 3. Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.

// Now, solve the above question using assignment operators (eg. +=, -=, *=).


package practicequestion1;
import java.util.*;
public class basicque3and4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any four digit number :- ");
        int num = sc.nextInt();
        num += 8;
        num /= 3;
        num %= 5;
        num *= 5;
        System.out.println( "The result is :- " + num);
        // System.out.println( (((num + 8)/3)%5)*5 );
    }
}
