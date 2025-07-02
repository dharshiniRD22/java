import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
          System.out.println("enter the number:");
          int n = in.nextInt();
          int prev=0;
          int i =1;
          int count=2;
          while(count<=n){
            int temp = i;
             i= i+prev;
            prev=temp;
            count++;
          }
          System.out.println(i);
        }
    }
}
