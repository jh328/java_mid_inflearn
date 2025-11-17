package exception.ex2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 nc = new NetworkClientV2(address);
        nc.initError(data);
        nc.connect();
        nc.send(data);
        nc.disconnect();
    }
}
