package advance.session5;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeApplication {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        System.out.println("now.withDayOfMonth(1) = " + now.withDayOfMonth(1));
        System.out.println("now.withMonth(2) = " + now.withMonth(2));

        LocalTime now1 = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//        System.out.println("dateTimeFormatter.format(now) = " + dateTimeFormatter.format(now));
        System.out.println("dateTimeFormatter.format(now) = " + dateTimeFormatter.format(dateTime));


        ZonedDateTime zonedDateTime = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Darwin"));
        ZonedDateTime zonedDateTimeSydney = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("zonedDateTime.format(dateTimeFormatter) = " + zonedDateTime.format(dateTimeFormatter));
        System.out.println("zonedDateTimeSydney.format(dateTimeFormatter) = " + zonedDateTimeSydney.format(dateTimeFormatter));


        Period between = Period.between(LocalDate.now(), LocalDate.now().withMonth(2).withDayOfMonth(10));
        System.out.println("between = " + between);

    }
}
