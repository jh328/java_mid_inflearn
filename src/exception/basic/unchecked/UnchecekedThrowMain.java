package exception.basic.unchecked;

public class UnchecekedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callNotCatch();
        System.out.println("끝");
    }
}
