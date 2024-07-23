package patterns;

public class pattern16 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            } 
            for (int l = 0; l <= i; l++) {
                if( i == 0 || l == 0 ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            } 
            for (int k = 1; k <= i; k++) {
                if( k == i ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            } 
            System.out.println(); 
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if ( i == 0 || i == 5 - 1 || j ==0 || j == 9 - 1 ) {
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
