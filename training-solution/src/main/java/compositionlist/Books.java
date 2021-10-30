package compositionlist;

import objects.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void addBook(String title){
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }

    public void findBookAndSetAuthor(String title, String author){
        if (titles.contains(title)){
            int index = title.indexOf(title);
            titles.set(index,author + ": "+ title);
        }
    }

    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány könyvcímet szeretne eltárolni?");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i =0; i<number;i++){
            System.out.println("Add meg az " + (i+1) + ". könyv címét");
            String title = scanner.nextLine();
            books.addBook(title);
        }
        System.out.println(books.getTitles());
        System.out.println();

        System.out.println("Írja be a könyv címét amihez írót szeretne rögzíteni:");
        String titleAndAuthor = scanner.nextLine();
        System.out.println("Adja megy a szerzőt:");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(titleAndAuthor, author);

        System.out.println(books.getTitles());
    }
}
