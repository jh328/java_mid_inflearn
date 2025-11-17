package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 nc = new NetworkClientV2(address);
        nc.initError(data);

        /**
         * 컴파일 에러가 나올 때 option + enter 누르면
         * 1. Add excetpion to method signature,
         * 2. Surround with try/catch가 나옴.
         * 1번 밖으로 던지는거 / 2번 내가 해결 하는거 내가 코딩을 안하더라도 인텔리제이가 해줌.
         * 하지만 손으로 직접 치기
         * */
        try {
            nc.connect();
            nc.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드 = " + e.getErrorCode() + ", message = " + e.getMessage());
            System.out.println("catch block end");
        } finally {
            System.out.println("finally block start");
            nc.disconnect();
            System.out.println("finally block end");
        }
    }
}
