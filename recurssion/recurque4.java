// print multiplication of 1 to n with return

package recurssion;

import java.util.Scanner;

public class recurque4 {
    public static int multi( int a, int num ){
        if( a > num ){
            return 1;
        }        
        return a * multi(a + 1, num);
    }
    /*
     * 1>5
     * 1*m(2,5)
     *    2*m(3,5)
     *       3*m(4,5)
     *          4*m(5,5)
     *             5*m(6,5)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int num = sc.nextInt();
        // multi(1 , num);
        System.out.println( multi(1 , num) );
    }
}
