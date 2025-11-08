package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HTTP CODE : ");

        int httpCodeInput = sc.nextInt();

        HttpStatus byCode = HttpStatus.findByCode(httpCodeInput);

        if (byCode == null) {
            System.out.println("코드 x");
        }else{
            System.out.println(byCode.getCode() + "  " + byCode.getMessage());
            System.out.println("isSuccess = " + byCode.isSuccess());
        }
    }
}
