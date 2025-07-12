public class MaxRepeat {
    public int maxRepeating(String sequence, String word) {
        int k=1;
       String repeated = word;
        while(sequence.contains(repeated)){
            k = k+1;
            repeated = repeated+word;
        }
        return k-1;
    }
    public static void main(String[] args) {
        MaxRepeat mr = new MaxRepeat();
        String sequence = "ababcababcababc";
        String word = "ababc";
        System.out.println(mr.maxRepeating(sequence, word)); // Output: 3
    }
}

