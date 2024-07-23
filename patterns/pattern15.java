package patterns;

public class pattern15 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if( i == 0 || i == 4 - 1 || j == 0 || j == 10 - 1 ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         if( i == 9 ){
        //             System.out.print("*");

        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
