public class minimum {
     public int findMin(int[] nums) {
      int start =0;
      int end = nums.length-1;
      while(start < end){
        int mid = start +(end- start)/2;
        if(nums[mid] > nums[end]){
            start = mid+1;
        }
        else{
            end = mid;
        }
      }
      return nums[start];
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        minimum solution = new minimum();
        int result = solution.findMin(nums);
        System.out.println(result); 
    }
}
