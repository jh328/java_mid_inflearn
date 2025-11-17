package exception.basic.unchecked;

public class Client {
    public void call() {
        System.out.println("call throw before");
        throw new MyUncheckedException("ex");
    }
}
