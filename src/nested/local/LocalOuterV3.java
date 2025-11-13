package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역변수임, 스택 영역이고, 메서드 호출 종료되면 스택 프레임이 제거되면서 지역 변수도 삭제, 주기 짧음

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void printer() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("out~ = " + outInstanceVar);
            }
        }
        LocalPrinter lp = new LocalPrinter();
//        lp.printer();
        return lp;
    }

    public static void main(String[] args) {
        LocalOuterV3 v1 = new LocalOuterV3();
        Printer process = v1.process(2); // process에서 반환값이 lp잖아. 반환 값을 process 받았잖아. gc가 안되고 x002 참조값이 main에서 생존하고 있다.
        process.printer();

        System.out.println("필드 확인");
        Field[] fields = process.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
