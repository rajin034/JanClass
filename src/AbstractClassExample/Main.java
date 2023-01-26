package AbstractClassExample;

import static AbstractClassExample.Vehicle.abstractStaticMethod;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        car.drive();
        car.stopEngine();
        car.drive();
        car.abstractClassMethod();

        motorcycle.startEngine();
        motorcycle.drive();
        motorcycle.stopEngine();
        motorcycle.abstractClassMethod();
        abstractStaticMethod();
    }
}