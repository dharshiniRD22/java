public class FindPeak {
    public int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start< end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        FindPeak solution = new FindPeak();
        int result = solution.findPeakElement(nums);
        System.out.println(result);
    }
}
