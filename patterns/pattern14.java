package patterns;

public class pattern14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {    
                if( j == 0 || i == 0 || i == 4 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // System.out.println(); 
            System.out.println(); 
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {    
                if( j == 10 - 1 || i == 3 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
            
        }
    }
}
