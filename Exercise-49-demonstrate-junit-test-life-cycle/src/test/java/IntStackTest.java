import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntStackTest {
    private IntStack stack;
    @BeforeAll static void beforeAll() { System.out.println("@BeforeAll  : test class initialised"); }
    @BeforeEach void setUp() {
        stack = new IntStack();
        System.out.println("  @BeforeEach : new stack created");
    }
    @AfterEach void tearDown() { System.out.println("  @AfterEach  : stack discarded"); }
    @AfterAll static void afterAll() { System.out.println("@AfterAll   : all tests completed"); }
    @Test @Order(1) void pushIncreasesSize() {
        stack.push(10);
        assertEquals(1, stack.size());
    }
    @Test @Order(2) void popReturnsLastPushedElement() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
    }
    @Test @Order(3) void peekDoesNotRemoveElement() {
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(1, stack.size());
    }
    @Test @Order(4) void popOnEmptyStackThrows() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }
}
