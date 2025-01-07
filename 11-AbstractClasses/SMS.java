public class SMS extends Message{
    private User person;

    public SMS(String t, User person) {
        super(t);
        this.person = person;
    }

    public void setPhonenum(User person) {
        this.person = person;
    }

    public String getPhonenum() {
        return person.getPhonenumber();
    }
    @Override
    public void send(){
        System.out.println("Number: "+getPhonenum());
        System.out.println("Message: "+getText());
    }
}
