// sum of even numbers 

package recurssion;

import java.util.Scanner;

public class recurque6 {
    public static int even( int a, int num ){
        if( a > num ){
            return 0;
        }
        if( a%2 == 0 ){
            // System.out.println(a);
            return a + even(a + 1, num);
        }
        return even(a +1, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = sc.nextInt();
        System.out.println(even(1, num));
    }
}
