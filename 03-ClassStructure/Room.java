public class Room {
    public int number;
    public int beds;
    public boolean occupied;
    public String guestname;

    public Room(int number){
        this.number = number;
        this.beds = 2;
        this.occupied = false;
    }
    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
        this.occupied = false;
    }
    public void checkin(String guestname){
        this.guestname = guestname;
    }
    public void checkout(){
        this.guestname = "";
    }
    public boolean isOccuppied(){
        return occupied;
    }
    public void displaystatus(){
        System.out.println("Guestname: "+guestname+"room number: "+number);
    }
    


}
