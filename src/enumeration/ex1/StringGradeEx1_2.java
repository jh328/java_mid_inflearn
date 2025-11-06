package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;
        enumeration.ex0.DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int GOLD = discountService.discount("GOLD", price);
        int DIAMOND = discountService.discount("DIAMOND", price);

        System.out.println("basic = " + basic);
        System.out.println("GOLD = " + GOLD);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
