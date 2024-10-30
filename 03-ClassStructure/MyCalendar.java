public class MyCalendar {
    static int day = 23;
    static int month = 10;
    static int year = 2024;
    static String MyDate(){
        return String.format("%4d-%02d-%02d", year, month, day);
    }

    public static void main(String[] args) {
        System.out.println(MyDate());
        System.out.println("Monht: "+MonthName());
        System.out.println(days());
    }
    static String MonthName(){
        String [] Names = {"J", "F", "March", "Ap", "May", "June", "July", "Au", "S", "O", "N", "D"};
        return Names[month-1];
    }
    public static int days() {
        int daysPassed = 0;
        switch (month - 1) {
            case 12: daysPassed += 31; // December
            case 11: daysPassed += 30; // November
            case 10: daysPassed += 31; // October
            case 9: daysPassed += 30; // September
            case 8: daysPassed += 31; // August
            case 7: daysPassed += 31; // July
            case 6: daysPassed += 30; // June
            case 5: daysPassed += 31; // May
            case 4: daysPassed += 30; // April
            case 3: daysPassed += 31; // March
            case 2: daysPassed += 28; // February
            case 1: daysPassed += 31; // January
            case 0: daysPassed += day;break; // days of current month
            default: break; // Default case
        }
        return daysPassed;

    }
}
