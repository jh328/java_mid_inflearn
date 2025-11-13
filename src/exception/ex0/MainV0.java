package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 sv = new NetworkServiceV0();

        Scanner sc = new Scanner(System.in);
        // 메세지를 계속 받을꺼다.
        while (true) {
            System.out.println("전송할 문자 = ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            sv.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
