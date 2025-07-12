public class substrings {
    public int numOfStrings(String[] patterns, String word) {
       int count =0;
       for(int i=0; i<patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
       } 
       return count;
    }
    public static void main(String[] args) {
        substrings sub = new substrings();
        String[] patterns = {"a", "b", "c"};
        String word = "abcde";
        int result = sub.numOfStrings(patterns, word);
        System.out.println(result); 
    }
} 
