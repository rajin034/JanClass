package inheritanceExamples;

class Truck extends Vehicle {
  int cargoCapacity;
  String st = "i am field of child class.";

  public void attachTrailer() {
    System.out.println("trailerAttached");
  }
  
  public void displayProperties() {
    System.out.println("Truck has " + super.wheels + " wheels");
    System.out.println("Truck can carry " + super.passengers + " passengers");
    System.out.println("Truck has cargo capacity of " + cargoCapacity + " kg");
    super.startEngine();
    attachTrailer();
    System.out.println(super.st);
    System.out.println(st);
  }
}
