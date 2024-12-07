public class Audiobook extends Book9 {
    private int minutes;
    private int seconds;
    public Audiobook(String title, String author, int pages, int minutes, int seconds) {
        super(title, author, pages);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    @Override
    public void display(){
        System.out.printf("This is an audio book titled %s, written by %s, it lasts for %d minutes and %d seconds\n", getTitle(), getAuthor(), this.minutes, this.seconds);
    }
}
