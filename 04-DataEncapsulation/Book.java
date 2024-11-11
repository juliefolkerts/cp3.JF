//04-DataEncapsulation;

public class Book {
    private String title;
    private int pages;

    public Book(){
        this.title = title;
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages >= 0){
            this.pages = pages;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
    @Override
    public String toString(){
        return "Amount of pages: "+this.pages;
    }

}
