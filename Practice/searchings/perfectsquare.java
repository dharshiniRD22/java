class perfectsquare {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int start =1;
        int end = num/2;
        while(start <= end){
            int mid = start +(end-start)/2;
            long result = (long)mid*mid;
            if(result == num){
                return true;
            }
            if(result > num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
return false;
    }

    public static void main(String[] args) {
        int num =16;
        perfectsquare ps = new perfectsquare();
        boolean result = ps.isPerfectSquare(num);
        System.out.println(result);
    }

}