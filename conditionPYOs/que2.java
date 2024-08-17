// Take two int values from user and print greatest among them.


package conditionPYOs;

import java.util.*;

public class que2 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of A :- ");
        int a = sc.nextInt();
        System.out.println("Give the value of B :- ");
        int b = sc.nextInt();

        if( a > b ){
            System.out.println("A is greater than B ");
        }
        else if ( b > a ){
            System.out.println("B is greater than A ");
        }
        else{
            System.out.println("A is equal to B ");

        }
    }
}
