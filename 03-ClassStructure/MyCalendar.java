public class MyCalendar {
    static int day = 23;
    static int month = 10;
    static int year = 2024;
    static String MyDate(){
        return String.format("%4d-%02d-%02d", year, month, day);
    }

    public static void main(String[] args) {
        System.out.println(MyDate());
        System.out.println(MonthName());
    }
    static String MonthName(){
        String [] Names = {"J", "F", "March", "Ap", "May", "June", "July", "Au", "S", "O", "N", "D"};
        return Names[month-1];
    }
    static int Days(){
        int [] dayscount = {31,28,31,30,31, 30,31,31,30,31,30,31};
        switch (months)
    }
}
