import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
public class CompoundInterestTest {
    @ParameterizedTest(name = "P={0}, R={1}%, N={2} -> CI={3}")
    @CsvSource({"1000,10,1,100.00", "1000,10,2,210.00",
                "5000,8,3,1298.56", "2000,5,0,0.00"})
    void computesInterest(double p, double r, int n, double expected) {
        assertEquals(expected, CompoundInterest.interest(p, r, n), 0.01);
    }
    @Test
    void negativePrincipalThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> CompoundInterest.interest(-1000, 10, 2));
    }
}
