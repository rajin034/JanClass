package AbstractClassExample;

class Car extends Vehicle {
    private boolean engineStarted;

    @Override
    void startEngine() {
        engineStarted = true;
        System.out.println("Car engine started");
    }

    @Override
    void stopEngine() {
        engineStarted = false;
        System.out.println("Car engine stopped");
    }

    @Override
    void drive() {
        if (engineStarted) {
            System.out.println("Driving car");
        } else {
            System.out.println("Start the engine first");
        }
    }
}