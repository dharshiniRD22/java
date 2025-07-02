import java.util.Scanner;
public class primeret {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("start value:");
        int start = in.nextInt();
        System.out.println(" end value:");
        int end = in.nextInt();
        System.out.println(" the prime no.'s  between"+start+"and"+end+"are:1");
        check(start,end);
    }
    static boolean isprime(int n ){
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

    static void check(int start, int end){
        for (int i = start; i <=end; i++){
           if(isprime(i)){
            System.out.println(i);
           }
        }
    }
}
