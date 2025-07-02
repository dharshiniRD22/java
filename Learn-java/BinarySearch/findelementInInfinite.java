public class findelementInInfinite {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18, 20, 22, 24, 26, 28, 30};
        int target =16;
        int result = ans(arr, target);
        System.out.println(result);
    }
    public static int ans(int[] arr, int target){
        int start =0;
        int end = 1;
        while(target> arr[end]){
            int temp = end+1;
            end = end +( end - start +1)*1;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int [] arr, int target, int start, int end){
        while(start<= end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target> arr[ mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
