package exception.ex1;


public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 nc = new NetworkClientV1(address);
        nc.initError(data);


        String res = nc.connect();

        /**
         * if문 이해하기 어렵다.
         * 사람이 부정이라는걸 이해하기 어렵다
         * 결과가 성공이 아니다 -> 오류다 이 말인데,
         * 여러분 결과가 성공이 아니다 이 말이, 성공을 뒤집는게 쉬울까요? 오류다 이 말이 쉬울까요?
         *
         * control + T 입력 후 method 혹은 option + command + m 입력 ( Extract Method )
         * 결과가 성공이 아니다 , 오류다 둘 중에 오류다 이 말이 훨씬 쉽게 이해가 된다.
         * 성공이 아니다 이 말은 실패다 이렇게 뇌를 돌려야 한다.
         * 그것보다 오류다 훨씬 이해하기 쉽다
         *
         * 이런 경우에 메서드로 뽑으면 쉽고, 메서드 이름으로 복잡한거를 축약을 할 수 있다.
         *
         * */
        if (!isError(res)) {
            System.out.println("에러 발생 : " + res);
            return;
        }

        String res1 = nc.send(data);
        if (!isError(res1)) {
            System.out.println("에러 발생 : " + res1);
            return;
        }

        nc.disconnect();
    }

    private static boolean isError(String res) {
        return res.equals("success");
    }
}
