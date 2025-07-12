//1678
import java.util.Scanner;
public class GoalParser {
     public  static String interpret(String command) {
       String change2 =  command.replace("()","o");
         return change2.replace("(al)","al");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(interpret(input));
    }
}

