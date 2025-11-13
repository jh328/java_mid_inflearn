package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 nc = new NetworkClientV0(address);

        nc.connect();
        nc.send(data);
        nc.disconnect();
    }
}
