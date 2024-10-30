public class dc7 {
    public static void main(String[] args) {
        // Create two instances of CinemaTicket for the movie "Gladiator"
        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 2, 5); // First ticket in row 2
        CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7, 10); // Second ticket in row 7

        // Print the created tickets
        System.out.println(ticket1.toString());
        System.out.println(); // Print a blank line for better readability
        System.out.println(ticket2.toString());
    }
}

// Standalone CinemaTicket class
class CinemaTicket {
    static String cinemaName = "Morning Star Cinema"; // Static variable for cinema name
    String filmTitle; // Film title
    int row; // Row number
    int seat; // Seat number
    float price; // Price of the ticket

    // Constructor for CinemaTicket
    public CinemaTicket(String title, int rowNumber, int seatNumber) {
        filmTitle = title; // Assign the title parameter to the instance variable
        row = rowNumber;   // Assign the rowNumber parameter to the instance variable
        seat = seatNumber; // Assign the seatNumber parameter to the instance variable
        price = calculatePrice(rowNumber); // Calculate price based on row number
    }

    // Method to calculate ticket price based on row
    private float calculatePrice(int rowNumber) {
        if (rowNumber <= 2) {
            return 10.0f; // Price for first two rows
        } else {
            return 25.0f; // Price for remaining rows
        }
    }

    // toString method to return ticket details
    public String toString() {
        return "Cinema: " + cinemaName + "\n" +
               "Film Title: " + filmTitle + "\n" +
               "Row: " + row + "\n" +
               "Seat: " + seat + "\n" +
               "Price: PLN " + price; // Display price in PLN
    }
}