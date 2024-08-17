// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.

package conditionPYOs;

import java.util.Scanner;

public class que3 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter purchased amount :-");
        int userQuantity = sc.nextInt();

        if( userQuantity > 1000 ){
            int per = (10 * userQuantity )/100;
            System.out.println( "Discout of 10% on the purchase above 1000/- is " + per + " so total amount is " + (userQuantity - per));
        }
        else{
            System.out.println("Purchased quantity was below 1000/- so no discount will be apllied ");
        }

    }
}
