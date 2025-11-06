package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {
        // str에서 .txt 문자열이 언제 시작하는지 위치 찾기 indexOf()
        String str = "hello.txt";

        int age = str.indexOf(".txt");
        System.out.println(age);
    }
}
