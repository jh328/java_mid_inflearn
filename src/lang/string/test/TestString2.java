package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            String arrIndex = arr[i]; // 배열의 각 인덱스

            int length = arrIndex.length(); // 각 인덱스의 길이

            System.out.println(arrIndex + ":" + length);

            sum += length;
        }

        System.out.println("sum = " + sum);
    }
}
