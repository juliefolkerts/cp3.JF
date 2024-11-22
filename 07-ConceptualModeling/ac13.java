public class ac13 {
    private String title;
    private String author;
    private String genre;
    private double price;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        if (genre == "crime" || genre == "fantasy"  || genre == "drama" || genre == "science fiction"){
            this.genre = genre;
        } else {
            System.out.println("inconsistent genre");
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean is_long(){
        boolean answer = false;
        if (this.pages > 1000){
            answer = true;
        }
        return answer;
    }
}
