import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = in.nextInt();
        vote(age);
        
    }
    public static void vote(int n){
        if(n>= 18){
            System.out.println(" your are eligible!");
        }
        else{
            System.out.println(" you are not eligible!");
        }
    }
}
