import java.util.Scanner;
public class Minmax{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("the max is:");
        System.out.println(max(22,11,33));
        System.out.println(" the in is:");
        System.out.println(min(22,11,33));

    }
    public static int max(int a, int b, int c){
    int max = Math.max(Math.max(a,b),c);
    return max;
    }
    public static int min(int a, int b, int c){
        int min = Math.min(Math.min(a,b),c);
        return min;
    }
}