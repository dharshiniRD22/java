import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
         sum();
    }
    public static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}