public class Boek {
    private String title;
    private Writer author;
    private String publisher;

    public Boek(Writer author, String title,String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Writer getAuthor() {
        return author;
    }

    public void display(){
        System.out.println("Book type: paper\nTitle: "+this.title+"\n"+this.author.toString()+"\nPublisher: "+this.publisher);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
