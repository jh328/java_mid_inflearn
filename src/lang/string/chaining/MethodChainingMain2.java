package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder valueAdder1 = adder.add(1);
        ValueAdder valueAdder2 = valueAdder1.add(2);
        ValueAdder valueAdder3 = valueAdder2.add(3);


        int result = valueAdder3.getValue();
        System.out.println("result = " + result);

        System.out.println(adder);
        System.out.println(valueAdder1);
        System.out.println(valueAdder2);
        System.out.println(valueAdder3);

    }
}
