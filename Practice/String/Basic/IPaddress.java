//1108. Defanging an IP Address


import java.util.Scanner;
class IPaddress {
    public static  String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(defangIPaddr(input));
    }
}