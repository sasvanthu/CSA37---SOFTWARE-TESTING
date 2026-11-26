import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FareCalculatorTest {
    @Test
    void fareForTenKm() {
        DistanceService stub = (from, to) -> 10;          // stub
        FareCalculator calculator = new FareCalculator(stub);
        assertEquals(170, calculator.fare("Chennai", "Tambaram"));
    }
    @Test
    void fareForZeroKm() {
        FareCalculator calculator = new FareCalculator((from, to) -> 0);
        assertEquals(50, calculator.fare("Guindy", "Guindy"));
    }
    @Test
    void invalidDistanceThrows() {
        FareCalculator calculator = new FareCalculator((from, to) -> -5);
        assertThrows(IllegalStateException.class, () -> calculator.fare("A", "B"));
    }
}
