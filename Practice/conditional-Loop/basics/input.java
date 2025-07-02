import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while (true) {  
             int n= in.nextInt();
            sum = sum + n;
        if(n==0){
            break;
        }
    }
     System.out.println(sum);
    in.close();
}
}