public class twosum {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left <= right){
            int result = numbers[left] +numbers[right];
            if(result == target){
                return new int [] {left+1, right+1};
            }

            if(result < target){
                left ++;
            }
            else{
                right--;
            }
        }
        return new int []  {-1,-1};
    }
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = {2, 7, 11, 15, 20};
        int target = 9;
        twosum solution = new twosum();
        int[] result = solution.twoSum(numbers, target);
        System.out.println("The indices of the two numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
    }
}
