import java.util.Scanner;
public class circle{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the radius of circle:");
        Double radius = in.nextDouble();
        if(radius<0){
            System.out.println("invalid");
        }
        else{
            Double result = Math.PI*radius*radius;
            System.out.println("the area of circle is:"+result);
        }
    }
}