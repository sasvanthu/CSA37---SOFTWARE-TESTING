import java.util.*;
public class Library {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();
    public void addBook(Book b) { books.put(b.getIsbn(), b); }
    public void addMember(Member m) { members.put(m.getId(), m); }
    public boolean issueBook(String memberId, String isbn) {
        Member m = members.get(memberId); Book b = books.get(isbn);
        if (m == null || b == null || !b.isAvailable() || !m.canBorrow()) return false;
        b.setAvailable(false); m.getBorrowed().add(b); return true;
    }
    public boolean returnBook(String memberId, String isbn) {
        Member m = members.get(memberId); Book b = books.get(isbn);
        if (m == null || b == null || !m.getBorrowed().remove(b)) return false;
        b.setAvailable(true); return true;
    }
}
