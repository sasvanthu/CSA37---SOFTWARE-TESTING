import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorEPTest {
    private final Calculator calc = new Calculator();
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"5,3,8", "-5,-3,-8", "5,-3,2", "0,0,0"})
    void addEquivalenceClasses(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }
    @Test
    void divideValidClass() {
        assertEquals(4, calc.divide(20, 5));
    }
    @Test
    void divideInvalidClassZeroDivisor() {
        assertThrows(ArithmeticException.class, () -> calc.divide(20, 0));
    }
}
