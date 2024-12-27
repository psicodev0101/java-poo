import model.Book;
import model.Librarian;
import model.Library;

public class Main {
    public static void main(String[] args) {

        Librarian librarian = new Librarian("Jose", 25);
        Library library = new Library("Centur", librarian);

        library.addBook(new Book("A metamorfose", "Franz Kafka", "123456789"));
        library.addBook(new Book("Bob", "John Smith", "123456788"));
        library.addBook(new Book("A opiniao e as massas", "Gabriel Tarde", "123456787"));

        library.printBooks();
    }
}
