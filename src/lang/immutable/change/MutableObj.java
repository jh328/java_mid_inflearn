package lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        System.out.println("생성자 값 = " + value);
        this.value = value;
    }

    public void add(int addValue) {
        value = value + addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
