public class evendigits {
    public static void main(String[] args) {
        int [] arr = {12,34,56,45567,4367539,376,49736,213};
        System.out.println(findnumbers(arr));
    }
    public static int findnumbers(int [] arr){
        int count =0;
        for(int num :arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num){
        int digit = digits(num);
        if(digit % 2 ==0){
            return true;
        }
            return false;
    }

     static int digits(int num){
        int count =0;
        if(num<0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
