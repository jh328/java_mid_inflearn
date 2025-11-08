package enumeration.ref2;

public class EnumRefMin3_3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] values = Grade.values();

        for (Grade grade : values) {
            print(grade, price);
        }
    }

    private static void print(Grade grade, int price) {
        System.out.println(grade.name() + " 등급 할인 금액 = " + grade.percent(price));
    }
}
