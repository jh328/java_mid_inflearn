package enumeration.ref1;



public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;

        DisCountService discountService = new DisCountService();

        System.out.println("BASCI = " + discountService.discount(ClassGrade.BASIC, price));
        System.out.println("GOLD = " + discountService.discount(ClassGrade.GOLD, price));
        System.out.println("DIAMOND = " + discountService.discount(ClassGrade.DIAMOND, price));

    }
}
