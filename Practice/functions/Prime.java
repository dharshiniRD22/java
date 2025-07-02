import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the no:");
        int n = in.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
       for (int c=2; c*c <=n; c++){
              if(n%c==0){
                return false;
              }
        }
        return true;
    }
}
