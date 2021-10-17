package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Thomas Erikson", "IDIÓTÁKKAL KÖRÜLVÉVE");
        book.register("12356");

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());


    }
}
