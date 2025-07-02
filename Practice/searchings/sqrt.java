public class sqrt {
     public int mySqrt(int x) {
        int start =1;
        int end = x/2;
        int ans =0;
        if(x<2){return x;}
        while(start <= end){
            int mid = start +(end-start)/2;
            long square = (long) mid * mid;
            if(square== x){
                ans = mid;
            }
            if(square <  x){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        sqrt solution = new sqrt();
        int x = 8;
        int result = solution.mySqrt(x);
        System.out.println("The square root of " + x + " is: " + result);
    }
}
