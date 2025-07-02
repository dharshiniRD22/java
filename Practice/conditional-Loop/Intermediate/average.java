import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println("enter the numbers(N)"+i+":");
             int num=in.nextInt();
            sum=sum+num;
        }
        Double average = (double) sum / n;
        System.out.println(average);
    }
}
