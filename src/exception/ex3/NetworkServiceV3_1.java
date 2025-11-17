package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 nc = new NetworkClientV3(address);
        nc.initError(data);

        try {
            nc.connect();
            nc.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("연결 오류 주소 = " + e.getAddress() + ", message = " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("전송 오류 = " + e.getMessage() + ", message = " + e.getMessage());
        }finally {
            nc.disconnect();
        }
    }
}
