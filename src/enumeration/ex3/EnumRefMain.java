package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Class BASIC = " + Grade.BASIC.getClass());
        System.out.println("Class GOLD = " + Grade.GOLD.getClass());
        System.out.println("Class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("+==============================+");

        /**
         * 이걸 돌리면 toString을 오버라이딩 해버린다.
         * enum 같은 경우에는 toString으로 자동으로 오버라이딩이 된다.
         * 자기 상수 이름으로 toString이 되는거다.
         *
         * 참조값을 보고 싶으니 메서드를 만들자.
         * */
        System.out.println("ref  BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref  BASIC = " + refValue(Grade.GOLD));
        System.out.println("ref  BASIC = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
