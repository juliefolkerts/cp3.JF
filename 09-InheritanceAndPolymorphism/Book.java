public class Book {
    private String author;
    private String title;
    private int pages;
    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }

    public void display(){
        System.out.printf("This is a paper book titled %d the author is %d %\n", this.title, this.author);
    }

    
}
