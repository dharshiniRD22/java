public class Comparison {
    public static void main(String[] args) {
        String a = "dharshu";
        String b = " dharshu";
        String c = a;
        System.out.println(a==c);
        String name1 = new String("dharshu");
        String name2 = new String("dharshu");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
