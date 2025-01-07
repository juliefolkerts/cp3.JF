

public class Main {
    public static void main(String[] args) {
        SMS sms1 = new SMS("Sup?", "+31621265815");
        sms1.send();
        SMS sms2 = new SMS(";)", "+31621265816");
        sms2.send();
        Email mail = new Email("Hello", "Greeting", "Ineke J");
        mail.send();
    }
}
