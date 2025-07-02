public class missingK {
      public int findKthPositive(int[] arr, int k) {
        int start =0;
         int end = arr.length-1;
         while(start<=end){
            int mid = start +(end-start)/2;
             int missing= arr[mid] -(mid +1);
            if(missing < k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
         }
          if (start == arr.length) {
        return arr[arr.length - 1] + (k - (arr[arr.length - 1] - arr.length));
    }
    return start + k;
    }
     public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        missingK solution = new missingK();
        int result = solution.findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive integer is: " + result);
    }
}
