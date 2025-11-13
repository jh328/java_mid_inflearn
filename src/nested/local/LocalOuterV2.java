package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void printer() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("out~ = " + outInstanceVar);
                System.out.println("상속");
            }
        }
        LocalPrinter lp = new LocalPrinter();
        lp.printer();
    }

    public static void main(String[] args) {
        LocalOuterV2 v1 = new LocalOuterV2();
        v1.process(2);
    }
}
