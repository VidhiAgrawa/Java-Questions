
// Take 10 integer inputs from user and store them in an array. Now, copy all the elements in another array but in reverse order.
package arrays;

import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        
        int arr[] = new int[10];
        int arr2[] = new int[arr.length];
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < arr.length; i++ ){
                System.out.println("Enter the integer " + i );
            int b = sc.nextInt();
            arr[i] = b;
        }

        for( int i = 0, j = arr2.length - 1; i < arr.length && j >= 0; i++, j--  ){
            arr2[j] = arr[i];
        
        }
        for( int k = 0; k < arr2.length; k++ ){
            System.out.println(arr2[k]);
        }


        
        
        
    }
}
