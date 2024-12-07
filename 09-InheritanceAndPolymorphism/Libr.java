
import java.util.ArrayList;

public class Libr {
    ArrayList<Book9> books = new ArrayList<>();

    public Libr(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book9 book){
        books.add(book);
    }
    public void deleteBook(Book9 book){
        books.remove(book);
    }
    //@Override
    public void display(){
        System.out.println("The library contains:");
        for (Book9 book : books){
            System.out.println(book.getTitle());
        }
    }
}
