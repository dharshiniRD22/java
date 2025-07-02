import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
            System.out.println("enter your name:");
String name = in.next();
System.out.println("hello"+" "+name);
        }
    }
}
