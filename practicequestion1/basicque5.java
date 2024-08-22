// Enter two numbers from keyboard. Write a program to check if the two numbers are equal

package practicequestion1;

import java.util.*;

public class basicque5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A :- ");
        int A = sc.nextInt();
        System.out.println("Enter a number B :- ");
        int B = sc.nextInt();
        
        if( A == B ){
            System.out.println("A is equal to B ");
        }
        else{
            System.out.println("A is not equal to B ");
        }
    }
}