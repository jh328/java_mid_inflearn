package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;

    /**
     * move elemnet left 단축키
     * 파라미터의 순서를 변경
     * option + shift + command + 방향키
     * */
    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
