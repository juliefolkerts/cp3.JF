

public class Main {
    public static void main(String[] args) {
        Writer w = new Writer(63,"Grunbergen", "Arnon");
        Bookk b = new Bookk(w);
        Bookcase kast = new Bookcase();
        b.setTitle("Tirza");
        System.out.println(b.toString());
        kast.addBookk(b);
        kast.showBookcase();
        kast.deleteBookk(b);
        kast.showBookcase();

    }
}
