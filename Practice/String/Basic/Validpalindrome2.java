public class Validpalindrome2 {
    public boolean validPalindrome(String s) {
        int start =0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                return isPalindrome(s,start+1, end) || isPalindrome(s, start, end-1);
            }
        }
        return true;
    }
    public static  boolean isPalindrome( String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start = start +1;
            end = end -1;
        }
        return true;
    }
    public static void main(String[] args) {
        Validpalindrome2 vp = new Validpalindrome2();
        String s = "abca";
        System.out.println(vp.validPalindrome(s)); // Output: true
        s = "racecar";
        System.out.println(vp.validPalindrome(s)); // Output: true
        s = "abc";
        System.out.println(vp.validPalindrome(s)); // Output: false
    }
}

