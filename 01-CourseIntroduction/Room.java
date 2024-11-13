
public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    public Room(int number){
        this.number = number;
        this.beds = 2;
    }
    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    public void checkin(String guestName){
        this.guestName =guestName;
        this.occupied = true;
    }
    public void checkout(){
        this.guestName = "";
        this.occupied = false;
    }
    public boolean isOccupied(){
        return this.occupied;
    }
    public void displayStatus(){
        System.out.printf("Room: %d %n Beds: %d %n Occupied %b %n Name: %s", this.number,this.beds, this.occupied, this.guestName);
    }

    @Override
    public String toString() {
        return String.format("Room: %d | Beds: %d | Occupied: %b | Guest Name: %s",
                this.number, this.beds, this.occupied, this.guestName);
    }
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(101);
        rooms[1] = new Room(102);
        rooms[2] = new Room(103);
        rooms[3] = new Room(104, 3);
        rooms[4] = new Room(105, 3);
        rooms[5] = new Room(106, 1);

        rooms[3].displayStatus();
        for (Room room : rooms) {
            System.out.println(room);
        }
        rooms[0].checkin("John Doe");
        rooms[3].checkin("Alice Smith");
        
        // a. Display the status of a single room (e.g., room 101)
        System.out.println("Status of room 101:");
        System.out.println(rooms[0].toString());
    }


}
