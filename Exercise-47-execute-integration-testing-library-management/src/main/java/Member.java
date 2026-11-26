import java.util.*;
public class Member {
    public static final int LIMIT = 2;
    private final String id;
    private final List<Book> borrowed = new ArrayList<>();
    public Member(String id) { this.id = id; }
    public String getId() { return id; }   public List<Book> getBorrowed() { return borrowed; }
    public boolean canBorrow() { return borrowed.size() < LIMIT; }
}
