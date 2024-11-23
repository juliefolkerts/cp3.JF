import java.util.ArrayList;
public class ac15 {
    private ArrayList<String> shoppinglist = new ArrayList<String>();

    //public void setShoppinglist(ArrayList<String> shoppinglist) {
        //this.shoppinglist = shoppinglist;
    //}

    public void displayList(){
        for (String item : this.shoppinglist){
            System.out.println(item);
        }
    }
    public void listLength(){
        System.out.println("Number of items on list: "+this.shoppinglist.size());
    }
    public void add(String item){
        this.shoppinglist.add(item);
    }
    public static void main(String[] args) {
        ac15 boodschappenlijstje = new ac15();
        boodschappenlijstje.displayList();
        boodschappenlijstje.listLength();
        boodschappenlijstje.add("Skyr");
        boodschappenlijstje.add("Marakuja");
        boodschappenlijstje.add("Lody");
        boodschappenlijstje.displayList();
        boodschappenlijstje.listLength();
        boodschappenlijstje.add("Papryka");
        boodschappenlijstje.displayList();
        boodschappenlijstje.listLength();
    }
    
}
