public class Bookk {
    Writer writer;
    private String title;
    private int pages;
    private String genre;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String getGenre() {
        return genre;
    }

    public Bookk(Writer writer){
        this.writer = writer;
    }
    

    public Bookk(Writer writer, String title, int pages) {
        this.writer = writer;
        this.title = title;
        this.pages = pages;
    }
    @Override
    public String toString(){
        return "Title: "+this.title+"\n"+this.writer.toString();
    }


}
