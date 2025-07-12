public class LowerCase {
     public String toLowerCase(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        LowerCase lc = new LowerCase();
        String input = "Hello World!";
        String result = lc.toLowerCase(input);
        System.out.println(result);
        
    }
}
