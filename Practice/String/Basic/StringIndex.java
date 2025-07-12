public class StringIndex {
      public int strStr(String haystack, String needle) {
       if(needle.isEmpty()){
        return 0;
       }
       int haystack1 = haystack.length();
       int needle1 = needle.length();
       for(int i=0; i<= haystack1 - needle1; i++){
        if(haystack.substring(i, i+needle1).equals(needle)){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        StringIndex si = new StringIndex();
        String haystack = "a";
        String needle = "a";
        int result = si.strStr(haystack, needle);
        System.out.println("The index of the first occurrence of '" + needle + "' in '" + haystack + "' is: " + result);
    }
}
