import java.util.ArrayList;
import java.util.List;

// Parent Class: Book
class Book {
    protected String title;
    protected String author;
    protected int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void read() {
        System.out.println("Reading the book: " + title);
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", Pages: " + pages;
    }
}

// Child Class: Ebook
class Ebook extends Book {
    private int fileSize; // in MB
    private String format; // e.g., PDF, EPUB

    public Ebook(String title, String author, int pages, int fileSize, String format) {
        super(title, author, pages);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void read() {
        System.out.println("Reading the ebook: " + title + " in format: " + format);
    }

    @Override
    public String toString() {
        return super.toString() + ", File Size: " + fileSize + "MB, Format: " + format;
    }
}

// Child Class: Audiobook
class Audiobook extends Book {
    private String narrator;
    private double length; // in hours

    public Audiobook(String title, String author, int pages, String narrator, double length) {
        super(title, author, pages);
        this.narrator = narrator;
        this.length = length;
    }

    @Override
    public void read() {
        System.out.println("Listening to the audiobook: " + title + ", narrated by: " + narrator);
    }

    @Override
    public String toString() {
        return super.toString() + ", Narrator: " + narrator + ", Length: " + length + " hours";
    }
}

// Library Class
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.title + " added to the library.");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book.title + " removed from the library.");
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main Class
public class dc9 {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", 328);
        Ebook ebook1 = new Ebook("The Great Gatsby", "F. Scott Fitzgerald", 180, 5, "PDF");
        Audiobook audiobook1 = new Audiobook("Becoming", "Michelle Obama", 400, "Michelle Obama", 19.5);

        // Add books to the library
        library.addBook(book1);
        library.addBook(ebook1);
        library.addBook(audiobook1);

        // Display library books
        library.displayBooks();

        // Simulate reading
        book1.read();
        ebook1.read();
        audiobook1.read();
    }
}
