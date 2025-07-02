import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter A:");
           int A = in.nextInt();
           System.out.println("enter B:");
           int B = in.nextInt();
           int max = Math.max(A, B);
           System.out.println( "The maximum number is:"+max);
        }
    }
}
