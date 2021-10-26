package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java for dummies");
        System.out.println(book.getTitle());
        book.setTitle("Java for dummies extended version");
        System.out.println(book.getTitle());
    }
}
