package patterns;

public class pattern10 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if( i == 0 || i == 4 || k == 0 ){
                    System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int k = 0; k <= i; k++) {
                if( i == 4 || k == i ){
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


// for (int i = 0; i <= 5; i++) {
//     for (int j = i; j <= 5; j++) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= ( 2 * i ) - 1; k++) {
//         if( i == 5 || k == 1 || k == ( 2 * i ) - 1 ){
            
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
        
//     }
    
//     System.out.println();
// }
