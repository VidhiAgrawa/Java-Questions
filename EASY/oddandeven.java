import java.util.Scanner;

public class oddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to chech odd&even:- ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Its Even");
        }
        else{
            System.out.println("Its Odd");
        }
    }
}
