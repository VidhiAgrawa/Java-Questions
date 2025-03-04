import java.util.Scanner;

public class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num for table:- ");
        int num = sc.nextInt();
        System.out.print("Enter the length for table:- ");
        int length = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            int multi = num * i;
            System.out.println(num + " * " + i + " = " + multi);
        }
    }
}