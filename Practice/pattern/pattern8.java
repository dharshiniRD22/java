//    *
//   **
//  ***
// ****
//***** 
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<=n; i++){
            for(int s=0; s<n-i; s++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
