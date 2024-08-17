// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.


package conditionPYOs;

import java.util.Scanner;

public class que5 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("Enter your Marks :- ");
        int stdMarks = sc.nextInt();

        if( stdMarks <= 25 ){
            System.out.println("Your grade is F");
        }
        else if( stdMarks > 25 && stdMarks <= 45 ){
            System.out.println("Your grade is E");
        }
        else if( stdMarks > 45 && stdMarks <= 50 ){
            System.out.println("Your grade is D");
        }
        else if( stdMarks > 50 && stdMarks <= 60 ){
            System.out.println("Your grade is C");
        }
        else if( stdMarks > 60 && stdMarks <= 80 ){
            System.out.println("Your grade is B");
        }
        else{
            System.out.println("Your grade is A");
            
        }
    }
}
