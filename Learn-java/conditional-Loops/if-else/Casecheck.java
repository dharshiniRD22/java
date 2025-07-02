import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)){
            System.out.println("enter the letter:");
        char ch = input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lower case!!!");
        }
        else{
            System.out.println("upper case!!!");
        }
        }
    }
    
}
