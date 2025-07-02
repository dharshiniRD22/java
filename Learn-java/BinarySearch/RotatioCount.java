public class RotatioCount {
    public static void main(String[] args) {
       int [] arr = {4,5,6,7,0,1,2} ;
       System.out.println(count(arr));
    }
    public static int pivot(int [] arr){
        int s =0;
        int e = arr.length-1;
        while(s<= e){
            int m = s+(e-s)/2;
            if(e > m && arr[m] > arr[m+1]){
                return m;
            }
            if( s < m && arr[m] < arr[m-1]){
                return m-1;
            }
            if(arr[m] <= arr[s]){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return -1;
    }

    public static int count (int [] arr){
        int pivot = pivot(arr);
        return pivot +1;
    }
}
