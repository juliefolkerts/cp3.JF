// Parent Class: Book
class Book {
    // Attributes
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Accessor Methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Mutator Methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Display Method
    public void display() {
        System.out.println("Book - Title: " + title + ", Author: " + author);
    }
}

// Child Class: Ebook
class Ebook extends Book9 {
    // Additional Attribute
    private String fileName;

    // Constructor
    public Ebook(String title, String author, String fileName) {
        super(title, author); // Call to superclass constructor
        this.fileName = fileName;
    }

    // Accessor Method
    public String getFileName() {
        return fileName;
    }

    // Mutator Method
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Display Method
    @Override
    public void display() {
        System.out.println("Ebook - Title: " + getTitle() + ", Author: " + getAuthor() + ", File Name: " + fileName);
    }
}

// Main Class
public class dc11 {
    public static void main(String[] args) {
        // Create a Book
        Book9 book = new Book9("Pride and Prejudice", "Jane Austen");

        // Create two Ebooks
        Ebook ebook1 = new Ebook("Digital Fortress", "Dan Brown", "digital_fortress.pdf");
        Ebook ebook2 = new Ebook("The Hobbit", "J.R.R. Tolkien", "the_hobbit.epub");

        // Display the Book
        System.out.println("Displaying Book:");
        book.display();

        // Display the Ebooks
        System.out.println("\nDisplaying Ebooks:");
        ebook1.display();
        ebook2.display();

        // Demonstrate accessor and mutator methods for Ebook
        System.out.println("\nUpdating Ebook 1 file name...");
        ebook1.setFileName("digital_fortress_v2.pdf");
        System.out.println("Updated Ebook 1:");
        ebook1.display();
    }
}

