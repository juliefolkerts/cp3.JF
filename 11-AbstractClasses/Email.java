

public class Email extends Message {
    private String subject;
    private String recipient;
    public Email(String subject, String recipient) {
        this.subject = subject;
        this.recipient = recipient;
    }
    public Email(String t, String subject, String recipient) {
        super(t);
        this.subject = subject;
        this.recipient = recipient;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getSubject() {
        return subject;
    }
    public String getRecipient() {
        return recipient;
    }

    @Override
    public void send(){
        System.out.println("Recipient: "+getRecipient());
        System.out.println("Subject: "+getSubject());
        System.out.println("Content: "+getText());
    }
}
