// Book Class
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
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Main Class
public class dc10 {
    public static void main(String[] args) {
        // Create two books
        Bookk book1 = new Bookk("To Kill a Mockingbird", "Harper Lee");
        Bookk book2 = new Bookk("The Catcher in the Rye", "J.D. Salinger");

        // Display book information
        System.out.println("Book 1:");
        book1.display();

        System.out.println("Book 2:");
        book2.display();

        // Demonstrate accessor and mutator methods
        System.out.println("\nUpdating Book 1 details...");
        book1.setTitle("To Kill a Mockingbird - Updated");
        book1.setAuthor("Harper Lee (Revised)");

        System.out.println("Updated Book 1:");
        book1.display();
    }
}
