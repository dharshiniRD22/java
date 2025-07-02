import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        // for( int num=1; num<=5; num++){
        //     System.out.println(num);
        // }
        try(Scanner in = new Scanner (System.in)){
            System.out.println("enter the number:");
         int num = in.nextInt();
         for ( int n=1; n<=num; n++){
            System.out.println(n);
         }
        }
    }
}

