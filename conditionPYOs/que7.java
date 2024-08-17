// Write a C program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1



package conditionPYOs;

import java.util.Scanner;

public class que7 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter input :-");
        int input = sc.nextInt();
        int absolute = -input;
        System.out.println(absolute);
        if ( input == (-absolute) ){
            System.out.println(" the absolut value is :- " + (input) );
        }
        
        
        
        
        
    }
}
