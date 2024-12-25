package operators.com;

import java.util.Scanner;

public class LogicalOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (x) : ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (y) : ");
        int y = scanner.nextInt();

        String result = logicalOps(x, y);
        System.out.println(result);


    }

    public static String logicalOps(int x, int y) {
        if (x > 0 && y > 0) {
            return "Both numbers are positive.";
        } else if (x < 0 && y < 0) {
            return "Both numbers are negative.";
        } else if (x == 0 || y == 0) {
            return "One of the numbers is zero.";
        } else {
            return "One of the numbers is negative.";
        }
    }
}
