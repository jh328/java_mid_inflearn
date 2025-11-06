package lang.math.test;

import java.util.Random;

/**
 * 로또 번호 1~45 숫자 6개 뽑아야 하고, 각 숫자는 중복이 되면 안된다.
 */
public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1 ~45 숫자 생성
            int number = random.nextInt(45 + 1);

            // 중복되지 않는 값만 배열에 추가하기
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }

        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < number; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
