package AbstractClassExample;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
    abstract void drive();
    void abstractClassMethod(){
        System.out.println("i am method of abstract class");
    }
    static void abstractStaticMethod(){
        System.out.println("static method of abstract class");
    }
}