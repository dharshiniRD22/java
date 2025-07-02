import java.util.Scanner;
public class Even{
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
           int N = in.nextInt();
           if(N%2==0){
          System.out.println("even");
           }
           else{
            System.out.println("odd");
           }
        }
    }
}