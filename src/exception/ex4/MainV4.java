package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 sv = new NetworkServiceV4();
        NetworkServiceV5 sv = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);
        // 메세지를 계속 받을꺼다.
        while (true) {
            System.out.print("전송할 문자 = ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                sv.sendMessage(input);
            } catch (Exception e) {
                System.out.println("e = " + e);
                exceptionHandler(e);
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("고객센터에 문의");
        System.out.println("===== 개발자용 디버깅 메시지====");
        e.printStackTrace(System.out); // 스택 트레이스

        if (e instanceof SendExceptionV4 s) {
            System.out.println("s = "+s.getSendData());
        }
    }
}
