import java.util.Scanner;
public class Boolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter the length of the array:");
        int n = in.nextInt();
        System.out.println(" enter the elements of the array:");
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(" enter the target:");
        int target = in.nextInt();
        System.out.println(element(arr, target));

    }
    public static boolean  element(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
