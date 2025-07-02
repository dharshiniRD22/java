import java.util.Arrays;
import java.util.Scanner;
public class passby {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int []arr){
        arr[0] = 99;
    }
}
