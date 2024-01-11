import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    public static void main(String[] args) {
        String inputDate = "2024-01-27";
        String[] dateParts = inputDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        String[] months = {
                "", "January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"
        };
        String monthName = months[month];
        String outputDate = monthName + " " + day + ", " + year;
        System.out.println(outputDate);
    }
}
