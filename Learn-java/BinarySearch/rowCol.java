
import java.util.Arrays;

public class rowCol {
    public static int[] answer (int[][] matrix, int target){
        int row = 0;
         int col = matrix[0].length-1;
         while(row < matrix.length && col >=0){
            if(matrix[row][col] == target){
                return new int [] {row, col};
            }
            if(matrix[ row] [ col] > target){
                col--;
            }
            else{
                row++;
            }
         }
         return new int [] {-1, -1};
    }

    public static void main(String[] args) {
        int [][] matrix= {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 37;
        int [] result = answer(matrix, target);
        System.out.println(Arrays.toString(result));
    }}

