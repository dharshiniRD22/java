import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
System.out.println(" enter the principle");
int p = in.nextInt();
System.out.println(" enter the time");
int t = in.nextInt();
System.out.println(" enter the rate");
int r = in.nextInt();
int interest = (p*t*r)/100;
System.out.println("the simple interest is:"+interest);

        }
    }
}
