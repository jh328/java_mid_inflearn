package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

//        action(dog);
        action(car);
    }

    /**
     * 모든것을 담을 수 있는게 Object
     * */
    private static void action(Object object) {
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
