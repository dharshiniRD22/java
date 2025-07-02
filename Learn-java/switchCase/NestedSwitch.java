import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
         System.out.println(" enter a employe ID:");
         int empId = in.nextInt();
         System.out.println(" enter a department:");
         String department = in.next();
         switch(empId){
            case 1 -> System.out.println("dharshini");
            case 2 -> System.out.println("nishi");
            case 3 -> {System.out.println(" sabari");
            switch(department){
                case "IT" -> System.out.println("IT department");
                case "management" -> System.out.println("management department");
                default -> System.out.println("no department entered");
            }}
            default -> System.out.println("enter the correct empId!!!");
         }
        }
    }
}
