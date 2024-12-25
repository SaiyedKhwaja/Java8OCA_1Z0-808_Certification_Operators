package operators.com;

import java.util.Scanner;

public class SimpleMaths {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (x) : ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (y) : ");
        int y = scanner.nextInt();

        String result = simpleMaths(x, y);

        System.out.println(result);
    }

    public static String simpleMaths(int x, int y) {
        int sum = x + y;
        int product = x * y;
        int difference = x - y;
        double division = (y != 0) ? (double) x / y : 0;

        String result = "The sum of " + x + " and " + y + " is " + sum + "\n" + "The product of " + x + " and " + y + " is " + product + "\n" + "The difference between " + x + " and " + y + " is " + difference + "\n";

        if (y != 0) {
            result += "The division of " + x + " and " + y + " is " + division;
        } else {
            result += "Division by zero is not possible.";
        }

        return result;
    }

}
