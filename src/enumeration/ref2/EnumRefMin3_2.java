package enumeration.ref2;

public class EnumRefMin3_2 {
    public static void main(String[] args) {
        int price = 10000;

        print(Grade.BASIC, price);
        print(Grade.GOLD, price);
        print(Grade.DIAMOND, price);

    }

    private static void print(Grade grade, int price) {
        System.out.println(grade.name() + " 등급 할인 금액 = " + grade.percent(price));
    }
}
