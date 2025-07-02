import java.util.Scanner;
public class Boolean {
    public static void main(String[]args)
    {
     try(Scanner input = new Scanner (System.in)){
       System.out.println("enter num 1:");
       int num1 = input.nextInt();
       System.out.println("enter num 2:");
       int num2 = input.nextInt();
       System.out.println( num1 == num2 );
    }
}
}
