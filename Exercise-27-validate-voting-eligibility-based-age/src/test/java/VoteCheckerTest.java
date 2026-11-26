import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class VoteCheckerTest {
    @ParameterizedTest(name = "age {0} -> eligible {1}")
    @CsvSource({"0,false", "17,false", "18,true", "19,true", "120,true"})
    void validAges(int age, boolean expected) {
        assertEquals(expected, VoteChecker.isEligible(age));
    }
    @ParameterizedTest(name = "invalid age {0}")
    @ValueSource(ints = {-1, 121})
    void invalidAges(int age) {
        assertThrows(IllegalArgumentException.class, () -> VoteChecker.isEligible(age));
    }
}
