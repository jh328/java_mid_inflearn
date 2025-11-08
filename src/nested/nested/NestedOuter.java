package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신 멤버에 접근
            System.out.println("nestedInstanceValue "+nestedInstanceValue);

            // 바깥 클래스 접근 static 없는거
//            System.out.println(outInstanceValue);

            // 바깥 클래스 static 있는거 접근
//            System.out.println(NestedOuter.outClassValue);
            System.out.println("outClassValue ="+outClassValue);

        }
    }
}
