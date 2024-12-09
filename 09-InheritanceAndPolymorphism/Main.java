//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book9 book1 = new Book9("Harper Lee", "To Kill a Mockingbird", 324);
        Audiobook audio1 = new Audiobook(book1.getAuthor(), book1.getTitle(), book1.getPages(), 100, 44);
        Ebook ebook1 = new Ebook(book1.getAuthor(), book1.getTitle(),book1.getPages(), "E-Book-1.pdf");
        Book9 book2 = new Book9("John Doe", "The Great Gatsby", 180);
        Audiobook audio2 = new Audiobook(book2.getAuthor(), book2.getTitle(),book2.getPages(), 0, 0);
        Ebook ebook2 = new Ebook(book2.getAuthor(), book2.getTitle(),book2.getPages(), "E-Book-2.pdf");


        Libr library = new Libr();

        library.addBook(book1);
        library.addBook(audio1);
        library.addBook(audio2);
        library.addBook(ebook1);
        library.addBook(ebook2);
        audio1.display();
        library.display();
        //library.addBook(book2);


    }
}