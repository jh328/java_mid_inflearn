package exception.ex3;


import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)  {
        NetworkServiceV3_1 sv = new NetworkServiceV3_1();

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
