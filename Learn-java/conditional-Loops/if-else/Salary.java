import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)){
            System.out.println("enter your salary:");
          int salary = input.nextInt();
          if(salary > 30000){
            salary = salary + 3000;
          }
          else if(salary > 20000){
            salary = salary + 2000;
          }
          else{
            salary = salary + 1000;
          }
          System.out.println(salary);
        }
        
    }
}
