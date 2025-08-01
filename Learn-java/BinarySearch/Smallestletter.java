public class Smallestletter {
    // 744(leetcode)
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = Smallestletter(letters, target);
        System.out.println(result);
    }
    public static char Smallestletter(char[] letters, char target){
        int start =0;
         int end = letters.length-1;
         while(start<= end){
            int mid = start +(end-start)/2;
            if(target<mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
         }
         return letters[start%letters.length];
    }
}
