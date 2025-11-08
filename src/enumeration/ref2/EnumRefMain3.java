package enumeration.ref2;

public class EnumRefMain3 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService1 discountService1 = new DiscountService1();
        int basic = discountService1.discount(Grade.BASIC,price);
        int gold = discountService1.discount(Grade.GOLD,price);
        int DIAMOND = discountService1.discount(Grade.DIAMOND,price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("DIAMOND = " + DIAMOND);
    }
}
