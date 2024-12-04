public class Ebook extends Book {
    private String filename;

    public Ebook(String title, String author, int pages,String filename) {
        super(title, author,pages);
        this.filename = filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }


    @Override
    public void display(){
        System.out.printf("This is an E-book titled %s, written by %s, the file is named %s", getTitle(), getAuthor(), this.filename);
    }
}
