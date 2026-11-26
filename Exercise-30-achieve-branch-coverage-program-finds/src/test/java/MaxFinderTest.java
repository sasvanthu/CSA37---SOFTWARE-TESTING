import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MaxFinderTest {
    @Test
    void aIsLargest() { assertEquals(9, MaxFinder.largest(9, 5, 3)); }
    @Test
    void cIsLargestWhenAGreaterThanB() { assertEquals(9, MaxFinder.largest(5, 3, 9)); }
    @Test
    void bIsLargest() { assertEquals(9, MaxFinder.largest(3, 9, 5)); }
    @Test
    void cIsLargestWhenBGreaterThanA() { assertEquals(9, MaxFinder.largest(3, 5, 9)); }
    @Test
    void allNumbersEqual() { assertEquals(4, MaxFinder.largest(4, 4, 4)); }
}
