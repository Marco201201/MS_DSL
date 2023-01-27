package audiobook;

public class App {
    public static void main(String[] args) {
        Audiobook audiobook = (new Audiobook("978-3453322462", "Der Splitter der Dämmerung"))
                .author("Brandon Sanderson")
                .pageCount(288)
                .price(13.00);
        System.out.println(audiobook);

    }
}
