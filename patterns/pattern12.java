package patterns;

public class pattern12 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 13; j++) {    
                if( j == 0 || j == 13 - 1 || j == 13/2 ){
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
