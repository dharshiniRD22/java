public class nonduplicatenumber {
    public static int nonDuplicate(int[] arr){
        int start =0;
         int end = arr.length-1;
         while(start < end){
            int mid = start +(end- start)/2;
            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                start = mid+2;
            }
            else{
                end = mid;
            }
         }
         return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int result = nonDuplicate(arr);
        System.out.println("The non-duplicate number is: " + result);
    }
}
