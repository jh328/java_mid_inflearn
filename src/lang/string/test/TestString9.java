package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@examplce.com";
        String[] strArr = email.split("@");
        String ID = strArr[0];
        String d = strArr[1];
        System.out.println("ID = " + ID);
        System.out.println("d = " + d);
    }
}
