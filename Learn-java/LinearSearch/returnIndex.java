import java.util.Scanner;

public class returnIndex{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter array length:");
        int n = in.nextInt();
        System.out.println(" enter elements of array:");
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(" enter the target element");
        int target = in.nextInt();
        System.out.println(" the target element index is:"+element(arr,target));
    }
    public static int element(int[]arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1 ;
    }
}