import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in))
        {
            System.out.println(" enter your age:");
            int age = input.nextInt();
            if(age >= 18){
                System.out.println(" your are eligible to vote");
            }
            else{
                System.out.println("you are note elegible to vote");
            }
        }
    }
}
