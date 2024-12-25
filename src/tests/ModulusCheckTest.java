package tests;

import operators.com.ModulusCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModulusCheckTest {
    @Test
    public void testIsMultiple() {
        assertTrue(ModulusCheck.modulusCheck(8, 2), "8 should be a multiple of 2");

        assertTrue(ModulusCheck.modulusCheck(15, 3), "15 should be a multiple of 3");
    }

    @Test
    public void testIsNotMultiple() {
        assertFalse(ModulusCheck.modulusCheck(7, 3), "7 should not be a multiple of 3");

        assertFalse(ModulusCheck.modulusCheck(10, 4), "10 should not be a multiple of 4");
    }

    @Test
    public void testDivisionByZero() {
        assertFalse(ModulusCheck.modulusCheck(7, 0), "Division by zero should return false");
    }

    @Test
    public void testXIsZero() {
        assertTrue(ModulusCheck.modulusCheck(0, 5), "0 should be a multiple of 5");

        assertFalse(ModulusCheck.modulusCheck(0, 0), "0 divided by 0 should return false");
    }

    @Test
    public void testXEqualsY() {
        assertTrue(ModulusCheck.modulusCheck(5, 5), "5 should be a multiple of 5");
    }
}
