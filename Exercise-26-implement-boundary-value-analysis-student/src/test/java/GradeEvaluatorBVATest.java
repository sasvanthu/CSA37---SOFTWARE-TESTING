import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class GradeEvaluatorBVATest {
    @ParameterizedTest(name = "marks {0} -> grade {1}")
    @CsvSource({"0,F", "49,F", "50,E", "59,E", "60,D", "69,D",
                "70,C", "79,C", "80,B", "89,B", "90,A", "100,A"})
    void validBoundaryValues(int marks, String expected) {
        assertEquals(expected, GradeEvaluator.grade(marks));
    }
    @ParameterizedTest(name = "invalid marks {0}")
    @ValueSource(ints = {-1, 101})
    void invalidBoundaryValues(int marks) {
        assertThrows(IllegalArgumentException.class, () -> GradeEvaluator.grade(marks));
    }
}
