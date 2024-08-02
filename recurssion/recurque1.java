// write program for counting from 1 to n

package recurssion;

public class recurque1 {
    public static void count( int a ){
        if( a > 10 ){
            return;
        }
        System.out.println(a);
        count( a + 1 );
    }
    public static void main(String[] args) {
        count(0);
    }
}
