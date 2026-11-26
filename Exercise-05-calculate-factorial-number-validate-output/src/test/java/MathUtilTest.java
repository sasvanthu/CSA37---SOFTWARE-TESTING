import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathUtilTest {
    @Test
    void factorialOfZero() { assertEquals(1, MathUtil.factorial(0)); }
    @Test
    void factorialOfOne() { assertEquals(1, MathUtil.factorial(1)); }
    @Test
    void factorialOfFive() { assertEquals(120, MathUtil.factorial(5)); }
    @Test
    void factorialOfTen() { assertEquals(3628800, MathUtil.factorial(10)); }
    @Test
    void negativeNumberThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.factorial(-3));
    }
}
