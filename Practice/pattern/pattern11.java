//* * * * *
// * * * *
//  * * *
//   * *
//    * 

import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int s=0; s<i; s++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
