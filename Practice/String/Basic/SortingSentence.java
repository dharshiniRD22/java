import java.util.Scanner;
public class SortingSentence {
     public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int len = word.length();
            int pos = Character.getNumericValue(word.charAt(len - 1)) - 1;
            result[pos] = word.substring(0, len - 1);
        }
        return String.join(" ", result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SortingSentence sorter = new SortingSentence();
        String input = in.next();
        String output = sorter.sortSentence(input);
        System.out.println(output);
    }
}
