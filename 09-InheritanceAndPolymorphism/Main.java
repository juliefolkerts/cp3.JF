//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //private Book[] books;
        Library library = new Library(5);

        Bookk book = new Bookk("1984", "George" ,6);

        Ebook ebook1 = new Ebook("Digital Fortress", "Dan Brown", 7,"digital_fortress.pdf");
        Ebook ebook2 = new Ebook("The Hobbit", "J.R.R. Tolkien", 77,  "the_hobbit.epub");

        Audiobook audiobook1 = new Audiobook("Becoming", "Michelle Obama", 6000, 1140, 30);
        Audiobook audiobook2 = new Audiobook("The Subtle Art of Not Giving a F*ck",  "Mark Manson",23900339,  270, 45);

        library.addBook(book);
        library.addBook(ebook1);
        library.addBook(ebook2);
        library.addBook(audiobook1);
        library.addBook(audiobook2);
    }

    
}
