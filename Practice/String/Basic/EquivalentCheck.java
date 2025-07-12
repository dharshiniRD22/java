public class EquivalentCheck {
     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder s1 = new StringBuilder();
       StringBuilder s2 = new StringBuilder();
       for(String w : word1){
        s1.append(w);
       }
       for(String w : word2){
        s2.append(w);
       }
       return s1.toString().equals(s2.toString());
    }
    public static void main(String[] args) {
        EquivalentCheck checker = new EquivalentCheck();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = checker.arrayStringsAreEqual(word1, word2);
        System.out.println(result);
    }
}
