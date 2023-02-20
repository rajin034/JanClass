package FactoryExamples;

public abstract class Phone {
    public abstract String getName();
    public abstract String getColor();
    public abstract double getPrice();

    @Override
    public String toString(){
        return "name: " + this.getName()+ " color: "+ this.getColor()+ " price:" + this.getPrice();
    }

}