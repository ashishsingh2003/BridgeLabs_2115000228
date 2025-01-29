import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
public class TimeZone {

    public static void displayTimeInTimeZone(String zone) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(zone + ": " + currentTime.format(formatter));
    }

    public static void main(String[] args) {
        System.out.println("Current time in different time zones:");
        displayTimeInTimeZone("GMT");  // Greenwich Mean Time
        displayTimeInTimeZone("Asia/Kolkata");  // Indian Standard Time (IST)
        displayTimeInTimeZone("America/Los_Angeles");  // Pacific Standard Time (PST)
    }
}
