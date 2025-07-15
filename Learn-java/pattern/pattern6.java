//          *
//         * *
//        * * *
//       * * * *
//        * * *
//         * *
//          * 
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<2*n; i++){
            int totalcols = i>n? 2*n-i:i;
            int space = n-totalcols;
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int k=0; k<totalcols; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
