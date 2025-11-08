package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    // 모든 이넘을 반환

     public static void main(String[] args) {
        Grade[] values = Grade.values(); // 그냥 추력 하면 참조값 나온다.
        String string = Arrays.toString(values);
        System.out.println("string = " + string);

        for (Grade value : values) {
            System.out.println("value.name( = " + value.name() + ", ordinal " + value.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
