package lang.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println("max(10,20) = " + Math.max(10,20));
        System.out.println("min(10,20) = " + Math.min(10,20));
        System.out.println("asb(10,20) = " + Math.abs(-100)); // abs는 절대값을 구하는거다. -10, +10 이것도 다 10으로 나온다

        // 반올림 및 정밀도 메서드
        System.out.println("ceil(2.1) = " +  Math.ceil(2.1)); // 올림 3 다 틀렸네,0을 빼버림
        System.out.println("floor(2.1) = " +  Math.floor(2.1)); // 내림 2
        System.out.println("round(2.1) = " + Math.round(2.5)); // 반올림 ?

        // 기타 유용한 메서드
        System.out.println("sqrt(4) = " + Math.sqrt(8));
        System.out.println("random() = " + Math.random());

        // BigDecimal 돈을 가지고 계산을 할 때 굉장히 정밀하게 계산을 해야 할때가 있으면
        // 소수점 올림, 내림부터 포함해서 굉장히 정밀한 돈 계산이 필요할 때 이걸 공부 해보면 도움이 될꺼다.
        // 정산쪽 일하면, bigdecimal 정산쪽은 이걸 공부를 해야 한다.
    }
}
