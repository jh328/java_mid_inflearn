package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = " hello Java";
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("문자열 비어 있는지 : " + str.isEmpty());
        System.out.println("문자열이 공백인지 : " + str.isBlank());
        char c = str.charAt(9);
        System.out.println(c);
    }
}
