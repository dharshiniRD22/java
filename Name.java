import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        try
        (Scanner input = new Scanner (System.in))
        {
        var name = input.next();
        System.out.println("hello"+" "+name);
    }
}
}