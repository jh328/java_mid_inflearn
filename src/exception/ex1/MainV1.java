package exception.ex1;


import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
//        NetworkServiceV1_1 sv = new NetworkServiceV1_1();
//        NetworkServiceV1_2 sv = new NetworkServiceV1_2();
        NetworkServiceV1_3 sv = new NetworkServiceV1_3();

        Scanner sc = new Scanner(System.in);
        // 메세지를 계속 받을꺼다.
        while (true) {
            System.out.print("전송할 문자 = ");
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
