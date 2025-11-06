package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj add = obj.add(20);

        System.out.println("obj = " + obj.getValue());
        System.out.println("add.getValue() = " + add.getValue());
    }
}
