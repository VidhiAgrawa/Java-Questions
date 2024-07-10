// Write a program to enter the values of two variables from the keyboard and then interchange the values of the two variables. E.g.-
// If entered value of x is 5 and y is 10 then
// printf("%d %d",x,y )
// should print 10 5.


package practicequestion1;
import java.util.*;
public class basicque9 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number X :- ");
        int x = sc.nextInt();
        System.out.println("Enter the number Y :- ");
        int y = sc.nextInt();
        int z;
        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        

    }
}
