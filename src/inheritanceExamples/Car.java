package inheritanceExamples;

public class Car extends Vehicle{
    int doors;
    public void honkHorn(){
        System.out.println("Horn Honked");
    }
    @Override
    public void startEngine(){
        System.out.println("cars' engine started");
    }
    public void displayProperties(){
        System.out.println("Car has " + wheels );
        System.out.println("Car can carry " + passengers + " passengers");
        System.out.println("Car has " + doors + " doors");
        super.startEngine();
        startEngine();
        honkHorn();
    }
}
