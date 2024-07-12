// Write a function to tell user if he/she is able to vote or not.
// ( Consider minimum age of voting to be 18. )


package functions;

public class funcque4 {
    public static void vote( int age ) {
        if( age >= 18 ){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
    }
    public static void main(String[] args) {
        vote( 18 );
    }
}
