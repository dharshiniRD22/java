import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
            System.out.println("enter the weekday number:");
         int days = in.nextInt();
         switch(days){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println(" enter valid weekday number!!!");
         }
        }
    }
}
