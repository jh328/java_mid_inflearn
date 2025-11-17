package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            System.out.println("try call before");
            client.call();
            System.out.println("try call after");
        } catch (MyUncheckedException e) {
            System.out.println("catch call before");
            System.out.println("예외"+e.getMessage());
            System.out.println("catch call after");
        }
        System.out.println("정상 로직");
    }

    public void callNotCatch() {
        client.call();
    }
}
