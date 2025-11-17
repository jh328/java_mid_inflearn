package exception.basic.checked;

public class MyCheckedException extends Exception {
    /**
     * 메세지를 보관 하는 이유는
     * 예외가 터지게 되면 그거에 대한 이유를 알려줘야 하기 때문이다.
     * */
    public MyCheckedException(String message) {
        super(message);
    }
}
