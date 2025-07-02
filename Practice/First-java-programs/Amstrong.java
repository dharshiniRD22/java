import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            int original =n;
            int sum=0;
            while(n>0){
                int rem = n%10;
                n=n/10;
                sum=sum+rem*rem*rem;
            }
            System.out.println("the amstrong value is:"+sum);
            if(original==sum){
                System.out.println("it is an amstrong number");
            }
            else{
                System.out.println("not an amstrong number");
            }
        }
    }
}
