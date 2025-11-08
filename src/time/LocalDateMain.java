package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalDate localDate = LocalDate.of(2025, 11, 11);
        System.out.println("localDate = " + localDate);
        localDate = localDate.plusDays(10);
        System.out.println("localDate = " + localDate);
    }
}
