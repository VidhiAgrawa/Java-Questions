
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year for checking:- ");
        int year = sc.nextInt();
        if( year%4 == 0 ){
            System.out.println(year + " Is a leap year");
        }
        else{
            System.out.println(year + " Is not a leap year");
        }
    }
}
