public class floor {
    public static void main(String[] args) {
        int[] arr = { 2,3,5,9,14,16,18};
        int target = 15;
        int result = floor(arr, target);
        System.out.println("The Floor of the target is at index: " + result);
    }
    public static int floor(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] < target) {
            start = mid + 1;
        } else if (arr[mid] > target) {
            end = mid - 1;
        } else {
            return mid; 
        }
    }
    if (end >= 0) {
        return end;
    } else {
        return -1;
    }
}
}

