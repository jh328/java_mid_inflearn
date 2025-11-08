package enumeration.ref1;

public class DisCountService {

    public int discount(ClassGrade classGrade, int price) {
        System.out.println("classGrade = " + classGrade);
        System.out.println("classGrade.getDiscountPercent() = " + classGrade.getDiscountPercent());
        return price * classGrade.getDiscountPercent() / 100;
    }
}
