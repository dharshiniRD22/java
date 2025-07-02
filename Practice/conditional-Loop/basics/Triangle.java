import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the height:");
        int height = in.nextInt();
        System.out.println("enter the base:");
        int base = in.nextInt();
        Double result = 0.5*base*height;
        System.out.println(result);
    }
}
