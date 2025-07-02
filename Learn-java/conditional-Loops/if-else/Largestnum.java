import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)){
System.out.println("enter num A:");
int A = input.nextInt();
System.out.println("enter num B:");
int B = input.nextInt();
System.out.println("enter num C:");
int C = input.nextInt();
// int max = A;
// if (B>max){
//     max = B;
// }
// if(C>max){
//     max= C;
// }
int max = Math.max(C, Math.max(A, B));
System.out.println("the max number is:"+max);
        }
    }
}
