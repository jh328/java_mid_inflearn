package exception.ex3;


import exception.ex2.NetworkClientExceptionV2;
import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 nc = new NetworkClientV3(address);
        nc.initError(data);

        try {
            nc.connect();
            nc.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("연결 오류 = " + e.getAddress() + ", message = " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("전송 오류 = " + e.getMessage() + ", message = " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 오류 = " + e.getMessage());
        } finally {
            nc.disconnect();
        }
    }
}
