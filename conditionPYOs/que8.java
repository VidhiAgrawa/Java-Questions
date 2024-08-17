// If
// x = 2
// y = 5
// z = 0
// then find values of the following expressions:
// a. x == 2
// b. x != 5
// c. x != 5 && y >= 5
// d. z != 0 || x == 2
// e. !(y < 10)


package conditionPYOs;

public class que8 {
    public static void main( String[] args ){
        int x = 2;
        int y = 5;
        int z = 0;
        if( x == 2  ){
            System.out.println("x is equal to 2");
        }
        if( x != 5  ){
            System.out.println("x is not equal to 5");
        }
        if(x != 5 && y >= 5 ){
            System.out.println("x is not equal to 5 and y");
        }
        if( z != 0 || x == 2  ){
            System.out.println("z is 1= to 0 and x == 2");
        }
        if( !(y < 10)  ){
            System.out.println("y > 10");
        }
    }
}
