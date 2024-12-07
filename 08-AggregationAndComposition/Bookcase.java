
import java.util.ArrayList;

public class Bookcase {
    ArrayList<Bookk> books = new ArrayList<>();

    public void addBookk(Bookk bookk){
        books.add(bookk);
    }
    public void deleteBookk(Bookk bookk){
        books.remove(bookk);
    }
    public void showBookcase(){
        System.out.println("The bookcase contains:");
        for (Bookk bookk : books){
            System.out.println(bookk.getTitle());
        }
    }
    
}
