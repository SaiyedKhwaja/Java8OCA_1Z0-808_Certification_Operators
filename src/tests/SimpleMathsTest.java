package tests;

import operators.com.SimpleMaths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathsTest {
    @Test
    public void testBothPositive() {
        String result = SimpleMaths.simpleMaths(3, 5);
        String expected = "The sum of 3 and 5 is 8\n"
                + "The product of 3 and 5 is 15\n"
                + "The difference between 3 and 5 is -2\n"
                + "The division of 3 and 5 is 0.6";
        assertEquals(expected, result);

    }

    @Test
    public void testBothNegative() {
        String result = SimpleMaths.simpleMaths(-3, -5);
        String expected = "The sum of -3 and -5 is -8\n"
                + "The product of -3 and -5 is 15\n"
                + "The difference between -3 and -5 is 2\n"
                + "The division of -3 and -5 is 0.6";
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeAndPositive() {
        String result = SimpleMaths.simpleMaths(4, -6);
        String expected = "The sum of 4 and -6 is -2\n"
                + "The product of 4 and -6 is -24\n"
                + "The difference between 4 and -6 is 10\n"
                + "The division of 4 and -6 is -0.6666666666666666";
        assertEquals(expected, result);
    }

    @Test
    public void testOneZero() {
        String result = SimpleMaths.simpleMaths(7, 0);
        String expected = "The sum of 7 and 0 is 7\n"
                + "The product of 7 and 0 is 0\n"
                + "The difference between 7 and 0 is 7\n"
                + "Division by zero is not possible.";
        assertEquals(expected, result);
    }
}
