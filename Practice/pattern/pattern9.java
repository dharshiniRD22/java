//****
// ***
//  **
//   *
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1; i<=n; i++){
            for(int s=0; s<i; s++){
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
