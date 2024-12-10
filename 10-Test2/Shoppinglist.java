
import java.util.ArrayList;
import java.util.Arrays;


public class Shoppinglist {
    private ArrayList<Product> list;

    public Shoppinglist(ArrayList<Product> list) {
        this.list = list;
    }

    public void add(Product product){
        list.add(product);
    }
    public String toString(){
        ArrayList<String> answer = new ArrayList<>();
        for (Product p : list){
            answer.add(p.getName());
        }
        return Arrays.toString(answer);
    }
    public int total(){
        int count = 0;
        for (Product p : list){
            count += p.getQuantity();
        }
        return count;
    }
    
}


