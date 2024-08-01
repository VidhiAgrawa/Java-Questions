//Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.


package arrays;

import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < arr.length; i++ ){
            System.out.println("Enter the integer " + i );
            int b = sc.nextInt();
            arr[i] = b;
        }
        System.out.println( "Give a number :- " );
        int num = sc.nextInt();
        
        // for( int j = 0; j < arr.length; j++ ){
            
        //     System.out.println( arr[j] );
            
        // }
        for( int k = 0; k < 1; k++ ){
            if( arr[k] ==  num ){
                System.out.println("number is present in array");
            }
            else{
                System.out.println("number is not present in array");
    
            }

        }

        
        
    }
}
