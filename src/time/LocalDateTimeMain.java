package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime localDateTime = LocalDateTime.of(2016, 3, 2, 9, 8, 30);
        System.out.println("localDateTime = " + localDateTime);

        LocalDate localDate = now.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = now.toLocalTime();
        System.out.println("lcoalTime = " + localTime);

        LocalDateTime plus = LocalDateTime.of(localDate, localTime);
        System.out.println("puls = " + plus);

        System.out.println("16년도 = " + localDateTime);
        LocalDateTime localDateTime3544 = localDateTime.plusDays(3544);
        System.out.println("localDateTime3544 = " + localDateTime3544);

        LocalDateTime localDateTimeYear = localDateTime.plusYears(1);
        System.out.println("localDateTimeYear = " + localDateTimeYear);

        System.out.println("날짜 비교 이전 = " + now.isBefore(localDateTime));
        System.out.println("날짜 비교 이후 = " + now.isAfter(localDateTime));
        System.out.println("날짜 같은지 = " + now.isEqual(localDateTime));
    }
}
