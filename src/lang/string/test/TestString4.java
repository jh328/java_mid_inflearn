package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String a = str.substring(0,5);
        String sb = str.substring(5);
        System.out.println("filename = " + a);
        System.out.println("sb = " + sb);
    }
}
