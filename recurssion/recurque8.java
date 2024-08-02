// Write a function to find factorial of a number but also store the factorials calculated in a dictionary as done in the Fibonacci series example.

package recurssion;

import java.util.Scanner;

public class recurque8 {

    public static int factorial( int num, int num2 ){
        if( num > num2 ){
            return 1;
        }
        return num * factorial(num + 1, num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int num2 = sc.nextInt();
        // multi(1 , num);
        System.out.println( factorial(1 , num2) );
    }
    
}
