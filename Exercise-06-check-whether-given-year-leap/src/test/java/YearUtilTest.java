import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class YearUtilTest {
    @Test
    void yearDivisibleBy4IsLeap() { assertTrue(YearUtil.isLeapYear(2024)); }
    @Test
    void centuryYearIsNotLeap() { assertFalse(YearUtil.isLeapYear(1900)); }
    @Test
    void centuryYearDivisibleBy400IsLeap() { assertTrue(YearUtil.isLeapYear(2000)); }
    @Test
    void ordinaryYearIsNotLeap() { assertFalse(YearUtil.isLeapYear(2023)); }
}
