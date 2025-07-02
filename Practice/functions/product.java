import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(product(a,b));
    }
    public static int product(int a , int b){
       int product = a*b;
    return product;
}
}
