import java.util.Scanner;
public class ShuffleString{
public static String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        return new String(shuffled);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        int n = in.nextInt();
        int[] indices1 = new int[n];
        for(int i=0; i<n; i++){
            indices1[i] = in.nextInt();
        }
        System.out.println(restoreString(s1, indices1));

    }
}