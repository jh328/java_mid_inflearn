package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] arrays = {"1.5", "2.5", "3.0"};

        double sum = 0;

        for (String s : arrays) {
            double v = Double.parseDouble(s);
            sum += v;
        }

        System.out.println("sum = " + sum);
    }
}
