public class Maxinrange {
    public static void main(String[] args) {
        int [] arr ={20, 35, 67,11,21,1,43};
        System.out.println(max(arr,0,5));
    }
    static int max(int[]arr, int start, int end){
        int max = arr[start];
        for(int i =start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
