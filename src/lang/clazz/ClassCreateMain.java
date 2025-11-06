package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();// 이 메소드는  헬로우 클래스가 가진 생성자를 얻어서 객체를 생성하는 의미로 보면 된다.
// 반환을 하면 오브젝트가 된다.
        String result = hello.hello();
        System.out.println("result = " + result);
        System.out.println("hello = " + hello);

    }
}
