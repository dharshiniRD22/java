import java.util.Scanner;
public class Nsum {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)){
          int n = input.nextInt();
          int i = 1;
          int ans = 0;
          while(i<=n){
            ans = ans +i;
            i++;
          }
          System.out.println(ans);
        }
    }
}
