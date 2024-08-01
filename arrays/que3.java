
// Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.


package arrays;

import java.util.Scanner;

public class que3 {
    public static void main(){

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < arr.length; i++ ){
            System.out.println("Enter the integer " + i );
            int b = sc.nextInt();
            arr[i] = b;
            
        }

        // int arr[] = { 0, 1, -2, 3, 4, 5 };
        int positive = 0;
        int negative = 0;
        for( int j = 0; j < arr.length; j++ ){            
            if( arr[j] > 0 ){
                System.out.println(arr[j] + " are positive");
                positive++;
            }
            else if ( arr[j] < 0 ){
                System.out.println( arr[j] + " is negative " );
            }
            else {
                System.out.println(arr[j] + " is equal to zero ");
            }

            if( arr[j]%2 == 0 ){
                System.out.println( arr[j] + " is even" );
            }
            else {
                System.out.println( arr[j] + " is odd " );
            }
            
        } 
        
        
        

        
    }
}
