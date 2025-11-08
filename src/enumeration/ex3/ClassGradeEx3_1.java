package enumeration.ex3;


public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int i1 = discountService.discount(Grade.BASIC, price);
        int i2 = discountService.discount(Grade.GOLD, price);
        int i3 = discountService.discount(Grade.DIAMOND, price);


        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
