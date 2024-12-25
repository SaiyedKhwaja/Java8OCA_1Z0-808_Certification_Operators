package operators.com;

public class IncrDecr {

    public static void main(String[] args) {
        int x = 0, w = 0, y = 0, z = 0;
        x = 4; // Set x to 4

        System.out.println("Increment/Decrement Demonstration:");
        System.out.println(++x);  // Pre-increment: x is incremented, then printed
        System.out.println(x++);  // Post-increment: x is printed, then incremented
        System.out.println(x);    // Now x has been incremented twice
        System.out.println(--x);  // Pre-decrement: x is decremented, then printed
        System.out.println(x--);  // Post-decrement: x is printed, then decremented
        System.out.println(x);    // Now x has been decremented twice

        // Second block: Logical operators
        w = 20;
        x = 10;
        y = -5;
        z = 0;

        System.out.println("\nLogical Operators Demonstration:");
        System.out.println(w == x && y != z);  // Checks if both conditions are true (AND)
        System.out.println(w == x || y != z);  // Checks if at least one condition is true (OR)
        System.out.println(!(w == (x + z)));  // Negates the comparison (NOT)
    }
}
