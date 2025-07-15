//    * * * *
//     * * *
//      * *
//       *
//      * *
//     * * *
//    * * * *


import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 0; row < n; row++){
            
                 for(int s=0; s<row; s++){
                System.out.print(" ");
            }
            for(int j=0; j<n-row; j++){
                System.out.print("* ");
            }
            System.out.println();
            }

            for (int row = n - 2; row >= 0; row--) {
                 for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - row; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }

