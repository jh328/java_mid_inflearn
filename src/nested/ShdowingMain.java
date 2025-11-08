package nested;

public class ShdowingMain {
    public int value = 1;

    class Inner{
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println(this.value);
            System.out.println(ShdowingMain.this.value);
        }

    }

    public static void main(String[] args) {
        ShdowingMain s = new ShdowingMain();
        Inner inner = s.new Inner();
        inner.go();

    }
}
