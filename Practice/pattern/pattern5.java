// *
// **
// ***
// **
// *
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<2*n; i++){
            int totalCols = i>n? 2*n-i :i;
            for(int j=0; j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
