
import java.util.Arrays;

public class varArg {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,0);
    }
    static void fun(int ...V){
        System.out.println(Arrays.toString(V));
    }
}
