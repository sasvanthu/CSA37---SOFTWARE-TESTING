import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeUtilTest {
    @Test
    void primeNumbers() {
        assertTrue(PrimeUtil.isPrime(2));
        assertTrue(PrimeUtil.isPrime(3));
        assertTrue(PrimeUtil.isPrime(17));
    }
    @Test
    void compositeNumbers() {
        assertFalse(PrimeUtil.isPrime(4));
        assertFalse(PrimeUtil.isPrime(25));
        assertFalse(PrimeUtil.isPrime(100));
    }
    @Test
    void numbersLessThanTwo() {
        assertFalse(PrimeUtil.isPrime(1));
        assertFalse(PrimeUtil.isPrime(0));
        assertFalse(PrimeUtil.isPrime(-7));
    }
}
