import java.util.Arrays;
import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int target = 9;
        System.out.println(Arrays.toString(search(arr,target)));
    }
  public static int [] search(int [][] arr, int target){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j] == target){
                return new int []{i,j};
            }
        }
    }
    return new int []{-1,-1};
  }
}
