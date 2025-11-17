package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV2_1 sv = new NetworkServiceV2_1();
//        NetworkServiceV2_2 sv = new NetworkServiceV2_2();
//        NetworkServiceV2_3 sv = new NetworkServiceV2_3();
//        NetworkServiceV2_4 sv = new NetworkServiceV2_4();
        NetworkServiceV2_5 sv = new NetworkServiceV2_5();

        Scanner sc = new Scanner(System.in);
        // 메세지를 계속 받을꺼다.
        while (true) {
            System.out.print("전송할 문자 = ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            sv.sendMessage(input);
            System.out.println("정상종료");
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
