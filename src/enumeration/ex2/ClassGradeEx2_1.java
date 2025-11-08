package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int i1 = discountService.discount(ClassGrade.BASIC, price);
        int i2 = discountService.discount(ClassGrade.GOLD, price);
        int i3 = discountService.discount(ClassGrade.DIAMOND, price);


        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
