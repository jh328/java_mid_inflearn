package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2 = " + str1.equals(str2)); // false
        System.out.println("str1 equalsIgnoreCase str2 = " + str1.equalsIgnoreCase(str2));
        System.out.println("compare to = " + str1.compareTo(str2)); // true
    }
}
