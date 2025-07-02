import java.util.Scanner;
public class SubtractDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original =n;
        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;
            product=product*digit;
            sum=sum+digit;
            n=n/10;
        }
        int result= product-sum;
        System.out.println(original+"=" +result);

    }
}
