package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 nc = new NetworkClientV4(address);
        nc.initError(data);

        try {
            nc.connect();
            nc.send(data);
        } finally {
            nc.disconnect();
        }
    }
}
