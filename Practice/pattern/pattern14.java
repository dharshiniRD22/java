//       1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6
import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n ; i++){
            int s = n-i;
            for(int j=1; j<=n+1-i; j++){
                System.out.print(i);
            }
            for(int j=1; j<=s; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
