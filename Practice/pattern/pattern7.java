//        1
//      2 1 2
//    3 2 1 2 3
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int r=1; r<=n; r++){
            for(int s=0; s<n-r; s++){
                System.out.print(" ");
            }
            for(int col=r; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=r; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
