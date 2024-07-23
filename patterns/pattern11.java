package patterns;

public class pattern11 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if( i == 0 ) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
    
                }
            }
            else{
                for (int j = 0; j < 10/2; j++) {
                    System.out.print(" ");       
                }
            }
            System.out.print("*");
                
            System.out.println();
        }
    }
}
