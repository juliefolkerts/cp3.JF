// Library Class
class Library {
    private Book[] books; // Array to store books
    private int count; // Tracks the number of books in the library

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println(book.getTitle() + " added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayLibraryContents() {
        System.out.println("\nLibrary Contents:");
        for (int i = 0; i < count; i++) {
            books[i].display(); // Calls the specific `display()` method of the object
        }
    }
}

// Main Class
public class dc13 {
    public static void main(String[] args) {
        // Create a Library with capacity for 5 books
        Library library = new Library(5);

        // Create a Book
        Book book = new Book("1984", "George Orwell");

        // Create two Ebooks
        Ebook ebook1 = new Ebook("Digital Fortress", "Dan Brown", "digital_fortress.pdf");
        Ebook ebook2 = new Ebook("The Hobbit", "J.R.R. Tolkien", "the_hobbit.epub");

        // Create two Audiobooks
        Audiobook audiobook1 = new Audiobook("Becoming", "Michelle Obama", 1140, 30);
        Audiobook audiobook2 = new Audiobook("The Subtle Art of Not Giving a F*ck", "Mark Manson", 270, 45);

        // Add all books to the library
        library.addBook(book);
        library.addBook(ebook1);
        library.addBook(ebook2);
        library.addBook(audiobook1);
        library.addBook(audiobook2);

        // Display the contents of the library
        library.displayLibraryContents();
    }
}
