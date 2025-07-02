import java.util.Scanner;
public class palindrom {
 public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    System.out.println(palindrome(n));
 }   
 static boolean palindrome(int n){
    int original = n;
    int rev =0;
       while(n>0){int rem = n%10;
       n = n/10;
       rev =rev*10+rem;}
       if(original == rev){
        return true;
       }
       else{
        return false;
       }
    }
 }

