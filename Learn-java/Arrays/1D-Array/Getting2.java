import java.util.Arrays;
import java.util.Scanner;
public class Getting2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[]arr = new String[5];
        for(int i=0;i<arr.length; i++){
            arr[i]= in.next();
             arr[1] = "kunal";
        }
        System.out.println(Arrays.toString(arr));

    }
}
