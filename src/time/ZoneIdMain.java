package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZonedId : ZoneId.getAvailableZoneIds()) {
//            System.out.println("availableZonedId = " + availableZonedId);
            ZoneId zoneId = ZoneId.of(availableZonedId);
            System.out.println(zoneId + " / " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = "+zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul"); // 에러 나면 안된다고 했는데 에러 생기면 ZoneRulesException 에러 터짐 Unknown time-zone ID: Asia/Seou1l
        System.out.println("zoneId1 = " + zoneId1);
    }
}
