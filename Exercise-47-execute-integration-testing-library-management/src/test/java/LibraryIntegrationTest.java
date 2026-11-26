import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class LibraryIntegrationTest {
    private Library library;   private Book b1, b2, b3;
    @BeforeEach void setUp() {
        library = new Library();
        b1 = new Book("111", "Software Testing"); b2 = new Book("222", "Effective Java");
        b3 = new Book("333", "Exploratory Testing");
        library.addBook(b1); library.addBook(b2); library.addBook(b3);
        library.addMember(new Member("M1"));
    }
    @Test void issueAvailableBook() {
        assertTrue(library.issueBook("M1", "111")); assertFalse(b1.isAvailable());
    }
    @Test void sameBookCannotBeIssuedTwice() {
        assertTrue(library.issueBook("M1", "111")); assertFalse(library.issueBook("M1", "111"));
    }
    @Test void borrowingLimitIsEnforced() {
        assertTrue(library.issueBook("M1", "111")); assertTrue(library.issueBook("M1", "222"));
        assertFalse(library.issueBook("M1", "333"));
    }
    @Test void returnBookMakesItAvailable() {
        library.issueBook("M1", "111");
        assertTrue(library.returnBook("M1", "111")); assertTrue(b1.isAvailable());
    }
    @Test void returnBookNotBorrowedFails() { assertFalse(library.returnBook("M1", "222")); }
    @Test void unknownMemberCannotBorrow() { assertFalse(library.issueBook("M9", "111")); }
}
