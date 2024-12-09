public class Writer {
    private String name;
    private String surname;

    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String toString(){
        return "Author first name: "+this.name+"\nAuthor last name: "+this.surname;
    }



}
