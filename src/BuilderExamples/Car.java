package BuilderExamples;

public class Car {
    private String brand;
    private String color;
    private boolean isManual;
    private boolean isAWD;

    public String getBand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
    public boolean isManual(){
        return isManual;
    }
    public boolean isAWD(){
        return isAWD;
    }
    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.color = builder.color;
        this.isManual = builder.isManual;
        this.isAWD = builder.isAWD;

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isManual=" + isManual +
                ", isAWD=" + isAWD +
                '}';
    }

    public static class CarBuilder{
        private String brand;
        private String color;
        private boolean isManual;
        private boolean isAWD;

        public CarBuilder(String brand, String color){
            this.brand = brand;
            this.color = color;


        }
        public CarBuilder setManual(boolean isManual){
            this.isManual= isManual;
            return this;
        }
        public CarBuilder setAWD(boolean isAWD){
            this.isAWD= isAWD;
            return this;
        }
        public Car build(){
            return new Car(this);
        }




    }


}