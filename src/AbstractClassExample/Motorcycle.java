package AbstractClassExample;

class Motorcycle extends Vehicle {
    private boolean engineStarted;

    @Override
    void startEngine() {
        engineStarted = true;
        System.out.println("Motorcycle engine started");
    }

    @Override
    void stopEngine() {
        engineStarted = false;
        System.out.println("Motorcycle engine stopped");
    }

    @Override
    void drive() {
        if (engineStarted) {
            System.out.println("Driving motorcycle");
        } else {
            System.out.println("Start the engine first");
        }
    }
}
