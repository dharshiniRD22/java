import java.util.Arrays;
import java.util.Scanner;
public class charsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         String name = "kunal";
         char target = 'f';
         System.out.println(search(name, target));
         System.out.println(Arrays.toString(name.toCharArray()));
    }
    public static boolean search(String name , char target){
      if(name.length() ==0){
        return false;
      }
      for(int i=0; i<name.length(); i++){
        if(target == name.charAt(i)){
            return true;
        }
      }
      return false;
    }
}
