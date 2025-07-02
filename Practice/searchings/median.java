
import java.util.Arrays;
public class median {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   int[] nums = new int[nums1.length + nums2.length];
for (int i = 0; i < nums1.length; i++) {
    nums[i] = nums1[i];
}
for (int i = 0; i < nums2.length; i++) {
    nums[nums1.length + i] = nums2[i];
}
Arrays.sort(nums);
int mid = nums.length / 2;
if (nums.length % 2 == 0) {
    return (nums[mid - 1] + nums[mid]) / 2.0;
} else {
    return nums[mid];
}
   }
     public static void main(String[] args) {
         int[] nums1 = {1, 3};
         int[] nums2 = {2};
         median solution = new median();
         double result = solution.findMedianSortedArrays(nums1, nums2);
         System.out.println(result);
     }
    }