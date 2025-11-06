package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int GOLD = discountService.discount("GOLD", price);
        int DIAMOND = discountService.discount("DIAMOND", price);

        System.out.println("basic = " + basic);
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
