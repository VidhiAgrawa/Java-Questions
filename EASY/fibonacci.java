
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:- ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        
        for (int i = 0; i <= n; i++) {
            System.out.print(a + "\t");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
