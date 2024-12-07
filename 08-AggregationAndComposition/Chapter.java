public class Chapter {
    Bookk bookk;
    private int number;
    private String title;
    public int getNumber() {
        return number;
    }
    public String getTitle() {
        return title;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Chapter(Bookk bookk){
        this.bookk = bookk;
    }
    
    @Override
    public String toString(){
        return String.format("Chapter %s, %s\n",this.number,this.title);
    }


}
