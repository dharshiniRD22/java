public class AgonesticBinarysearch {
    public static void main(String[] args) {
        int [] arr ={   1,2,3,4,5,6,7,8,5,4,3,2,1};
        int target =6;
        int result = AgonesticBinarysearch(arr,target);
        System.out.println("Element found at index: " + result);
    }
    public static int AgonesticBinarysearch(int[] arr, int target){
        int start =0;
         int end= arr.length-1;
         boolean isAsc = arr[start]< arr[end];
         while(start<= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid+1;
            }
            }
            else{
               if(arr[mid] > target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid+1;
            } 
            }
         }
         return -1;
    }
}
