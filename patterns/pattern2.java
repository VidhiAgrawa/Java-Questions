package patterns;

public class pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print("*");                
            }
            System.out.println(); 
        }

    }
}
