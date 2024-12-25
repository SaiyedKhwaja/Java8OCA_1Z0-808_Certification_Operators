package tests;

import operators.com.LogicalOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogicalOperationsTest {

    @Test
    public void testBothPositive() {
        assertEquals("Both numbers are positive.", LogicalOperations.logicalOps(5, 10));
    }

    @Test
    public void testBothNegative() {
        assertEquals("Both numbers are negative.", LogicalOperations.logicalOps(-1, -2));
    }

    @Test
    public void testOneOfZero() {
        assertEquals("One of the numbers is zero.", LogicalOperations.logicalOps(20, 0));
    }

    @Test
    public void testOneNegative() {
        assertEquals("One of the numbers is negative.", LogicalOperations.logicalOps(11, -1));
    }

}
