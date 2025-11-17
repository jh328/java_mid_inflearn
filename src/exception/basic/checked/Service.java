package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 예외를 처리
     * */
    public void callCatch() {
        try {
            System.out.println("callCatch try call Before"); // 1 번
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("callCatch catch call Before");
            System.out.println("예외 처리 message = " + e.getMessage());
            System.out.println("callCatch catch call After");
        }
        System.out.println("정상 흐름");
    }


    /**
     * 예외를 밖으로 던짐
     */
    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}
