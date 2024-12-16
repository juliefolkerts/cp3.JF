//package 11-AbstractClasses;

public abstract class Message {
    String text;

    Message() {
        text = "";
    }
    Message(String txt){
        text = txt;
    }
    public int charNumber(){
    }
    public abstract void send(){
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    
    
}
