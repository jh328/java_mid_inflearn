package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);

        // 범위로 조회 하는 법 10을 인수로 주면 0~9까지
        int randomRange = random.nextInt(10);
        System.out.println("randomRange = " + randomRange);

        // 1~10 출력은 + 1 하면 된다.
        int randomRange1 = random.nextInt(10 + 1);
        System.out.println("randomRange1 = " + randomRange1);
    }
}
