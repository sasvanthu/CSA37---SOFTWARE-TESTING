import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SortUtilTest {
    @Test void sortsUnsortedArray() {
        assertArrayEquals(new int[]{1, 2, 5, 9}, SortUtil.bubbleSort(new int[]{5, 2, 9, 1}));
    }
    @Test void keepsSortedArrayUnchanged() {
        assertArrayEquals(new int[]{1, 2, 3}, SortUtil.bubbleSort(new int[]{1, 2, 3}));
    }
    @Test void singleElementArray() {
        assertArrayEquals(new int[]{7}, SortUtil.bubbleSort(new int[]{7}));
    }
    @Test void emptyArray() {
        assertArrayEquals(new int[]{}, SortUtil.bubbleSort(new int[]{}));
    }
    @Test void nullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> SortUtil.bubbleSort(null));
    }
}
