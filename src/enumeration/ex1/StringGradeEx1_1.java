package enumeration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int GOLD = discountService.discount(StringGrade.GOLD, price);
        int DIAMOND = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
