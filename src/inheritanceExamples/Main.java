package inheritanceExamples;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.wheels = 4;
    car.passengers = 5;
    car.doors = 4;
    car.displayProperties();
    System.out.println();


    Truck truck = new Truck();
    truck.wheels = 6;
    truck.passengers = 2;
    truck.cargoCapacity = 10000;
    truck.displayProperties();
  }
}
