import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
            
            System.out.println("enter the number:");
            int n = in.nextInt();
            int original=n;
            int rev=0;
            int i=1;
            while(n>0){
               int rem = n%10;
                n= n/10;
                rev= rev*10+rem;
            }
            System.out.println("the reverse string is:"+rev);
            if(original==rev){
                System.out.println("palindrome!");
            }
            else{
                System.out.println("not palindrome!");
            }
        }
    }
}