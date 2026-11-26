import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private final Calculator calc = new Calculator();
    @Test
    void validDivision() {
        assertEquals(5, calc.divide(10, 2));
    }
    @Test
    void divisionByZeroThrowsException() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}
