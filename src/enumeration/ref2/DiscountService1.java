package enumeration.ref2;

public class DiscountService1 {
    public int discount(Grade grade, int price) {
        return grade.percent(price);
    }
}
