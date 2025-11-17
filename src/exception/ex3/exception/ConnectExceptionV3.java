package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    /**
     * move elemnet left 단축키
     * 파라미터의 순서를 변경
     * option + shift + command + 방향키
     * */
    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
