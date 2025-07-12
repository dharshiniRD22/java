public class StringIsAlike {
     public boolean halvesAreAlike(String s) {
       int mid = s.length()/2;
       String s1 = s.substring(0,mid);
       String s2 = s.substring(mid);
       String vowels = "aeiouAEIOU";
       int count1=0;
       int count2=0;
       for(int i=0; i<s1.length(); i++){
       if (vowels.indexOf(s1.charAt(i)) != -1) {
                count1++;
            }
       }
       for(int i=0; i<s2.length(); i++){
        if (vowels.indexOf(s2.charAt(i)) != -1) {
                count2++;
            }
       }
       return count1 == count2;
    }
    public static void main(String[] args) {
        StringIsAlike sia = new StringIsAlike();
        String input = "bookkeeper";
        boolean result = sia.halvesAreAlike(input);
        System.out.println(result); 
    }
}
