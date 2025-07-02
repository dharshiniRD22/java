import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius:");
        double r = in.nextFloat();
        System.out.println(" the area of circle is:");
        System.out.println(area(r));
        System.out.println(" the circumference of circle is:");
        System.out.println(cir(r));
    }
    static double area (double  r){
     double area = Math.PI *r*r;
     return area;
    }
    static double cir(double r){
        double d = 2*r;
        double cir = Math.PI*d;
        return cir;
    }
}
