// .Write a C program to print all even numbers between 1 to 100. - using while loop


package loops;

public class loopque4 {
    public static void main(String[] args) {
        int a = 100;
        while( a >= 1 ){
            a--;
            if( a%2 == 0 ){
                System.out.println(a);

            }
        }
    }
}
