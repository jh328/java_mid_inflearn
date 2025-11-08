package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime ofTime = LocalTime.of(1, 10,50);

        System.out.println("now = " + now);
        System.out.println("ofTime = " + ofTime);

        ofTime = ofTime.plusSeconds(10);
        System.out.println("ofTime = " + ofTime);
    }
}
