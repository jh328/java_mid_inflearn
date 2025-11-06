package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime = " + currentNanoTime);

        System.out.println("get.env = " + System.getenv());

        System.out.println("properties = " +  System.getProperties());
        System.out.println("java version = " + System.getProperty("java.version"));

/**
 * 배열이 하나 있다고 하면
 * 변수에 복사를 할꺼다.원래 반복문을 돌리면서 하나하나 돌리면서 넣고 해야 한다.
 * 근데 이렇게 하게 될 경우 느리다.
 * 운영체제에서는 arraycopy라는걸 지원을 해준다.
 * 이거의 핵심은 Array.toString이 아닌 arraycopy 이걸 하니깐 복사가된게 보인다.
 * 원래라면 반복문으로 하나하나 해야 하는데, arraycopy 운영체네, 시스템 레벨에 던지고, 복사해주라고 던지면
 * 운영체제, 하드웨어레벨에서 배열을 통체로 복사를 한방에 한다.
 * 그래서 속도가 고이장히 빠르다.(시스템마다 다르지만 두배 이상 빠를꺼다.)
 * */
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copyArray = new char[5];
        System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);
        System.out.println("copyArray = " + copyArray);
        System.out.println("copyArray.toString = " + Arrays.toString(copyArray));

        System.exit(0); // 여기서 끝나기 때문에 아래 로그가 안나온다.
        System.out.println("copyArray asdfsafsdafas= " );
    }
}
