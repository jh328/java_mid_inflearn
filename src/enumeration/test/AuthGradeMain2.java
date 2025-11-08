package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       /* System.out.println("당신의 등급을 입력하세요 [게스트,사용자,관리자] 사용자");
        System.out.println("당신의 등급은 손님이빈다.");
        System.out.println("== 메뉴 목록 ==");
        System.out.println("- 메인 화면");

        System.out.println("당신의 등급을 입력하세요 [게스트,사용자,관리자] 로그인 ");
        System.out.println("당신의 등급은 손님이빈다.");
        System.out.println("== 메뉴 목록 ==");
        System.out.println("- 이메일 관리 화면");

        System.out.println("당신의 등급을 입력하세요 [게스트,사용자,관리자] 관리자 ");
        System.out.println("당신의 등급은 손님이빈다.");
        System.out.println("== 메뉴 목록 ==");
        System.out.println("- 관리자 관리 화면");
*/
        String nl = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(nl.toUpperCase());
        System.out.println("당신의 등급은 = " + authGrade.getDescription() + " 입니다");

    }
}
