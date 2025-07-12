//1773
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class countItems {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<List<String>> items = new ArrayList<>();
        for( int i=0; i<n; i++){
            String line = in.nextLine();
            String [] parts = line.split(" ");
            items.add(Arrays.asList(parts));
        }
        String rulekey = in.next();
        String rulevalue = in.next();
        int count = countMatches(items, rulekey, rulevalue);
        System.out.println(count);
     }
    public static int countMatches(List <List<String>> items, String rulekey, String rulevalue)
     {
        int index = 0;
        if (rulekey.equals("color")) index = 1;
        else if (rulekey.equals("name")) index = 2;

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(rulevalue)) {
                count++;
            }
        }
        return count;
    }
}
