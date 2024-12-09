public class Audioboek extends Boek{
    private int minutes;
    private int seconds;

    public Audioboek(int minutes, int seconds, Writer author, String title, String publisher) {
        super(author, title, publisher);
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

    public void display(){
        System.out.println("Book Type: Audio\nTitle: "+getTitle()+"\n"+getAuthor()+"\nDuration: "+this.minutes+" minutes and "+this.seconds+" seconds");
    }
}
