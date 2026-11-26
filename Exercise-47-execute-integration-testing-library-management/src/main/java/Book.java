public class Book {
    private final String isbn, title;
    private boolean available = true;
    public Book(String isbn, String title) { this.isbn = isbn; this.title = title; }
    public String getIsbn() { return isbn; }   public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
