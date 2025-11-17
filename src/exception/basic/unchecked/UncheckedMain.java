package exception.basic.unchecked;

public class UncheckedMain {
    public static void main(String[] args) {
        System.out.println("시작1");
        Service service = new Service();
        System.out.println("시작2");
        service.callCatch();
        System.out.println("끝");
    }
}
