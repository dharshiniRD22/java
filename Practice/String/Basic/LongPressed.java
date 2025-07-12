public class LongPressed {
    public boolean isLongPressedName(String name, String typed) {
       int i=0;
       int j=0;
       while(j <typed.length()){
        if (i < name.length() && name.charAt(i) == typed.charAt(j)){
            i++;
            j++;
        }
        else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
        j++;
        }
        else{
            return false;
        }
       }
    return (i == name.length());
    }
    public static void main(String[] args) {
        LongPressed lp = new LongPressed();
        String name = "alex";
        String typed = "aaleex";
        boolean result = lp.isLongPressedName(name, typed);
        System.out.println(result);
    }
}

