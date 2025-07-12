public class reverseString {
    public String reverseWords(String s) {
       String [] words = s.split(" ");
       StringBuilder result= new StringBuilder();
       for(String word : words){
        StringBuilder reversed = new StringBuilder(word);
        result.append(reversed.reverse().toString()).append(" ");
       }
       return result.toString().trim();
       }
       public static void main(String[] args) {
        reverseString rs = new reverseString();
        String input = "Hello World";
        String output = rs.reverseWords(input);
        System.out.println(output); 
       }
}

