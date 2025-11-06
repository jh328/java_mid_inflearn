package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, 3};

        System.out.println(findValue(numbers, -1)); // 있으니 -1 자기 자신 값 호출?
        System.out.println(findValue(numbers, 0)); // 있으니 -1 자기 자신 값 호출?
        System.out.println(findValue(numbers, 1)); // 있으니 -1 자기 자신 값 호출?
        System.out.println(findValue(numbers, 100)); // 있으니 -1 자기 자신 값 호출?

    }

    private static int findValue(int[] numbers, int target) {
        for (int value : numbers) {
            if (value == target) {
                System.out.println("여기 " + value);
                return value;
            }
        }
        return -1;
    }
}
