// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.


package conditionPYOs;

import java.util.Scanner;

public class que4 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter your Service years in Company :- ");
        int serviceYear = sc.nextInt();
        
        if( serviceYear > 5 ){
            System.out.println("Enter your Salary :- ");
            int userSalary = sc.nextInt();
            int per = ( 5 * userSalary )/100;
            int totalSalary = per + userSalary;
            System.out.println("Your net bonus is :-" + totalSalary );
        }
        else {
            System.out.println("You are not valid for company bonus");
        }


    }
}
