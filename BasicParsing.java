import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BasicParsing {
    public static void main(String[] args) {
        String dateStr = "16-06-2025";
        try {
            DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dateStr, dateformat);
            System.out.println("Parsed date : " + date);
        } catch (Exception e) {
            System.out.println("Invalid date format : " + e.getMessage());
        }

        String timeStr = "16:17:00";
        try {
            DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime time = LocalTime.parse(timeStr, timeformat);
            System.out.println("Parsed time : " + time);
        } catch (Exception e) {
            System.out.println("Invalid time format : " + e.getMessage());
        }

        String dateTimeStr = "2025/06/16 04:22 PM";
        try {
            DateTimeFormatter datetimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a").withLocale(Locale.ENGLISH);;
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, datetimeFormat);
            System.out.println("Parsed date - time : " + dateTime);
        } catch (Exception e) {
            System.out.println("Invalid date - time format : " + e.getMessage());
        }
    }
}