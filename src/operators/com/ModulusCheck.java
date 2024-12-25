package operators.com;

import java.util.Scanner;

public class ModulusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (x) : ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (y) : ");
        int y = scanner.nextInt();


        boolean result = modulusCheck(x, y);

        System.out.println("Is " + x + " a multiple of " + y + "? " + result);
    }

    public static boolean modulusCheck(int x, int y) {

        if (y == 0) return false;

        return x % y == 0;

    }
}
