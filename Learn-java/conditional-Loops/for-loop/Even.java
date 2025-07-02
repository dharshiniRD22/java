import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
          int n = in.nextInt();
          for( int i=1; i<=n; i++){
            if( i%2 == 0){
                System.out.println(i);
            }
          }

          }
        }
    }
