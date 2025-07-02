import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n ; i++){
            arr[i] = in.nextInt(); 
        }
        System.out.println("the minimum value is:");
        System.out.println(min(arr));
    }
    public static int min (int [] arr){
        int min = arr[0];
        for(int i=0; i<arr.length ;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
