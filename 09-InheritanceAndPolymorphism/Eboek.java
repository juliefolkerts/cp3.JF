public class Eboek extends Boek {
    private String filename;

    public Eboek(String filename, Writer author, String title,String publisher) {
        super(author, title, publisher);
        this.filename = filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
    public void display(){
        System.out.println("Book type: E-book\nTitle: "+getTitle()+"\n"+getAuthor()+"\nFile name: "+this.filename);
    }

}
