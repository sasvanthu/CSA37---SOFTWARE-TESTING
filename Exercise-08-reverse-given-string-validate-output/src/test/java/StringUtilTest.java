import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtilTest {
    @Test
    void reverseOfWord() {
        String result = StringUtil.reverse("hello");
        assertNotNull(result);
        assertEquals("olleh", result);
    }
    @Test
    void emptyStringAndPalindrome() {
        assertEquals("", StringUtil.reverse(""));
        assertEquals("madam", StringUtil.reverse("madam"));
    }
    @Test
    void nullInputReturnsNull() {
        assertNull(StringUtil.reverse(null));
    }
}
