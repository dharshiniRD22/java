import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prev=0;
        int i=1;
        int count=2;
        while(count<=n){
            int temp =i;
            i=i+prev;
            prev=temp;
            count++;
        }
        System.out.println(i);
    }
}
