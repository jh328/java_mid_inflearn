package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 nc = new NetworkClientV5(address)) {
            nc.initError(data);
            nc.connect();
            nc.send(data);
        } catch (Exception e) {
            System.out.println("예외 확인 = " + e.getMessage());
            throw e;
        }
    }
}
