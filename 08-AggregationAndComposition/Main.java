public class Main {
    public static void main(String[] args) {
        Writer w = new Writer(63,"Grunbergen", "Arnon");
        Book b = new Book(w);
        b.setTitle("Tirza");
        System.out.println(b.toString());
    }
}
