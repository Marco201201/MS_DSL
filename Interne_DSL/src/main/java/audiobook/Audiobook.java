package audiobook;

public class Audiobook {
    private final String isbn;
    private  String titel;
    private double price;
    private String author;
    private int pageCount;


    public Audiobook(String isbn, String titel) {
        this.isbn = isbn;
        this.titel = titel;
    }

    public Audiobook titel(String titel) {
        this.titel = titel;
        return this;
    }

    public Audiobook price(double price) {
        this.price = price;
        return this;
    }

    public Audiobook author(String author) {
        this.author = author;
        return this;
    }

    public Audiobook pageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    @Override
    public String toString() {
        return "Audiobook{" +
                "isbn='" + isbn + '\'' +
                ", titel='" + titel + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
