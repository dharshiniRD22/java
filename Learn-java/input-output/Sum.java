import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in))
        {
            System.out.println("enter num1:");
        int num1 = input.nextInt();
        System.out.println("enter num2:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("the sum is:"+sum);
    }
}
}