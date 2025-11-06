package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {

        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(1), new MyInteger(2)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    private static MyInteger findValue(MyInteger[] numbers, int target) {
        for (MyInteger myInteger : numbers) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
