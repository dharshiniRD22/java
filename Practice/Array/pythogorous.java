import java.util.Scanner;
public class pythogorous {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in .nextInt();
        int b = in .nextInt();
        int c = in .nextInt();
        System.out.println(pyth(a,b,c));
    }
    static boolean pyth(int a, int b, int c){
        int a2 = a*a;
        int b2= b*b;
        int c2= c*c;
        if((a2+b2==c2)||(b2+c2==a2)||(a2+c2==b2)){
            return true;
        }
        else{
            return false;
        }
    }
}
