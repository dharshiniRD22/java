import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        System.out.println('a'+'b');// 195
        System.out.println("a"+"b");//ab
        System.out.println("a"+3);//a3
        System.out.println((char)('a'+3));//d
        System.out.println('a'+3);//100
        System.out.println("dharshu"+ new ArrayList<>());//dharshu[]
        System.out.println("dharshu"+ new Integer(56));//dharshu56
    }
}
