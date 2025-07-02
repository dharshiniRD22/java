import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
         System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int factorial =1;
        for(int i =1 ; i<=n ; i++){
             factorial =factorial *i;
        }
       return factorial;
    }
}
