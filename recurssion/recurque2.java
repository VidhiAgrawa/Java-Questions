// reverse count from n to 1

package recurssion;

public class recurque2 {
    public static void count( int a ){
        if( a < 1 ){
            return;
        }
        System.out.println(a);
        count( a - 1 );
    }
    public static void main(String[] args) {
        count(10);
    }
}
