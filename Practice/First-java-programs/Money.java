import java.util.Scanner;
public class Money {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter the rupees:");
            int rupees = in.nextInt();
            int usd = rupees/83;
            System.out.println("the USD :"+usd);
        }
    }
}
