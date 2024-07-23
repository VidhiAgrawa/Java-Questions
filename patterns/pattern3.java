package patterns;

public class pattern3 {
    public static void main(String[] args) {
        
        // for (int i = 0; i < 6; i++) {
        //     for (int j = i; j < 6; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j2 = 0; j2 < (i*2)-1; j2++) {
        //         System.out.print("*");                
        //     }
        //     System.out.println(); 
        // }
        for (int i = 0; i < 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print("*");                
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");                
                
            }
            System.out.println(); 
        }
    }
}
