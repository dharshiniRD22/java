import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter the number:");
            int num = input.nextInt();
            int count=0;
            while(num>0)
            {
              int rem = num%10;
              if(rem==3){
                count++;
              }
               num = num / 10;
            }
             System.out.println(count);
        }
    }
}
