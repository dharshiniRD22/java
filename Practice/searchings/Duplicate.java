public class Duplicate {
     public int findDuplicate(int[] nums) {
     int start =0;
      int end = nums.length-1;
      while(start < end){
        int mid = start +(end - start )/2;
        int count =0;
        for(int num :nums){
            if(num <= mid){
                count++;
            }
        }
      if(count > mid){
        end = mid;
      }
      else{
        start = mid+1;
      }
      }   
      return start;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        Duplicate solution = new Duplicate();
        int result = solution.findDuplicate(nums);
        System.out.println(result);
    }
}
