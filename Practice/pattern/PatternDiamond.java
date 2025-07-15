//*           *
//* *       * *
//* * *   * * *
//* * * * * * *
//* * *   * * *
//* *       * *
//*           *

import java.util.Scanner;
public class PatternDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : 2 * n - i;
            int spaces = 2 * (n - stars);
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}

