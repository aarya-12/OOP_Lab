import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    
    static String DATE_FORMAT = "dd-MM-yyyy hh:mm:ss a";
    public static void main(String[] args) {
        
        //Creating time class object
        MyTime m1 = new MyTime(4,6,2022,10,15,55,"PM");
        //Add a Zero at the beginning if day or month is less than 10
        String d = Integer.toString(m1.day);
        String m = Integer.toString(m1.month);
        if(m1.day < 10) {
            d = "0" + m1.day;
}
        if(m1.month < 10) {
            m = "0" + m1.month;
}
        //Declaring the reuored Datwe Format ie "04-06-2022 10:15:55 AM"
        String dateIString = d + "-" + m + "-" + m1.year + " " + m1.hour +
":" + m1.min + ":" + m1.sec + " " + m1.ampm;
        //Creating LocalDateTime object
        LocalDateTime ldt =
LocalDateTime.parse(dateIString,DateTimeFormatter.ofPattern(DATE_FORMAT));
        //Create a Zone ID
ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
        System.out.println("TimeZone: " + indiaZoneId);
        ZonedDateTime asiaZonedDateTime = ldt.atZone(indiaZoneId);
        System.out.println("Date (India): " + asiaZonedDateTime);
        //Creating another Zone ID
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        System.out.println("TimeZone: " + newYorkZoneId);
        ZonedDateTime nyDateTime =
asiaZonedDateTime.withZoneSameInstant(newYorkZoneId);
        System.out.println("Date (New York): " + nyDateTime);
        DateTimeFormatter format =
DateTimeFormatter.ofPattern(DATE_FORMAT);
        System.out.println("\n---DateTimeFormatter---");
        System.out.println("Date (India): " +
format.format(asiaZonedDateTime));
        System.out.println("Date (New York): " +
format.format(nyDateTime));
    }
}