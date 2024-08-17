// Take input of age of 3 people by user and determine oldest and youngest among them.


package conditionPYOs;

import java.util.Scanner;

public class que6 {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("Enter Age of 1st user :-");
        int age1 = sc.nextInt();

        System.out.println("Enter Age of 2nd user :-");
        int age2 = sc.nextInt();

        System.out.println("Enter Age of 3rd user :-");
        int age3 = sc.nextInt();

        if( age1 > age2 && age1 > age3 ){
            System.out.println("1st user is eldest 2nd and 3rd user is younger ");
        }
        else if( age2 > age1 && age2 > age3 ){
            System.out.println("2st user is eldest 1st and 3rd user is younger ");
        }
        else if( age3 > age1 && age2 < age3 ){
            System.out.println("3st user is eldest 2nd and 1st user is younger ");
        }
        else if( age1 == age2 || age2 == age3 || age3 == age1 ){
            System.out.println("Both user have Same age");
        }
        
    }
}
