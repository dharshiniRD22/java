import java.util.Scanner;
public class Fruit{
    public static void main(String[] args) {
       try(Scanner input = new Scanner (System.in)){
         System.out.println("enter a fruit name:");
         String fruit = input.next();
         switch(fruit){
            case"mango":
            System.out.println("the king of fruits");
            break;
            case"apple":
            System.out.println("a sweet red fruit");
            break;
            default:
            System.out.println("pls enter a valid fruit");
         }
       } 
    }
}