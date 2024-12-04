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

// Child Class: Audiobook
class Audiobook extends Book {
    // Additional Attributes
    private int minutes;
    private int seconds;

    // Constructor
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author); // Call to superclass constructor
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Accessor Methods
    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Mutator Methods
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Display Method
    @Override
    public void display() {
        System.out.println("Audiobook - Title: " + getTitle() + ", Author: " + getAuthor() 
                + ", Duration: " + minutes + " minutes " + seconds + " seconds");
    }
}

// Main Class
public class dc12 {
    public static void main(String[] args) {
        // Create a Book
        Book book = new Book("1984", "George Orwell");

        // Create two Audiobooks
        Audiobook audiobook1 = new Audiobook("Becoming", "Michelle Obama", 1140, 30);
        Audiobook audiobook2 = new Audiobook("The Subtle Art of Not Giving a F*ck", "Mark Manson", 270, 45);

        // Display the Book
        System.out.println("Displaying Book:");
        book.display();

        // Display the Audiobooks
        System.out.println("\nDisplaying Audiobooks:");
        audiobook1.display();
        audiobook2.display();

        // Demonstrate accessor and mutator methods for Audiobook
        System.out.println("\nUpdating Audiobook 2 duration...");
        audiobook2.setMinutes(275);
        audiobook2.setSeconds(50);
        System.out.println("Updated Audiobook 2:");
        audiobook2.display();
    }
}
