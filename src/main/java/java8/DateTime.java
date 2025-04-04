package java8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args) {
//        Not thread safe : Unlike old java.util.Date which is not thread safe the new date-time API is immutable and doesn’t have setter methods.

//        LocalDate/LocalTime and LocalDateTime API : Use it when time zones are NOT required.

        LocalDateTime localDateTime=LocalDateTime.parse("2024-10-13T23:34:47.0");
        System.out.println(localDateTime);

////        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d/M/y h:m a", Locale.UK);
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d'th' MMM uuuu h:m", Locale.CANADA_FRENCH);
//        String tempDate=localDateTime.format(dateTimeFormatter);
//        System.out.println(tempDate);


//        Duration duration=Duration.ofHours(2);
//        System.out.println(localDateTime.plus(duration));


        System.out.println(localDateTime.plus(2, ChronoUnit.WEEKS));


    }
}
